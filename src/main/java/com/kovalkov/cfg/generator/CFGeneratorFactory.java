package com.kovalkov.cfg.generator;

import com.kovalkov.cfg.generator.AST.ANTLER.Java8Lexer;
import com.kovalkov.cfg.generator.CFG.CFGGenerator;
import com.kovalkov.cfg.generator.AST.ANTLER.Java8Parser;
import com.kovalkov.cfg.generator.CFG.Formats;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CFGeneratorFactory {
    private File file;
    private Formats formats;
    private Java8Parser.CompilationUnitContext ast;

    public static CFGeneratorFactory getInstance() {
        return new CFGeneratorFactory();
    }

    public CFGeneratorFactory setFile(final File file) {
        this.file = file;
        return this;
    }

    public CFGeneratorFactory setFormats(Formats formats) {
        this.formats = formats;
        return this;
    }

    public CFGeneratorFactory setSource(final String path) throws FileNotFoundException {
        if (file.exists()) {
            file = new File(path);
        } else throw new FileNotFoundException();
        return this;
    }

    public void parse() throws FileNotFoundException {
        final  CFGGenerator cdf = new CFGGenerator(ast, file.getName(), formats);
        cdf.generateGraph();
    }

    public CFGeneratorFactory setASTInstance() throws IOException {
        final var lexer = new Java8Lexer(new ANTLRFileStream(file.getCanonicalPath()));
        final var tokens = new CommonTokenStream(lexer);
        final var java8Parser = new Java8Parser(tokens);
        java8Parser.setBuildParseTree(true);
        ast = java8Parser.compilationUnit();
        return this;
    }
}
