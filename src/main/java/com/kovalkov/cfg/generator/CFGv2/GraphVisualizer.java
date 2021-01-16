package com.kovalkov.cfg.generator.CFGv2;

import com.kovalkov.cfg.generator.Const;
import guru.nidi.graphviz.attribute.Label;
import guru.nidi.graphviz.attribute.Shape;
import guru.nidi.graphviz.engine.Format;
import guru.nidi.graphviz.engine.Graphviz;
import guru.nidi.graphviz.model.MutableGraph;
import guru.nidi.graphviz.model.MutableNode;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;

import static com.kovalkov.cfg.generator.Const.*;
import static guru.nidi.graphviz.model.Factory.mutGraph;
import static guru.nidi.graphviz.model.Factory.mutNode;

public class GraphVisualizer {

    private final Map<String, MutableNode> nodes = new LinkedHashMap<>();

    public void visualize(final OneNode root, final String path, final Format format) {
        try {
            final MutableGraph graph = mutGraph("graph").setDirected(true);
            runByCFG(root);
            nodes.forEach((String key, MutableNode value) -> graph.add(value));
            Graphviz.fromGraph(graph).render(format).toFile(new File(path));
        } catch (final Exception ignored) {}
    }

    private void runByCFG(final OneNode cfgNode) {
        final MutableNode currentNode;
        if (nodes.containsKey(cfgNode.getNodeId())) {
            currentNode = nodes.get(cfgNode.getNodeId());
        } else {
            currentNode = mutNode(cfgNode.getNodeId()).add(Shape.OVAL, Label.of(cfgNode.toStringBody().isEmpty() ?
                                    cfgNode.getTextForLabel() : cfgNode.toStringBody()));
            nodes.put(cfgNode.getNodeId(), currentNode);
        }
        cfgNode.getChildrenNodes().forEach(node -> {
            if (( !node.getChildrenNodes().isEmpty() && node.getTextForLabel().equals(Const.CONTINUE) ||
                    node.getTextForLabel().equals(Const.BREAK))) node = node.getChildrenNodes().get(0);
            if (nodes.containsKey(node.getNodeId())) {
                final MutableNode newChild = nodes.get(node.getNodeId());
                currentNode.addLink(newChild);
            } else {
                final MutableNode newNode = mutNode(node.getNodeId()).add(node.getShape(), node.getColor(),
                                Label.of(node.toStringBody().isEmpty()
                                        ? node.getTextForLabel() : cleanupTextOfLabile(node)));
                nodes.put(node.getNodeId(), newNode);
                currentNode.addLink(newNode);
                runByCFG(node);
            } });
    }

    private static String cleanupTextOfLabile(final OneNode node) {
        return COMPILE1.matcher(PATTERN.matcher(COMPILE.matcher(node.toStringBody())
                .replaceAll("\n")).replaceAll("")).replaceAll("");
    }
}
