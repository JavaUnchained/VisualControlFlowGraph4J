package com.kovalkov.cfg.generator.CFG;

import guru.nidi.graphviz.attribute.Color;
import guru.nidi.graphviz.attribute.Label;
import guru.nidi.graphviz.attribute.Shape;
import guru.nidi.graphviz.attribute.Style;
import guru.nidi.graphviz.engine.Graphviz;
import guru.nidi.graphviz.model.MutableGraph;
import guru.nidi.graphviz.model.MutableNode;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

import static guru.nidi.graphviz.model.Factory.mutGraph;
import static guru.nidi.graphviz.model.Factory.mutNode;

public class CFGGenerator {

    private String filename;
    private Formats format;
    private static int nodeCount = 0;
    private final Object destination;
    public MutableNode node;
    private final List<CFGGenerator> descendants;
    public List<CFGGenerator> lastRoutes = new ArrayList<>();
    public boolean returnStatement = false;
    public boolean ifBranch = false;

    public CFGGenerator(final ParseTree tree,final String fileName, Formats formats) throws FileNotFoundException {
        this(null, tree);
        this.format = formats;
        if (fileName != null) {
            this.filename = fileName.split("\\.")[0];
        } else throw new FileNotFoundException();
    }

    private CFGGenerator(CFGGenerator syntaxTree, ParseTree tree) {
        this(syntaxTree, tree, new ArrayList<>());
    }

    private CFGGenerator(CFGGenerator parentNode, ParseTree tree, List<CFGGenerator> descendants) {
        this.destination = getDestination(tree);
        this.descendants = descendants;
        if (destination instanceof Token){
            node = mutNode(((Token) destination).getText());
        } else {
            node = mutNode(String.valueOf(destination));
        }
        if (parentNode == null) {
            runThroughNodes(tree, this);
        }else {
            parentNode.descendants.add(this);
        }
    }

    private Object getDestination(ParseTree tree) {
        if (tree.getChildCount() != 0) {
            final var name = tree.getClass().getSimpleName().replace("Context", "");
            return Character.toLowerCase(name.charAt(0)) + name.substring(1);
        }
        return tree.getPayload();
    }

    private static void runThroughNodes(ParseTree tree, CFGGenerator syntaxTree) {
        if (tree.getChildCount() == 0) {
            new CFGGenerator(syntaxTree, tree);
        } else if (tree.getChildCount() == 1) {
            runThroughNodes(tree.getChild(0), syntaxTree);
        } else if (tree.getChildCount() > 1) {
            for (var i = 0; i < tree.getChildCount(); i++) {
                var nextTree = new CFGGenerator(syntaxTree, tree.getChild(i));
                if (!(nextTree.destination instanceof Token)) runThroughNodes(tree.getChild(i), nextTree);
            }
        }
    }

    private void checkClassAndMethods(CFGGenerator node, MutableGraph graph) {
        for (var n : node.getDescendants()) {
            if (n.destination instanceof String && n.destination.equals(Consts.CLASS_DECLARE)) {
                methodFieldParsingToNode(n, graph);
                continue;
            }
            checkClassAndMethods(n, graph);
        }
    }

    private String getTokenDeclaredText(CFGGenerator block, MutableGraph graph) {
        final var res = new StringJoiner(" ");
        for (var n : block.getDescendants()) {
            if (n.destination instanceof Token) {
                var token = ((Token) n.destination).getText();
                if (!token.equals(";"))
                    res.add(((Token) n.destination).getText());
            } else { res.add(getTokenDeclaredText(n, graph));}
        }
        return res.toString();
    }

    private CFGGenerator parsBlockStatements(CFGGenerator block, MutableGraph graph, CFGGenerator parent, boolean elseBranch) {
        var lastNode = parent;
        var first = true;
        for (var n : block.getDescendants()) {
            if (n.destination instanceof Token && ((Token) n.destination).getText().equals(Consts.RETURN)) {
                final var name = getTokenDeclaredText(block, graph);
                block.node = mutNode(getNodePointCount()).add(Label.of(name)).add(Shape.ELLIPSE);
                block.returnStatement = true;
                if (first && elseBranch)
                    parent.node.addLink(parent.node.linkTo(block.node).with(Style.DASHED));
                else
                    parent.node.addLink(parent.node.linkTo(block.node));
                graph.add(parent.node);
                break;
            }
            if (n.destination.equals(Consts.BLOCK_ST) || n.destination.equals(Consts.EXPRESSION)) {
                if (lastNode.lastRoutes.size() > 1) {
                    evaluationBlockParsing(n, graph, null, false);
                    lastNode.lastRoutes.stream().filter(l -> !l.returnStatement).map(l -> graph.add(l.node.addLink(n.node)));
                } else if (lastNode.lastRoutes.size() == 1) {
                    evaluationBlockParsing(n, graph, lastNode, false);
                    lastNode.lastRoutes.stream().filter(l -> !l.returnStatement).map(l -> graph.add(l.node.addLink(n.node)));
                } else {
                    if (first && elseBranch)
                        evaluationBlockParsing(n, graph, lastNode, true);
                    else
                        evaluationBlockParsing(n, graph, lastNode, false);
                }
                lastNode = n;
            }
            first = false;
        }
        return lastNode;
    }

    private void evaluationBlockParsing(CFGGenerator block, MutableGraph graph, CFGGenerator parent, boolean elseBranch) {
        for (var n : block.getDescendants()) {
            if (n.destination instanceof Token) {
                if (((Token) n.destination).getText().equals(Consts.FOR)){ loopParsingToNodes(block, graph, parent); break;}
                if (((Token) n.destination).getText().equals(Consts.IF)) { conditionParsingToNodes(block, graph, parent); break; }
                if (((Token) n.destination).getText().equals(Consts.RETURN)) {
                    final var name = getTokenDeclaredText(block, graph);
                    block.returnStatement = true;
                    block.node = mutNode(getNodePointCount()).add(Label.of(name.toString())).add(Shape.ELLIPSE);
                    graph.add(parent.node.addLink(block.node));
                    break;
                }
            } else {
                final var res = getTokenDeclaredText(block, graph);
                block.node = mutNode(getNodePointCount()).add(Label.of(res));
                block.node.add(Shape.RECTANGLE);
                if (parent != null) {
                    if (elseBranch)
                        parent.node.addLink(parent.node.linkTo(block.node).with(Style.BOLD, Label.of("No"), Color.RED));
                    else
                        if(parent.ifBranch) {
                            parent.node.addLink(parent.node.linkTo(block.node).with(Style.BOLD, Label.of("Yes"), Color.GREEN));
                        } else { parent.node.addLink(parent.node.linkTo(block.node));}
                    graph.add(parent.node);
                }
                break;
            }
        }
    }

    private void methodFieldParsingToNode(CFGGenerator method, MutableGraph graph) {
        var res = new StringJoiner(" ");
        CFGGenerator body = null;
        for (var n : method.getDescendants()) {
            if (n.destination instanceof String) {
                switch ((String) n.destination) {
                    case Consts.M_MODIFIER:
                    case Consts.M_HEADER: res.add(getTokenDeclaredText(n,graph)); break;
                    case Consts.M_BODY:body = n; break;
                }
            }
        }
        method.node = mutNode(getNodePointCount()).add(Label.of(res.toString())).add(Shape.ELLIPSE).add(Color.GRAY);
        graph.add(method.node);
        for (var n : Objects.requireNonNull(body).getDescendants()) {
            if (n.destination instanceof String && n.destination.equals(Consts.BLOCK_S)) {
                parsBlockStatements(n, graph, method, false);
            }
        }
    }

    private void loopParsingToNodes(CFGGenerator block, MutableGraph g, CFGGenerator parent) {
        MutableNode init = null;
        MutableNode expression = null;
        MutableNode update = null;
        CFGGenerator body = null;
        for (var n : block.getDescendants()) {
            if (n.destination instanceof String && n.destination.equals(Consts.FOR_INIT)) {
                init = mutNode(getNodePointCount()).add(Label.of(getTokenDeclaredText(n, g)));
                init.add(Shape.RECTANGLE);
            }
            if (n.destination instanceof String && n.destination.equals(Consts.FOR_EXPRESS)) {
                expression = mutNode(getNodePointCount()).add(Label.of(getTokenDeclaredText(n, g)));
                expression.add(Shape.DIAMOND).add(Color.ORANGE);
            }
            if (n.destination instanceof String && n.destination.equals(Consts.FOR_UPDATE)) {
                update = mutNode(getNodePointCount()).add(Label.of(getTokenDeclaredText(n, g)));
                update.add(Shape.RECTANGLE);
            }
            if (n.destination instanceof String && n.destination.equals(Consts.STATEMENT)) {
                body = n.getDescendants().stream().filter(e -> e.destination instanceof String && e.destination.equals(Consts.BLOCK_S)).findFirst().get();
            }
        }
        g.add(init.addLink(expression));
        g.add(expression.addLink(update));
        block.node = update;
        final var exit = mutNode(getNodePointCount()).add(Label.of("")).add(Shape.POINT);
        final var lastNode = parsBlockStatements(body, g, block, false);
        expression.addLink(expression.linkTo(exit).with(Style.DASHED));
        block.node = exit;
        g.add(parent.node.addLink(init.linkTo()));
        g.add(lastNode.node.addLink(expression.linkTo().with(Color.ORANGE, Label.of("Next iteration"))));
    }

    private void conditionParsingToNodes(CFGGenerator block, MutableGraph graph, CFGGenerator parent) {
        final StringJoiner forName = new StringJoiner("");
        CFGGenerator bodyFalse = null;
        CFGGenerator bodyTrue = null;
        boolean shortIF = true;
        block.ifBranch = true;
        for (var n : block.getDescendants()) {
            if (n.destination instanceof String) {
                if (n.destination.equals(Consts.IF_EXPRESS)) {
                    forName.add(getTokenDeclaredText(n, graph));
                    continue;
                }
                if (n.destination.equals(Consts.NOT_ONE_BRACJ_IF)) {
                    shortIF = false;
                    bodyTrue = n.getDescendants().stream().filter(e -> e.destination instanceof String && e.destination.equals(Consts.BLOCK_S)).findFirst().get();

                }
                if (n.destination.equals(Consts.STATEMENT)) {
                    CFGGenerator e = n.getDescendants().stream().filter(x -> x.destination instanceof String && x.destination.equals(Consts.BLOCK_S)).findFirst().get();
                    if (shortIF) {
                        bodyTrue = e;
                    } else {
                        bodyFalse = e;
                    }
                }
            }
        }
        block.node = mutNode(getNodePointCount()).add(Label.of(forName.toString())).add(Shape.DIAMOND).add(Color.BLUE);
        if (parent != null)
            graph.add(parent.node.addLink(block.node));
        final var trueRoute = parsBlockStatements(bodyTrue, graph, block, false);
        CFGGenerator falseRoute = null;
        if (!shortIF) {
            falseRoute = parsBlockStatements(bodyFalse, graph, block, true);
        }
        final List<CFGGenerator> routes = new ArrayList<>();
        final var end = mutNode(getNodePointCount()).add(Label.of("")).add(Shape.POINT);
        if (!trueRoute.returnStatement)
            graph.add(trueRoute.node.addLink(end));
        if (!shortIF) {
            if (!falseRoute.returnStatement) {
                falseRoute.node.addLink(falseRoute.node.linkTo(end));
                graph.add(falseRoute.node);
            }
        } else {
            block.node.addLink(block.node.linkTo(end).with(Style.BOLD, Label.of("No"), Color.RED));
            graph.add(block.node);
        }
        block.node = end;
        block.lastRoutes = routes;
    }

    public void generateGraph() {
        var graph = mutGraph(filename).setDirected(true);
        var syntaxTree = this;
        checkClassAndMethods(syntaxTree, graph);
        try {
            Graphviz.fromGraph(graph).width(9000).render(format.getFormat()).toFile(new File(Consts.TARGET_PATH +filename+format.getExtend()));
        } catch (IOException e) { e.printStackTrace(); }
    }

    private String getNodePointCount() {
        return String.format("%s", nodeCount++);
    }

    public List<CFGGenerator> getDescendants() {
        return new ArrayList<>(descendants);
    }

    @Override
    public String toString() {
        final var builder = new StringBuilder();
        var ast = this;
        final List<CFGGenerator> firstStack = new ArrayList<>();
        final List<List<CFGGenerator>> childListStack = new ArrayList<>();
        firstStack.add(ast);
        childListStack.add(firstStack);

        while (!childListStack.isEmpty()) {
            final var childStack = childListStack.get(childListStack.size() - 1);
            if (childStack.isEmpty()) {
                childListStack.remove(childListStack.size() - 1);
            } else {
                ast = childStack.remove(0);
                String caption;
                if (ast.destination instanceof Token) {
                    final var token = (Token) ast.destination;
                    caption = String.format("TOKEN[%s]", token.getText().replace("\n", "\\n"));
                } else {
                    caption = String.valueOf(ast.destination);
                }
                String indent = "";
                for (var i = 0; i < childListStack.size() - 1; i++) {
                    indent += (childListStack.get(i).size() > 0) ? "|  " : "   ";
                }
                builder.append(indent).append(childStack.isEmpty() ? "'- " : "|- ").append(caption).append("\n");

                if (ast.descendants.size() > 0) {
                    List<CFGGenerator> children = new ArrayList<>();
                    for (int i = 0; i < ast.descendants.size(); i++) children.add(ast.descendants.get(i));
                    childListStack.add(children);
                }
            }
        }
        return builder.toString();
    }
}
