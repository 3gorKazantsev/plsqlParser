package com.ekazantsev.app;

import com.ekazantsev.grammar.PlSqlLexer;
import com.ekazantsev.grammar.PlSqlParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Parser {

    private static List<String> listStr = new ArrayList<>();
    private static StringBuilder fileString = new StringBuilder();

    private static CharStream cs = null;
    private static CaseChangingCharStream upper = null;
    private static PlSqlLexer lexer = null;
    private static CommonTokenStream tokens = null;
    private static PlSqlParser parser = null;
    private static ParseTree mainTree = null;

    // метод, который обрабатывает входную папку
    public static void processFolder(File folder) {
        File[] folderEntries = folder.listFiles();

        for (File entry : folderEntries) {
            if (entry.isDirectory()) {
                processFolder(entry);
                continue;
            }

            // создаем путь до будущего JSON файла
            String pathToJson = makeJsonPath(entry);

            // строим дерево и сохраняем его
            parse(entry.getPath(), pathToJson);

            // удаляем sql файл
            entry.deleteOnExit();
        }
    }

    // метод, который строит ParseTree и сохраняет его JSON файл
    public static void parse(String inputFile, String outputFile) {
        try {
            // если последние символы входного файла - .sql - запускаем парсер
            String type = inputFile.substring(inputFile.length() - 4);
            if (type.equals(".sql")) {
                // подготовка к созданию дерева:
                // 1. раскладываем файл на строки, каждую строку кладем в список, как отдельный элемент
                listStr = Files.readAllLines(Paths.get(inputFile), Charset.forName("Windows-1251"));
                // 1. список преобразовываем в строку
                fileString = new StringBuilder();
                for (String str : listStr) {
                    fileString.append(str).append("\n");
                }
                // 1. кладем готовую строку в CharStream
                cs = CharStreams.fromString(fileString.toString());
                upper = new CaseChangingCharStream(cs, true);
                // 2. 3. 4. создаем лексеры, токены и парсеры
                lexer = new PlSqlLexer(upper);
                tokens = new CommonTokenStream(lexer);
                parser = new PlSqlParser(tokens);
                // создаем дерево
                mainTree = parser.sql_script();

                // массив, в котором будут храниться дети
                ArrayList<ParseTree> listTree = new ArrayList<>();
                // дерево, в котом будут храниться правильные дети
                ParserRuleContext resultTree = ParserRuleContext.EMPTY;

                // обработка: не содержит ли ребенок ошибки
                for (int i = 0; i < mainTree.getChildCount(); i++) {
                    // если текущий ребенок созданного дерева содержит ошибки
                    // (дети ребенка == null и payload ребенка не содержит "[@"
                    // (это значит ребенок не <EOF> или ;) )
                    if (mainTree.getChild(i).getChild(0) == null &&
                            !mainTree.getChild(i).getPayload().toString().contains("[@")) {

                        if (i != 0) {
                            // получаем предшествующего ребенка ребенку с ошибкой
                            ParseTree prevChild = mainTree.getChild(i - 1);
                            // получаем payload из prevChild
                            String payload = prevChild.getPayload().toString();
                            // временный ребенок для получения номера строки
                            ParseTree tmpChild = prevChild;

                            // получаем payload строки prevChild
                            while (!payload.contains("[@")) {
                                // количество детей ребенка
                                int childCount = tmpChild.getChildCount();
                                // получаем последнего ребенка ребенка
                                tmpChild = tmpChild.getChild(childCount - 1);
                                // берем payload из prevChild
                                payload = tmpChild.getPayload().toString();
                            }
                            // записываем номер строки prevChild
                            int line = getLineByPayload(payload);

                            // в line записываем номер строки с ошибкой
                            while (listStr.get(line + 1).trim().length() == 0){
                                line++;
                            }
                            line++;

                            // удаляем все строки до строки с ошибкой (включительно) из массива со строками SQL файла
                            for (int j = 0; j <= line; j++) {
                                listStr.remove(0);
                            }

                            // обновляем строку, которая содержит SQL файл в текстовом виде
                            // и список с этим же файлом
                            refreshString();

                            // обновляем CharStream, лексер, токены, парсер
                            // и дерево
                            refreshTree();

                            // обнуляем счетчик
                            i = -1;
                        } else {
                            // обновляем строку, которая содержит SQL файл в текстовом виде
                            // и список с этим же файлом
                            refreshString();

                            // обновляем CharStream, лексер, токены, парсер
                            // и дерево
                            refreshTree();
                        }
                    } else {
                        listTree.add(mainTree.getChild(i));
                        resultTree.addAnyChild(mainTree.getChild(i));
                    }
                }

                // сохраняем дерево
                Convert.saveTree(resultTree, outputFile);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // метод, которые создает путь до будущего JSON файла
    private static String makeJsonPath(File entry) {
        // в pathToJson кладем путь до sql файла
        String pathToJson = entry.getPath();
        // удаляем последние 3 символа (sql)
        pathToJson = pathToJson.substring(0, pathToJson.length() - 3);
        // добавляем json в конец строки и получается имя до будущего .json файла
        pathToJson = pathToJson + "json";

        return pathToJson;
    }

    // метод, который вытягивает номер строки из parseTree.getPayload()
    private static int getLineByPayload(String payload) {
        int chars1 = payload.indexOf(",<");
        payload = payload.substring(chars1);
        int chars2 = payload.indexOf(">,");
        int chars3 = payload.indexOf(":");
        int line = Integer.parseInt(payload.substring(chars2 + 2, chars3));

        return line;
    }

    // метод, который обновляет строку и список строк
    private static void refreshString() {
        // очищаем строку полностью, в которой хранится SQL файл в текстовом виде
        fileString.delete(0, fileString.length());
        // оставшиеся строки в листе преобразовываем в строку
        for (String str : listStr) {
            fileString.append(str).append("\n");
        }
    }

    private static void refreshTree() {
        // обновляем CharStream готовой строкой
        cs = CharStreams.fromString(fileString.toString());
        upper = new CaseChangingCharStream(cs, true);
        // обновляем лексеры, токены и парсеры
        lexer = new PlSqlLexer(upper);
        tokens = new CommonTokenStream(lexer);
        parser = new PlSqlParser(tokens);
        // обновляем дерево
        mainTree = parser.sql_script();
    }
}