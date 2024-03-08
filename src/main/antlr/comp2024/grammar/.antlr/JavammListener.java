// Generated from c:/Users/NASA/Desktop/comp2024-10e/src/main/antlr/comp2024/grammar/Javamm.g4 by ANTLR 4.13.1

    package pt.up.fe.comp2024;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavammParser}.
 */
public interface JavammListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavammParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(JavammParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavammParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(JavammParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportStatement}
	 * labeled alternative in {@link JavammParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(JavammParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportStatement}
	 * labeled alternative in {@link JavammParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(JavammParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CLASS_DECL}
	 * labeled alternative in {@link JavammParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCLASS_DECL(JavammParser.CLASS_DECLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CLASS_DECL}
	 * labeled alternative in {@link JavammParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCLASS_DECL(JavammParser.CLASS_DECLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DOUBLE_TYPE}
	 * labeled alternative in {@link JavammParser#type}.
	 * @param ctx the parse tree
	 */
	void enterDOUBLE_TYPE(JavammParser.DOUBLE_TYPEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DOUBLE_TYPE}
	 * labeled alternative in {@link JavammParser#type}.
	 * @param ctx the parse tree
	 */
	void exitDOUBLE_TYPE(JavammParser.DOUBLE_TYPEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STRING_TYPE}
	 * labeled alternative in {@link JavammParser#type}.
	 * @param ctx the parse tree
	 */
	void enterSTRING_TYPE(JavammParser.STRING_TYPEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STRING_TYPE}
	 * labeled alternative in {@link JavammParser#type}.
	 * @param ctx the parse tree
	 */
	void exitSTRING_TYPE(JavammParser.STRING_TYPEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ARRAY_TYPE}
	 * labeled alternative in {@link JavammParser#type}.
	 * @param ctx the parse tree
	 */
	void enterARRAY_TYPE(JavammParser.ARRAY_TYPEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ARRAY_TYPE}
	 * labeled alternative in {@link JavammParser#type}.
	 * @param ctx the parse tree
	 */
	void exitARRAY_TYPE(JavammParser.ARRAY_TYPEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code INT_VARARGS_TYPE}
	 * labeled alternative in {@link JavammParser#type}.
	 * @param ctx the parse tree
	 */
	void enterINT_VARARGS_TYPE(JavammParser.INT_VARARGS_TYPEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code INT_VARARGS_TYPE}
	 * labeled alternative in {@link JavammParser#type}.
	 * @param ctx the parse tree
	 */
	void exitINT_VARARGS_TYPE(JavammParser.INT_VARARGS_TYPEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CUSTOM_TYPE}
	 * labeled alternative in {@link JavammParser#type}.
	 * @param ctx the parse tree
	 */
	void enterCUSTOM_TYPE(JavammParser.CUSTOM_TYPEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CUSTOM_TYPE}
	 * labeled alternative in {@link JavammParser#type}.
	 * @param ctx the parse tree
	 */
	void exitCUSTOM_TYPE(JavammParser.CUSTOM_TYPEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BOOLEAN_TYPE}
	 * labeled alternative in {@link JavammParser#type}.
	 * @param ctx the parse tree
	 */
	void enterBOOLEAN_TYPE(JavammParser.BOOLEAN_TYPEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BOOLEAN_TYPE}
	 * labeled alternative in {@link JavammParser#type}.
	 * @param ctx the parse tree
	 */
	void exitBOOLEAN_TYPE(JavammParser.BOOLEAN_TYPEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FLOAT_TYPE}
	 * labeled alternative in {@link JavammParser#type}.
	 * @param ctx the parse tree
	 */
	void enterFLOAT_TYPE(JavammParser.FLOAT_TYPEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FLOAT_TYPE}
	 * labeled alternative in {@link JavammParser#type}.
	 * @param ctx the parse tree
	 */
	void exitFLOAT_TYPE(JavammParser.FLOAT_TYPEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code INT_TYPE}
	 * labeled alternative in {@link JavammParser#type}.
	 * @param ctx the parse tree
	 */
	void enterINT_TYPE(JavammParser.INT_TYPEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code INT_TYPE}
	 * labeled alternative in {@link JavammParser#type}.
	 * @param ctx the parse tree
	 */
	void exitINT_TYPE(JavammParser.INT_TYPEContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavammParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(JavammParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavammParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(JavammParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code METHOD_DECL}
	 * labeled alternative in {@link JavammParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMETHOD_DECL(JavammParser.METHOD_DECLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code METHOD_DECL}
	 * labeled alternative in {@link JavammParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMETHOD_DECL(JavammParser.METHOD_DECLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PARAM}
	 * labeled alternative in {@link JavammParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterPARAM(JavammParser.PARAMContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PARAM}
	 * labeled alternative in {@link JavammParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitPARAM(JavammParser.PARAMContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavammParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(JavammParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavammParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(JavammParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavammParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JavammParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavammParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JavammParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisReferenceExpression}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterThisReferenceExpression(JavammParser.ThisReferenceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisReferenceExpression}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitThisReferenceExpression(JavammParser.ThisReferenceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis(JavammParser.ParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis(JavammParser.ParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayInitializationExpression}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializationExpression(JavammParser.ArrayInitializationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayInitializationExpression}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializationExpression(JavammParser.ArrayInitializationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayAccess}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(JavammParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayAccess}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(JavammParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BINARY_EXPR}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBINARY_EXPR(JavammParser.BINARY_EXPRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BINARY_EXPR}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBINARY_EXPR(JavammParser.BINARY_EXPRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassInstantiation}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterClassInstantiation(JavammParser.ClassInstantiationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassInstantiation}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitClassInstantiation(JavammParser.ClassInstantiationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayLengthExpression}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayLengthExpression(JavammParser.ArrayLengthExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayLengthExpression}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayLengthExpression(JavammParser.ArrayLengthExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code INTEGER_LITERAL}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterINTEGER_LITERAL(JavammParser.INTEGER_LITERALContext ctx);
	/**
	 * Exit a parse tree produced by the {@code INTEGER_LITERAL}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitINTEGER_LITERAL(JavammParser.INTEGER_LITERALContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(JavammParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(JavammParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewIntArrayExpression}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNewIntArrayExpression(JavammParser.NewIntArrayExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewIntArrayExpression}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNewIntArrayExpression(JavammParser.NewIntArrayExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NegationExpression}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNegationExpression(JavammParser.NegationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NegationExpression}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNegationExpression(JavammParser.NegationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VAR_REF_EXPR}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVAR_REF_EXPR(JavammParser.VAR_REF_EXPRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VAR_REF_EXPR}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVAR_REF_EXPR(JavammParser.VAR_REF_EXPRContext ctx);
}