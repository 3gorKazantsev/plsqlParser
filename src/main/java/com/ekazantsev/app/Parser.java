package com.ekazantsev.app;

import com.ekazantsev.grammar.PLSQLLexer;
import com.ekazantsev.grammar.PLSQLParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Parser {
    public static void main(String[] args) {
        String input = "G:/Projects/Java/plsqlParser/src/main/resources/sql.sql";
        String output = "G:/Projects/Java/plsqlParser/src/main/resources/result.json";

        parse(input, output);
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
