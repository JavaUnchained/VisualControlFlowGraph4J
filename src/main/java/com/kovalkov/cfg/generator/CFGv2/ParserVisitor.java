package com.kovalkov.cfg.generator.CFGv2;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.visitor.GenericVisitorAdapter;

public class ParserVisitor extends GenericVisitorAdapter<OneNode, Void> {

    public OneNode getTree(final CompilationUnit methodDeclaration) {
        return visit(methodDeclaration, null);
    }

    @Override
    public OneNode visit(final MethodDeclaration methodDeclaration, final Void arg) {
        return new CFGGenerator()
                .generateCFG(methodDeclaration.getBody().orElse(null), methodDeclaration.getName().toString());
    }
}
