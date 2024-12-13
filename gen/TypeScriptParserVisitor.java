// Generated from E:/Com/Test_2/Test_2/src/antlr/TypeScriptParser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TypeScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TypeScriptParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(TypeScriptParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#ts_classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTs_classDeclaration(TypeScriptParser.Ts_classDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#ts_classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTs_classBody(TypeScriptParser.Ts_classBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#ts_classBodyMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTs_classBodyMember(TypeScriptParser.Ts_classBodyMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#ts_enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTs_enumDeclaration(TypeScriptParser.Ts_enumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#ts_enumMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTs_enumMember(TypeScriptParser.Ts_enumMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#ts_classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTs_classMember(TypeScriptParser.Ts_classMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#ts_variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTs_variableDeclaration(TypeScriptParser.Ts_variableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#ts_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTs_array(TypeScriptParser.Ts_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#ts_methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTs_methodDeclaration(TypeScriptParser.Ts_methodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#ts_methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTs_methodBody(TypeScriptParser.Ts_methodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#ts_parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTs_parameterList(TypeScriptParser.Ts_parameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#ts_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTs_parameter(TypeScriptParser.Ts_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#ts_typeWithBrackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTs_typeWithBrackets(TypeScriptParser.Ts_typeWithBracketsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#ts_objectType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTs_objectType(TypeScriptParser.Ts_objectTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#ts_objectTypeProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTs_objectTypeProperty(TypeScriptParser.Ts_objectTypePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#ts_enumType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTs_enumType(TypeScriptParser.Ts_enumTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#ts_tupleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTs_tupleType(TypeScriptParser.Ts_tupleTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#ts_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTs_value(TypeScriptParser.Ts_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#ts_arrowFunctionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTs_arrowFunctionDeclaration(TypeScriptParser.Ts_arrowFunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#ts_templateString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTs_templateString(TypeScriptParser.Ts_templateStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#ts_templateExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTs_templateExpression(TypeScriptParser.Ts_templateExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#ts_tupleValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTs_tupleValue(TypeScriptParser.Ts_tupleValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#ts_object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTs_object(TypeScriptParser.Ts_objectContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#ts_objectProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTs_objectProperty(TypeScriptParser.Ts_objectPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#ts_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTs_statement(TypeScriptParser.Ts_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#ts_returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTs_returnStatement(TypeScriptParser.Ts_returnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#ts_methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTs_methodInvocation(TypeScriptParser.Ts_methodInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#ts_argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTs_argumentList(TypeScriptParser.Ts_argumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#ts_negation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTs_negation(TypeScriptParser.Ts_negationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#ts_ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTs_ifStatement(TypeScriptParser.Ts_ifStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#ts_ex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTs_ex(TypeScriptParser.Ts_exContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#ts_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTs_expression(TypeScriptParser.Ts_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#ts_p1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTs_p1(TypeScriptParser.Ts_p1Context ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#ts_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTs_assignment(TypeScriptParser.Ts_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#ts_parenthesizedValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTs_parenthesizedValue(TypeScriptParser.Ts_parenthesizedValueContext ctx);
}