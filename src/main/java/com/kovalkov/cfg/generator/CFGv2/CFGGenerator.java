package com.kovalkov.cfg.generator.CFGv2;

import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.stmt.*;
import com.kovalkov.cfg.generator.Const;
import guru.nidi.graphviz.attribute.Color;
import guru.nidi.graphviz.attribute.Shape;

import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.nonNull;

public class CFGGenerator {

    public OneNode generateCFG(final BlockStmt body, final String methodName) {
        final OneNode startNode = new OneNode(Const.METHOD_HEADER + methodName);
        final OneNode end = new OneNode(Shape.OVAL, Const.END_OF_PROGRAM);
        startNode.addChildrenNode(end);
        if (body != null) parseBlockStmt(body, List.of(startNode), end, end, end);
        return startNode;
    }

    private List<OneNode> parseBlockStmt(final BlockStmt blockStmt, final List<OneNode> primary,
                                         final OneNode end, final OneNode continueNode, final OneNode breakNode) {
        List<OneNode> current = primary;
        for (final Statement st : blockStmt.getStatements()) {
            if (st.isIfStmt()) {
                current = addIf(st.asIfStmt(), current, end, continueNode, breakNode);
            } else if(st.isForStmt()) {
                current = addFor(st.asForStmt(), current, end);
            } else if (st.isWhileStmt()) {
                final WhileStmt whileSt = st.asWhileStmt();
                final OneNode condition = new OneNode(Shape.DIAMOND, List.of(whileSt.getCondition()), Color.ORANGE);
                insertNode(current, end, condition);
                parseBlockStmt(whileSt.getBody().asBlockStmt(), List.of(condition), condition, condition, end);
                current = List.of(condition);
            } else if(st.isDoStmt()) {
                current = doWhile(st.asDoStmt(), current, end);
            } else {
                current = addSt(st, current, end, continueNode, breakNode);
            }
        }
        return current;
    }

    private List<OneNode> addIf(final IfStmt statement, final List<OneNode> primary, final OneNode end,
                                final OneNode continueTarget, final OneNode breakTarget) {
        final OneNode conditionNode = new OneNode(Shape.DIAMOND, List.of(statement.getCondition()), Color.BLUE);
        insertNode(primary, end, conditionNode);
        final List<OneNode> thenNodes = parseBlockStmt(statement.getThenStmt().asBlockStmt(),
                new ArrayList<>(List.of(conditionNode)), end, continueTarget, breakTarget);
        if (statement.getElseStmt().isPresent()) {
            return addElse(statement, end, continueTarget, breakTarget, conditionNode, thenNodes);
        }
        thenNodes.add(conditionNode);
        return thenNodes;
    }

    private List<OneNode> addElse(final IfStmt statement, final OneNode end, final OneNode continueTarget,
                                  final OneNode breakTarget, final OneNode conditionNode, final List<OneNode> thenNodes) {
        final List<OneNode> elseNodes = parseBlockStmt(statement.getElseStmt().get().asBlockStmt(),
                new ArrayList<>(List.of(conditionNode)), end, continueTarget, breakTarget);
        thenNodes.addAll(elseNodes);
        return thenNodes;
    }

    public List<OneNode> addFor(final ForStmt forStmt, final List<OneNode> primary, final OneNode end) {
        final OneNode initNode = new OneNode(Shape.BOX, new ArrayList<Node>(forStmt.getInitialization()), Color.ORANGE);
        final OneNode condition = new OneNode(Shape.DIAMOND,
                forStmt.getCompare().isPresent() ? List.of(forStmt.getCompare().get()) : null, Color.ORANGE);
        final OneNode update = new OneNode(new ArrayList<Node>(forStmt.getUpdate()), Color.ORANGE);
        insertNode(primary, end, initNode);
        insertNode(new ArrayList<>(List.of(initNode)), end, condition);
        update.addChildrenNode(condition);
        parseBlockStmt(forStmt.getBody().asBlockStmt(), new ArrayList<>(List.of(condition)), update, update, end);
        return new ArrayList<>(List.of(condition));
    }

    public List<OneNode> doWhile(final DoStmt doStmt, final List<OneNode> primary, final OneNode end) {
        final OneNode conditionNode = new OneNode(Shape.DIAMOND, List.of(doStmt.getCondition()), Color.ORANGE);
        primary.forEach(node -> { node.clearChildNodes();
                node.addChildrenNode(conditionNode); });
        conditionNode.addChildrenNodes(primary);
        parseBlockStmt(doStmt.getBody().asBlockStmt(), primary, conditionNode, conditionNode, end);
        primary.get(0).getChildrenNodes().get(0).addLinksToBreak(end.getLinkToBreakSt());
        end.deleteLinkToBreak();
        primary.get(0).getChildrenNodes().get(0).getLinkToBreakSt().forEach(node -> {
            node.getChildrenNodes().clear();
            node.getChildrenNodes().add(primary.get(0).getChildrenNodes().get(0)); });
        return new ArrayList<>(List.of(conditionNode));
    }

    public static List<OneNode> addSt(final Statement statement, final List<OneNode> primary, final OneNode end,
                                      final OneNode continueLink, final OneNode brkLink) {
        final OneNode newNode = new OneNode(List.of(statement));
        insertNode(primary, end, newNode);
        if (statement.isContinueStmt() && nonNull(continueLink)) {
            addToNode(continueLink, newNode, Const.CONTINUE);
            return new ArrayList<>();
        }
        if (statement.isBreakStmt() && nonNull(brkLink)) {
            addToNode(brkLink, newNode, Const.BREAK);
            brkLink.addLinkToBreak(newNode);
            return new ArrayList<>();
        }
        return new ArrayList<>(List.of(newNode));
    }

    private static void addToNode(final OneNode link, final OneNode newNode, final String cons) {
        newNode.setTextForLabel(cons);
        newNode.clearChildNodes();
        newNode.addChildrenNode(link);
    }

    private static void insertNode(final List<OneNode> primary, final OneNode end, final OneNode newNode) {
        primary.forEach(node -> { node.deleteChildrenNode(end);
            node.addChildrenNode(newNode); });
        newNode.addChildrenNode(end);
        end.getLinkToBreakSt().forEach(node -> {node.getChildrenNodes().clear(); node.getChildrenNodes().add(newNode);});
        newNode.addLinksToBreak(end.getLinkToBreakSt());
        end.deleteLinkToBreak();
    }
}
