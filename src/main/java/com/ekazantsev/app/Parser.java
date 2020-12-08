package com.ekazantsev.app;

import com.beust.jcommander.JCommander;
import com.ekazantsev.grammar.PLSQLLexer;
import com.ekazantsev.grammar.PLSQLParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Parser {
    public static void main(String[] args) {
        // штука, чтобы воспринимались параметры в командной строке
        Args arguments = new Args();
        JCommander.newBuilder()
                .addObject(arguments)
                .build()
                .parse(args);
        // запуск парсера с входными параметрами
        arguments.run();
    }

    public static void parse(String inputFile, String outputFile) {
        try {
            // подготовка к созданию дерева
            CharStream cs = CharStreams.fromFileName(inputFile);
            PLSQLLexer lexer = new PLSQLLexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            PLSQLParser parser = new PLSQLParser(tokens);

            // создаем дерево
            ParseTree tree = parser.sql_script();

            // сохраняем дерево
            Convert.saveTree(tree, outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
