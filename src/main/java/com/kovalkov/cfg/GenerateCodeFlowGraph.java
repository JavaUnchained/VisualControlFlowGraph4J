package com.kovalkov.cfg;

import com.kovalkov.cfg.generator.CFGeneratorFactory;

import java.io.IOException;

public class GenerateCodeFlowGraph {
    public static void main(String...args){
        try {
            for (String arg : args) CFGeneratorFactory.getInstance().setSource(arg).setASTInstance().parse();
        } catch (IOException e) {e.printStackTrace();}
    }
}
