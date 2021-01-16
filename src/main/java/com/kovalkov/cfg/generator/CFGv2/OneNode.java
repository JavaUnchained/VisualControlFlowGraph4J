package com.kovalkov.cfg.generator.CFGv2;

import com.github.javaparser.ast.Node;
import guru.nidi.graphviz.attribute.Color;
import guru.nidi.graphviz.attribute.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class OneNode {
    public static Integer id = 0;
    private final List<OneNode> linkToBreakSt = new ArrayList<>();
    private final List<OneNode> childrenNodes = new ArrayList<>();
    private final List<Node> body = new ArrayList<>();
    private final String nodeId = getNextNodeId();
    private Shape shape = Shape.BOX;
    private Color color = Color.BLACK;
    private String textForLabel = "";

    public OneNode(final Shape shape, final List<? extends Node> body, final Color color) {
        this.shape = shape;
        this.color = color;
        if(Objects.nonNull(body))this.body.addAll(body);
    }

    public OneNode(final List<? extends Node> body, final Color color) {
        this.body.addAll(body);
        this.color = color;
    }

    public OneNode(final List<? extends Node> body) {
        this.body.addAll(body);
    }
    public OneNode(final  Shape shape, final String textForLabel) {
        this.shape = shape;
        this.textForLabel = textForLabel;
    }

    public OneNode(final String textForLabel) {
        this.textForLabel = textForLabel;
    }

    private static String getNextNodeId() {
        id++;
        return id.toString();
    }

    public void deleteChildrenNode(final OneNode child) {
        childrenNodes.remove(child);
    }

    public void addChildrenNodes(final List<OneNode> children) {
        this.childrenNodes.addAll(children);
    }

    public void addChildrenNode(final OneNode child) {
        this.childrenNodes.add(child);
    }

    public void addLinkToBreak(final OneNode linkedBreak) {
        this.linkToBreakSt.add(linkedBreak);
    }

    public void addLinksToBreak(final List<OneNode> linkedBreaks) {
        this.linkToBreakSt.addAll(linkedBreaks);
    }

    public Shape getShape() {
        return shape;
    }

    public List<OneNode> getLinkToBreakSt() {
        return linkToBreakSt;
    }

    public String getTextForLabel() {
        return textForLabel;
    }

    public void setTextForLabel(final String textForLabel) {
        this.textForLabel = textForLabel;
    }

    public String getNodeId() {
        return nodeId;
    }

    public Color getColor() {
        return color;
    }

    public void clearChildNodes() {
        this.childrenNodes.clear();
    }

    public List<OneNode> getChildrenNodes() {
        return childrenNodes;
    }

    public void deleteLinkToBreak() {
        this.linkToBreakSt.clear();
    }

    public String toStringBody() {
        final StringBuilder builder = new StringBuilder();
        body.forEach(node -> builder.append(node.toString()));
        return builder.toString();
    }
}
