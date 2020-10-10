package com.kovalkov.cfg.generator.AST.Parsing4Java;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;

import java.io.IOException;
import java.nio.file.Path;

public class ParsingJava {
    private final static String ABSOLUTE = "C:\\Users\\andre\\IdeaProjects\\" +
            "ControlFlowGraph4J\\src\\main\\java\\com\\kovalkov\\cfg\\examples\\Fib.java";
    private final static Path PATH = Path.of(ABSOLUTE);
    private CompilationUnit compilationUnit;

    public ParsingJava() {
        try {
            compilationUnit = StaticJavaParser.parse(PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ParsingJava pj = new ParsingJava();
        System.out.println(pj.getCompilationUnit());
    }

    public CompilationUnit getCompilationUnit() {
        return compilationUnit;
    }
}
