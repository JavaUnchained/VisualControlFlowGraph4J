package com.kovalkov.cfg.generator;

import com.kovalkov.cfg.generator.AST.ANTLER.generated.Java8Lexer;
import com.kovalkov.cfg.generator.AST.ANTLER.generated.Java8Parser;
import com.kovalkov.cfg.generator.CFG.CFGGenerator;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ControlFlowGraphFactory {
    private File file;
    private Java8Parser.CompilationUnitContext ast;

    public static ControlFlowGraphFactory getInstance() {
        return new ControlFlowGraphFactory();
    }

    public ControlFlowGraphFactory setSource(final String path) throws FileNotFoundException {
        if (file.exists()) {
            file = new File(path);
        } else throw new FileNotFoundException();
        return this;
    }

    public void parse() {
        final  CFGGenerator cdf = new CFGGenerator(ast);
        cdf.toScheme();
    }

    public ControlFlowGraphFactory setASTInstance() throws IOException {
        final var lexer = new Java8Lexer(new ANTLRFileStream(file.getCanonicalPath()));
        final var tokens = new CommonTokenStream(lexer);
        final var java8Parser = new Java8Parser(tokens);
        java8Parser.setBuildParseTree(true);
        ast = java8Parser.compilationUnit();
        return this;
    }
}
