package com.kovalkov.cfg;

import com.github.javaparser.StaticJavaParser;
import com.kovalkov.cfg.generator.CFGv1.CFGeneratorFactory;
import com.kovalkov.cfg.generator.Formats;
import com.kovalkov.cfg.generator.CFGv2.GraphVisualizer;
import com.kovalkov.cfg.generator.CFGv2.ParserVisitor;
import com.kovalkov.cfg.generator.ExampleFiles;
import guru.nidi.graphviz.engine.Format;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import static com.kovalkov.cfg.generator.Const.EXAMPLE_TYPE;
import static com.kovalkov.cfg.generator.Const.PATH_TO_EXAMPLES;
import static com.kovalkov.cfg.generator.Const.PATH_TO_GRAPH;

public final class GenerateCodeFlowGraph {
    public static void main(final String...args) throws IOException {
        buildCFGv2();
    }

    private static void buildCFGv2() throws IOException {
        ExampleFiles.getExampl(PATH_TO_EXAMPLES).forEach(GenerateCodeFlowGraph::generateGraph);
    }

    private static void generateGraph(final File file){
        try {
            new GraphVisualizer().visualize(new ParserVisitor()
                    .getTree(StaticJavaParser.parse(file)), prepareName(file.getName()), Format.SVG);
        } catch (final FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static String prepareName(final String filename) {
        return String.format("%s%s", PATH_TO_GRAPH, filename.replace(EXAMPLE_TYPE, ""));
    }

    private static void buildCFGv1() {
        try {
            final var cfg = CFGeneratorFactory.getInstance().setFormats(Formats.SVG);
            for (final File file : ExampleFiles.getExampl(PATH_TO_EXAMPLES)) cfg.setFile(file).setASTInstance().parse();
        } catch (final IOException e) {e.printStackTrace();}
    }
}
