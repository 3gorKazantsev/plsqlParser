package com.ekazantsev.app;

import com.ekazantsev.grammar.PLSQLLexer;
import com.ekazantsev.grammar.PLSQLParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.IOException;

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
                // подготовка к созданию дерева
                CharStream cs = CharStreams.fromFileName(inputFile);
                PLSQLLexer lexer = new PLSQLLexer(cs);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                PLSQLParser parser = new PLSQLParser(tokens);

                // создаем дерево
                ParseTree tree = parser.sql_script();

                // сохраняем дерево
                Convert.saveTree(tree, outputFile);
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
}
