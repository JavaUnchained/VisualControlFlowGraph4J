package com.kovalkov.cfg.generator.AST.Parsing4Java;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Node;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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
        CompilationUnit compilationUnit = pj.getCompilationUnit();
        compilationUnit.removePackageDeclaration();
//        List<Node> nodes = showAllNodes(compilationUnit.getChildNodes(), -1);
//        nodes.forEach(System.out::println);

        List<Node> nodes =
                compilationUnit.getChildNodes().stream().flatMap(node -> node.getChildNodes()
                        .stream().flatMap(n -> n.getChildNodes().stream())).collect(Collectors.toList());
    }

    private static List<Node> showAllNodes(List<Node> nodes, Integer size) {
        List<Node> nodes1 = nodes.stream().flatMap(node -> node.getChildNodes() == null ? node.stream()
                : node.getChildNodes().stream()).collect(Collectors.toList());
        System.out.println(nodes1);
        return nodes1.size() == size ? nodes1 : showAllNodes(nodes1, nodes1.size());
    }

    public CompilationUnit getCompilationUnit() {
        return compilationUnit;
    }
}
