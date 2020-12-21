package com.ekazantsev.app;

import org.apache.commons.cli.*;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            processCmdOption(args);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // метод, который обрабатывает командную строку
    private static void processCmdOption(String[] args) throws IOException {
        Parser parser = new Parser();

        // создание ключей -io и -d ---------------------------------------------------------------------
        Options options = new Options();
        options.addOption("i", "input", true,
                "input .sql file or directory containing .sql files");
        options.addOption("o", "output", true,
                "output .json file or directory");

        // парсинг командной строки ---------------------------------------------------------------------
        CommandLineParser cmdParser = new DefaultParser();
        CommandLine cmd = null;
        try {
            cmd = cmdParser.parse(options, args);
        } catch (ParseException e) {
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp("plsqlParser", options);
        }

        // обработка ключей -----------------------------------------------------------------------------
        // если в командной строке есть и -i и -o
        if (cmd.hasOption("i") && cmd.hasOption("o")) {
            // если input - sql файл, а output - Json файл
            if (cmd.getOptionValue("i").contains(".sql") && cmd.getOptionValue("o").contains(".json")) {
                // запускаем парсер
                parser.parse(cmd.getOptionValue("i"), cmd.getOptionValue("o"));
            }

            // если input - папка (если input не содержит .sql), output - папка (если input не содержит .json),
            // input и output не равны
            if (!cmd.getOptionValue("i").contains(".sql") && !cmd.getOptionValue("o").contains(".json")
                    && !cmd.getOptionValue("i").equals(cmd.getOptionValue("o"))) {
                // создаем новую папку по пути казанном в output
                // и копируем все ее содержимое
                File inputFolder = new File(cmd.getOptionValue("i"));
                String outputFolderPath = cmd.getOptionValue("o");
                File outputFolder = new File(outputFolderPath);
                FileUtils.copyDirectory(inputFolder, outputFolder);

                // запускаем метод, который обходит входную папку и создает выходную папку
                parser.processFolder(outputFolder);
            }
        }

        // если в командной строке только -i
        if (cmd.hasOption("i")) {
            // если input - папка (если input не содержит .sql и не содержит .json)
            if (!cmd.getOptionValue("i").contains(".sql") && !cmd.getOptionValue("i").contains(".json")) {
                // создаем новую папку для JSON файлов рядом с входной папкой
                // и копируем в нее все ее содержимое
                File inputFolder = new File(cmd.getOptionValue("i"));
                String outputFolderPath = inputFolder.getPath();
                outputFolderPath = outputFolderPath + "JSON";
                File outputFolder = new File(outputFolderPath);
                FileUtils.copyDirectory(inputFolder, outputFolder);

                // запускаем метод, который обходит входную папку и создает выходную папку
                parser.processFolder(outputFolder);
            }
        }
    }
}
