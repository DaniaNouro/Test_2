// Generated from E:/My_project_compiler/Test_2/src/antlr/AngularParser.g4 by ANTLR 4.13.2
package src.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AngularParser}.
 */
public interface AngularParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AngularParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AngularParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#component}.
	 * @param ctx the parse tree
	 */
	void enterComponent(AngularParser.ComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#component}.
	 * @param ctx the parse tree
	 */
	void exitComponent(AngularParser.ComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void enterComponentBody(AngularParser.ComponentBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void exitComponentBody(AngularParser.ComponentBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#mandatoryProperty}.
	 * @param ctx the parse tree
	 */
	void enterMandatoryProperty(AngularParser.MandatoryPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#mandatoryProperty}.
	 * @param ctx the parse tree
	 */
	void exitMandatoryProperty(AngularParser.MandatoryPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#optionalProperty}.
	 * @param ctx the parse tree
	 */
	void enterOptionalProperty(AngularParser.OptionalPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#optionalProperty}.
	 * @param ctx the parse tree
	 */
	void exitOptionalProperty(AngularParser.OptionalPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#propertyAssign}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAssign(AngularParser.PropertyAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#propertyAssign}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAssign(AngularParser.PropertyAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlTemplate}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTemplate(AngularParser.HtmlTemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlTemplate}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTemplate(AngularParser.HtmlTemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#template}.
	 * @param ctx the parse tree
	 */
	void enterTemplate(AngularParser.TemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#template}.
	 * @param ctx the parse tree
	 */
	void exitTemplate(AngularParser.TemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#templateUrl}.
	 * @param ctx the parse tree
	 */
	void enterTemplateUrl(AngularParser.TemplateUrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#templateUrl}.
	 * @param ctx the parse tree
	 */
	void exitTemplateUrl(AngularParser.TemplateUrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#styles}.
	 * @param ctx the parse tree
	 */
	void enterStyles(AngularParser.StylesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#styles}.
	 * @param ctx the parse tree
	 */
	void exitStyles(AngularParser.StylesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#standalone}.
	 * @param ctx the parse tree
	 */
	void enterStandalone(AngularParser.StandaloneContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#standalone}.
	 * @param ctx the parse tree
	 */
	void exitStandalone(AngularParser.StandaloneContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#binding}.
	 * @param ctx the parse tree
	 */
	void enterBinding(AngularParser.BindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#binding}.
	 * @param ctx the parse tree
	 */
	void exitBinding(AngularParser.BindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterDirective(AngularParser.DirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitDirective(AngularParser.DirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#interpolation}.
	 * @param ctx the parse tree
	 */
	void enterInterpolation(AngularParser.InterpolationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#interpolation}.
	 * @param ctx the parse tree
	 */
	void exitInterpolation(AngularParser.InterpolationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#propertyBinding}.
	 * @param ctx the parse tree
	 */
	void enterPropertyBinding(AngularParser.PropertyBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#propertyBinding}.
	 * @param ctx the parse tree
	 */
	void exitPropertyBinding(AngularParser.PropertyBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#eventBinding}.
	 * @param ctx the parse tree
	 */
	void enterEventBinding(AngularParser.EventBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#eventBinding}.
	 * @param ctx the parse tree
	 */
	void exitEventBinding(AngularParser.EventBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#twoWayBinding}.
	 * @param ctx the parse tree
	 */
	void enterTwoWayBinding(AngularParser.TwoWayBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#twoWayBinding}.
	 * @param ctx the parse tree
	 */
	void exitTwoWayBinding(AngularParser.TwoWayBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(AngularParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(AngularParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(AngularParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(AngularParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#pipeExpr}.
	 * @param ctx the parse tree
	 */
	void enterPipeExpr(AngularParser.PipeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#pipeExpr}.
	 * @param ctx the parse tree
	 */
	void exitPipeExpr(AngularParser.PipeExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ternaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpr(AngularParser.TernaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ternaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpr(AngularParser.TernaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#logicalOrExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpr(AngularParser.LogicalOrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#logicalOrExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpr(AngularParser.LogicalOrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#logicalAndExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpr(AngularParser.LogicalAndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#logicalAndExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpr(AngularParser.LogicalAndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#equalityExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(AngularParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#equalityExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(AngularParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(AngularParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(AngularParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#additiveExpr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(AngularParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#additiveExpr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(AngularParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#multiplicativeExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpr(AngularParser.MultiplicativeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#multiplicativeExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpr(AngularParser.MultiplicativeExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(AngularParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(AngularParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpr(AngularParser.PrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpr(AngularParser.PrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(AngularParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(AngularParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(AngularParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(AngularParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#objectAccess}.
	 * @param ctx the parse tree
	 */
	void enterObjectAccess(AngularParser.ObjectAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#objectAccess}.
	 * @param ctx the parse tree
	 */
	void exitObjectAccess(AngularParser.ObjectAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ngIfDirective}.
	 * @param ctx the parse tree
	 */
	void enterNgIfDirective(AngularParser.NgIfDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ngIfDirective}.
	 * @param ctx the parse tree
	 */
	void exitNgIfDirective(AngularParser.NgIfDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ngForDirective}.
	 * @param ctx the parse tree
	 */
	void enterNgForDirective(AngularParser.NgForDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ngForDirective}.
	 * @param ctx the parse tree
	 */
	void exitNgForDirective(AngularParser.NgForDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void enterForExpression(AngularParser.ForExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void exitForExpression(AngularParser.ForExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#forOptions}.
	 * @param ctx the parse tree
	 */
	void enterForOptions(AngularParser.ForOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#forOptions}.
	 * @param ctx the parse tree
	 */
	void exitForOptions(AngularParser.ForOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void enterHtmlDocument(AngularParser.HtmlDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void exitHtmlDocument(AngularParser.HtmlDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 */
	void enterScriptletOrSeaWs(AngularParser.ScriptletOrSeaWsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 */
	void exitScriptletOrSeaWs(AngularParser.ScriptletOrSeaWsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElements(AngularParser.HtmlElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElements(AngularParser.HtmlElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(AngularParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(AngularParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(AngularParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(AngularParser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(AngularParser.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(AngularParser.HtmlAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ngfor_body}.
	 * @param ctx the parse tree
	 */
	void enterNgfor_body(AngularParser.Ngfor_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ngfor_body}.
	 * @param ctx the parse tree
	 */
	void exitNgfor_body(AngularParser.Ngfor_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void enterHtmlChardata(AngularParser.HtmlChardataContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void exitHtmlChardata(AngularParser.HtmlChardataContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void enterHtmlMisc(AngularParser.HtmlMiscContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void exitHtmlMisc(AngularParser.HtmlMiscContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void enterHtmlComment(AngularParser.HtmlCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void exitHtmlComment(AngularParser.HtmlCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(AngularParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(AngularParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#style}.
	 * @param ctx the parse tree
	 */
	void enterStyle(AngularParser.StyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#style}.
	 * @param ctx the parse tree
	 */
	void exitStyle(AngularParser.StyleContext ctx);
}