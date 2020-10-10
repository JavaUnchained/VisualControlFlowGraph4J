// Generated from java/Java8.g4 by ANTLR 4.4
package com.kovalkov.cfg.generator.AST.ANTLER.generated;
import com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser}.
 */
public interface Java8Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclaration(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ClassMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclaration(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ClassMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterStatementNoShortIf(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.StatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitStatementNoShortIf(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.StatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lf_primary(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lf_primary(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstantModifier(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstantModifier(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lfno_primary(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lfno_primary(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lfno_classOrInterfaceType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lfno_classOrInterfaceType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeName(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.SimpleTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeName(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.SimpleTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#expressionName}.
	 * @param ctx the parse tree
	 */
	void enterExpressionName(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ExpressionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#expressionName}.
	 * @param ctx the parse tree
	 */
	void exitExpressionName(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ExpressionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWithoutTrailingSubstatement(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWithoutTrailingSubstatement(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclarator(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ConstructorDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclarator(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ConstructorDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssertStatement(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.AssertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssertStatement(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.AssertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreationExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ArrayCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreationExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ArrayCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void enterUnannArrayType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.UnannArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void exitUnannArrayType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.UnannArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryWithResourcesStatement(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.TryWithResourcesStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryWithResourcesStatement(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.TryWithResourcesStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void enterExceptionType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ExceptionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void exitExceptionType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ExceptionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void enterExceptionTypeList(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ExceptionTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void exitExceptionTypeList(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ExceptionTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lf_primary(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lf_primary(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterInferredFormalParameterList(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.InferredFormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitInferredFormalParameterList(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.InferredFormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeImportOnDemandDeclaration(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeImportOnDemandDeclaration(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lfno_primary(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lfno_primary(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#finally_}.
	 * @param ctx the parse tree
	 */
	void enterFinally_(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.Finally_Context ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#finally_}.
	 * @param ctx the parse tree
	 */
	void exitFinally_(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.Finally_Context ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lfno_unannClassOrInterfaceType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lfno_unannClassOrInterfaceType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticImportOnDemandDeclaration(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticImportOnDemandDeclaration(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.MethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.MethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleStaticImportDeclaration(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleStaticImportDeclaration(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void enterPackageModifier(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.PackageModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void exitPackageModifier(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.PackageModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_arrayAccess(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_arrayAccess(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void enterUnannTypeVariable(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.UnannTypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void exitUnannTypeVariable(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.UnannTypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalInterfaceDeclaration(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalInterfaceDeclaration(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lfno_classOrInterfaceType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lfno_classOrInterfaceType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstructorModifier(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ConstructorModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstructorModifier(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ConstructorModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarator(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.MethodDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarator(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.MethodDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeMemberDeclaration(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeMemberDeclaration(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecrementExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.PreDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecrementExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.PreDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializerList(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.VariableInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializerList(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.VariableInitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void enterExtendsInterfaces(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ExtendsInterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void exitExtendsInterfaces(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ExtendsInterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodModifier(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.MethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodModifier(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.MethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.UnannClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.UnannClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterList(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.TypeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterList(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.TypeParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalClassDeclaration(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.NormalClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalClassDeclaration(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.NormalClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatementNoShortIf(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatementNoShortIf(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void enterWildcardBounds(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.WildcardBoundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void exitWildcardBounds(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.WildcardBoundsContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_arrayAccess(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_arrayAccess(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatement(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.EnhancedForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatement(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.EnhancedForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariable(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.TypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariable(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.TypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.DimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void enterUnannPrimitiveType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.UnannPrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void exitUnannPrimitiveType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.UnannPrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitConstructorInvocation(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitConstructorInvocation(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void enterAdditionalBound(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.AdditionalBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void exitAdditionalBound(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.AdditionalBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassOrInterfaceType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassOrInterfaceType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenStatement(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.IfThenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenStatement(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.IfThenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression_lf_postfixExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression_lf_postfixExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.InterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.InterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lf_primary(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.MethodReference_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lf_primary(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.MethodReference_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantModifier(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.EnumConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantModifier(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.EnumConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lfno_unannClassOrInterfaceType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lfno_unannClassOrInterfaceType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void enterFieldModifier(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.FieldModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void exitFieldModifier(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.FieldModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterMarkerAnnotation(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.MarkerAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitMarkerAnnotation(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.MarkerAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#resourceList}.
	 * @param ctx the parse tree
	 */
	void enterResourceList(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ResourceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#resourceList}.
	 * @param ctx the parse tree
	 */
	void exitResourceList(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ResourceListContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lfno_primary(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lfno_primary(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void enterStaticInitializer(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.StaticInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void exitStaticInitializer(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.StaticInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSide(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.LeftHandSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSide(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.LeftHandSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatement(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.BasicForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatement(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.BasicForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void enterSuperinterfaces(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.SuperinterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void exitSuperinterfaces(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.SuperinterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lf_primary(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lf_primary(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.SwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairList(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ElementValuePairListContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairList(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ElementValuePairListContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void enterSynchronizedStatement(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.SynchronizedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void exitSynchronizedStatement(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.SynchronizedStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lf_unannClassOrInterfaceType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lf_unannClassOrInterfaceType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#superclass}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.SuperclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#superclass}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.SuperclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void enterDimExprs(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.DimExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void exitDimExprs(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.DimExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementModifier(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementModifier(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lf_primary(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lf_primary(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void enterInstanceInitializer(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.InstanceInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void exitInstanceInitializer(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.InstanceInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#unannType}.
	 * @param ctx the parse tree
	 */
	void enterUnannType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.UnannTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#unannType}.
	 * @param ctx the parse tree
	 */
	void exitUnannType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.UnannTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#integralType}.
	 * @param ctx the parse tree
	 */
	void enterIntegralType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.IntegralTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#integralType}.
	 * @param ctx the parse tree
	 */
	void exitIntegralType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.IntegralTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression_lf_postfixExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression_lf_postfixExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterNormalAnnotation(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.NormalAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitNormalAnnotation(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.NormalAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#classModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassModifier(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ClassModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#classModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassModifier(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ClassModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabels(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.SwitchLabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabels(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.SwitchLabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lf_classOrInterfaceType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lf_classOrInterfaceType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleTypeImportDeclaration(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleTypeImportDeclaration(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterSingleElementAnnotation(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.SingleElementAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitSingleElementAnnotation(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.SingleElementAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentList(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.TypeArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentList(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.TypeArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.PostDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.PostDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void enterReceiverParameter(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ReceiverParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void exitReceiverParameter(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ReceiverParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementNoShortIf(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.WhileStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementNoShortIf(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.WhileStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantList(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.EnumConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantList(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.EnumConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterForStatementNoShortIf(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitForStatementNoShortIf(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatement(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.IfThenElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatement(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.IfThenElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatementNoShortIf(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatementNoShortIf(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#catches}.
	 * @param ctx the parse tree
	 */
	void enterCatches(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.CatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#catches}.
	 * @param ctx the parse tree
	 */
	void exitCatches(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.CatchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lfno_primary(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lfno_primary(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorList(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.VariableDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorList(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.VariableDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterModifier(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.TypeParameterModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterModifier(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.TypeParameterModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.FloatingPointTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.FloatingPointTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void enterDimExpr(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.DimExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void exitDimExpr(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.DimExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lf_unannClassOrInterfaceType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lf_unannClassOrInterfaceType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceTypeList(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.InterfaceTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceTypeList(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.InterfaceTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatementNoShortIf(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatementNoShortIf(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.UnannInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.UnannInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceModifier(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.InterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceModifier(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.InterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void enterElementValueList(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ElementValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void exitElementValueList(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ElementValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatementNoShortIf(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatementNoShortIf(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#wildcard}.
	 * @param ctx the parse tree
	 */
	void enterWildcard(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.WildcardContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#wildcard}.
	 * @param ctx the parse tree
	 */
	void exitWildcard(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.WildcardContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannReferenceType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.UnannReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannReferenceType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.UnannReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeader(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.MethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeader(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.MethodHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterCatchFormalParameter(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.CatchFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitCatchFormalParameter(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.CatchFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lfno_primary(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lfno_primary(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#packageName}.
	 * @param ctx the parse tree
	 */
	void enterPackageName(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.PackageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#packageName}.
	 * @param ctx the parse tree
	 */
	void exitPackageName(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.PackageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lf_classOrInterfaceType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lf_classOrInterfaceType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void enterPackageOrTypeName(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.PackageOrTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void exitPackageOrTypeName(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.PackageOrTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void enterAmbiguousName(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.AmbiguousNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void exitAmbiguousName(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.AmbiguousNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpressionList(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.StatementExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpressionList(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.StatementExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#throws_}.
	 * @param ctx the parse tree
	 */
	void enterThrows_(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.Throws_Context ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#throws_}.
	 * @param ctx the parse tree
	 */
	void exitThrows_(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.Throws_Context ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#methodReference}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.MethodReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#methodReference}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.MethodReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.PrimaryNoNewArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.PrimaryNoNewArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#numericType}.
	 * @param ctx the parse tree
	 */
	void enterNumericType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.NumericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#numericType}.
	 * @param ctx the parse tree
	 */
	void exitNumericType(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.NumericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(@NotNull com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link com.kovalkov.cfg.AST.ANTLER.generated.Java8Parser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(@NotNull Java8Parser.ContinueStatementContext ctx);
}