package com.kovalkov.cfg;

import com.kovalkov.cfg.generator.CFG.Consts;
import com.kovalkov.cfg.generator.CFG.Formats;
import com.kovalkov.cfg.generator.CFGeneratorFactory;
import com.kovalkov.cfg.generator.ExampleFiles;

import java.io.File;
import java.io.IOException;

public class GenerateCodeFlowGraph {
    public static void main(String...args){
        try {
            final var cfgf = CFGeneratorFactory.getInstance().setFormats(Formats.PNG);
            for (File f : ExampleFiles.getExampl(Consts.FOLDER)) cfgf.setFile(f).setASTInstance().parse();
        } catch (IOException e) {e.printStackTrace();}
    }
}
