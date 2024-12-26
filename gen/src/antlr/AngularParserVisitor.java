// Generated from E:/My_project_compiler/Test_2/src/antlr/AngularParser.g4 by ANTLR 4.13.2
package src.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AngularParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AngularParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(AngularParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent(AngularParser.ComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#componentBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentBody(AngularParser.ComponentBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#mandatoryProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMandatoryProperty(AngularParser.MandatoryPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#optionalProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalProperty(AngularParser.OptionalPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#propertyAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAssign(AngularParser.PropertyAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlTemplate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTemplate(AngularParser.HtmlTemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate(AngularParser.TemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#templateUrl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateUrl(AngularParser.TemplateUrlContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#styles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyles(AngularParser.StylesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#standalone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandalone(AngularParser.StandaloneContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#binding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinding(AngularParser.BindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirective(AngularParser.DirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#interpolation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolation(AngularParser.InterpolationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#propertyBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyBinding(AngularParser.PropertyBindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#eventBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventBinding(AngularParser.EventBindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#twoWayBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTwoWayBinding(AngularParser.TwoWayBindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(AngularParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(AngularParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#pipeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPipeExpr(AngularParser.PipeExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ternaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExpr(AngularParser.TernaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#logicalOrExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpr(AngularParser.LogicalOrExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#logicalAndExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpr(AngularParser.LogicalAndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#equalityExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(AngularParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#relationalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(AngularParser.RelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#additiveExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(AngularParser.AdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#multiplicativeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpr(AngularParser.MultiplicativeExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#unaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(AngularParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpr(AngularParser.PrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(AngularParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(AngularParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#objectAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectAccess(AngularParser.ObjectAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ngIfDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgIfDirective(AngularParser.NgIfDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ngForDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgForDirective(AngularParser.NgForDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#forExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForExpression(AngularParser.ForExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#forOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForOptions(AngularParser.ForOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlDocument(AngularParser.HtmlDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptletOrSeaWs(AngularParser.ScriptletOrSeaWsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElements(AngularParser.HtmlElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(AngularParser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(AngularParser.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttribute(AngularParser.HtmlAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ngfor_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgfor_body(AngularParser.Ngfor_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlChardata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlChardata(AngularParser.HtmlChardataContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlMisc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlMisc(AngularParser.HtmlMiscContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlComment(AngularParser.HtmlCommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(AngularParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#style}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyle(AngularParser.StyleContext ctx);
}