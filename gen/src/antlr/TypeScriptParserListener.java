// Generated from E:/My_project_compiler/Test_2/src/antlr/TypeScriptParser.g4 by ANTLR 4.13.2
package src.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TypeScriptParser}.
 */
public interface TypeScriptParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#typeScriptStatement}.
	 * @param ctx the parse tree
	 */
	void enterTypeScriptStatement(TypeScriptParser.TypeScriptStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#typeScriptStatement}.
	 * @param ctx the parse tree
	 */
	void exitTypeScriptStatement(TypeScriptParser.TypeScriptStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(TypeScriptParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(TypeScriptParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(TypeScriptParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(TypeScriptParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(TypeScriptParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(TypeScriptParser.ExpressionContext ctx);
}