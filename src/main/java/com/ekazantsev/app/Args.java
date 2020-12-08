package com.ekazantsev.app;

import com.beust.jcommander.Parameter;

public class Args {
    @Parameter(names = {"-io"}, description = "path to input .sql file and path to output .json file through a space")
    private String inputOutput;
    @Parameter(names = {"--directory", "-d"}, description = "path to input directory with .sql files")
    private String directory;

    // запуск парсера с входными параметрами
    public void run() {
        // разбиение строки inputOutput на две: input и output
        String[] strs = inputOutput.split("\\s");
        String input = strs[0];
        String output = strs[1];

        Parser.parse(input, output);
    }
}