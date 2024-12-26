// Generated from E:/My_project_compiler/Test_2/src/antlr/IntegrationParser.g4 by ANTLR 4.13.2
package src.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IntegrationParser}.
 */
public interface IntegrationParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IntegrationParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void enterHtmlDocument(IntegrationParser.HtmlDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntegrationParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void exitHtmlDocument(IntegrationParser.HtmlDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntegrationParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(IntegrationParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntegrationParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(IntegrationParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntegrationParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(IntegrationParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntegrationParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(IntegrationParser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntegrationParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterTagName(IntegrationParser.TagNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntegrationParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitTagName(IntegrationParser.TagNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntegrationParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(IntegrationParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntegrationParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(IntegrationParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntegrationParser#angularDirective}.
	 * @param ctx the parse tree
	 */
	void enterAngularDirective(IntegrationParser.AngularDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntegrationParser#angularDirective}.
	 * @param ctx the parse tree
	 */
	void exitAngularDirective(IntegrationParser.AngularDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntegrationParser#angularExpression}.
	 * @param ctx the parse tree
	 */
	void enterAngularExpression(IntegrationParser.AngularExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntegrationParser#angularExpression}.
	 * @param ctx the parse tree
	 */
	void exitAngularExpression(IntegrationParser.AngularExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntegrationParser#angularInterpolation}.
	 * @param ctx the parse tree
	 */
	void enterAngularInterpolation(IntegrationParser.AngularInterpolationContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntegrationParser#angularInterpolation}.
	 * @param ctx the parse tree
	 */
	void exitAngularInterpolation(IntegrationParser.AngularInterpolationContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntegrationParser#binding}.
	 * @param ctx the parse tree
	 */
	void enterBinding(IntegrationParser.BindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntegrationParser#binding}.
	 * @param ctx the parse tree
	 */
	void exitBinding(IntegrationParser.BindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntegrationParser#interpolation}.
	 * @param ctx the parse tree
	 */
	void enterInterpolation(IntegrationParser.InterpolationContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntegrationParser#interpolation}.
	 * @param ctx the parse tree
	 */
	void exitInterpolation(IntegrationParser.InterpolationContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntegrationParser#propertyBinding}.
	 * @param ctx the parse tree
	 */
	void enterPropertyBinding(IntegrationParser.PropertyBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntegrationParser#propertyBinding}.
	 * @param ctx the parse tree
	 */
	void exitPropertyBinding(IntegrationParser.PropertyBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntegrationParser#eventBinding}.
	 * @param ctx the parse tree
	 */
	void enterEventBinding(IntegrationParser.EventBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntegrationParser#eventBinding}.
	 * @param ctx the parse tree
	 */
	void exitEventBinding(IntegrationParser.EventBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntegrationParser#twoWayBinding}.
	 * @param ctx the parse tree
	 */
	void enterTwoWayBinding(IntegrationParser.TwoWayBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntegrationParser#twoWayBinding}.
	 * @param ctx the parse tree
	 */
	void exitTwoWayBinding(IntegrationParser.TwoWayBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntegrationParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(IntegrationParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntegrationParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(IntegrationParser.ExpressionContext ctx);
}