// Generated from E:/Com/Test_2/Test_2/src/antlr/CssParser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CssParser}.
 */
public interface CssParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CssParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void enterStylesheet(CssParser.StylesheetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void exitStylesheet(CssParser.StylesheetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#rule}.
	 * @param ctx the parse tree
	 */
	void enterRule(CssParser.RuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#rule}.
	 * @param ctx the parse tree
	 */
	void exitRule(CssParser.RuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(CssParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(CssParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(CssParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(CssParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(CssParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(CssParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#valueItem}.
	 * @param ctx the parse tree
	 */
	void enterValueItem(CssParser.ValueItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#valueItem}.
	 * @param ctx the parse tree
	 */
	void exitValueItem(CssParser.ValueItemContext ctx);
}