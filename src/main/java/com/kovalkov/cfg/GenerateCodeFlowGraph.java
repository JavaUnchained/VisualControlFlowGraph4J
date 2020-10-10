package com.kovalkov.cfg;

import com.kovalkov.cfg.generator.CFGeneratorFactory;
import com.kovalkov.cfg.generator.ExampleFiles;

import java.io.File;
import java.io.IOException;

public class GenerateCodeFlowGraph {
    private static final String FOLDER = "src/main/java/com/kovalkov/cfg/examples";

    public static void main(String...args){
        try {
            for (File f : ExampleFiles.getExampl(FOLDER)) CFGeneratorFactory.getInstance().setFile(f).setASTInstance().parse();
        } catch (IOException e) {e.printStackTrace();}
    }
}
