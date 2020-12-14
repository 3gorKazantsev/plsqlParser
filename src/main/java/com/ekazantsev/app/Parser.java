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
                List<String> listStr = Files.readAllLines(Paths.get(inputFile), /*Charset.defaultCharset()*/ Charset.forName("Windows-1251"));
                // 1. список преобразовываем в строку
                StringBuilder fileString = new StringBuilder();
                for (String str : listStr) {
                    fileString.append(str).append("\n");
                }
                // 1. кладем готовую строку в CharStream
                CharStream cs = CharStreams.fromString(fileString.toString());
                CaseChangingCharStream upper = new CaseChangingCharStream(cs, true);
                // 2. 3. 4. создаем лексеры, токены и парсеры
                PlSqlLexer lexer = new PlSqlLexer(upper);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                PlSqlParser parser = new PlSqlParser(tokens);

                // создаем дерево
                ParseTree mainTree = parser.sql_script();

                // массив, в котором будут храниться дети
                ArrayList<ParseTree> listTree = new ArrayList<>();
                // дерево, в котом будут храниться правильные дети
                ParserRuleContext resultTree = ParserRuleContext.EMPTY;

                // обработка: не содержит ли ребенок ошибки
                for (int i = 0; i < mainTree.getChildCount(); i++) {
                    // если текущий ребенок созданного дерева содержит ошибки
                    if (mainTree.getChild(i).getChild(0) == null) {



                        /*// в строку записываем
                        ParseTree child = mainTree.getChild(i);
                        String payload = child.getPayload().toString();

                        // получаем полезную нагрузку из ребенка, в котором ошибка
                        while (!payload.contains("[@")) {
                            child = child.getChild(0);
                            payload = child.getPayload().toString();
                        }

                        // вытягиваем строку из полезной нагрузки
                        int line = getLineByPayload(payload);

                        // удаляем все строки до строки с ошибкой (включительно)
                        for (int j = 0; j < line; j++) {
                            listStr.remove(0);
                        }

                        // очищаем строку
                        fileString.delete(0, fileString.length());
                        // оставшиеся строки в листе преобразовываем в строку
                        for (String str : listStr) {
                            fileString.append(str).append("\n");
                        }
                        // обновляем CharStream готовой строкой
                        cs = CharStreams.fromString(fileString.toString());
                        // обновляем лексеры, токены и парсеры
                        lexer = new PlSqlLexer(cs);
                        tokens = new CommonTokenStream(lexer);
                        parser = new PlSqlParser(tokens);

                        // обновляем дерево
                        mainTree = parser.sql_script();

                        i = -1;*/
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
}