// Generated from E:/My_project_compiler/Test_2/src/antlr/IntegrationParser.g4 by ANTLR 4.13.2
package src.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link IntegrationParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface IntegrationParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link IntegrationParser#htmlDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlDocument(IntegrationParser.HtmlDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntegrationParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(IntegrationParser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntegrationParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(IntegrationParser.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntegrationParser#tagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagName(IntegrationParser.TagNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntegrationParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(IntegrationParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntegrationParser#angularDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAngularDirective(IntegrationParser.AngularDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntegrationParser#angularExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAngularExpression(IntegrationParser.AngularExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntegrationParser#angularInterpolation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAngularInterpolation(IntegrationParser.AngularInterpolationContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntegrationParser#binding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinding(IntegrationParser.BindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntegrationParser#interpolation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolation(IntegrationParser.InterpolationContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntegrationParser#propertyBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyBinding(IntegrationParser.PropertyBindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntegrationParser#eventBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventBinding(IntegrationParser.EventBindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntegrationParser#twoWayBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTwoWayBinding(IntegrationParser.TwoWayBindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntegrationParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(IntegrationParser.ExpressionContext ctx);
}