// Generated from C:/Users/Agata Rychter/IdeaProjects/Grammar\JavaGrammar.g4 by ANTLR 4.7.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaGrammarParser}.
 */
public interface JavaGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#prule}.
	 * @param ctx the parse tree
	 */
	void enterPrule(JavaGrammarParser.PruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#prule}.
	 * @param ctx the parse tree
	 */
	void exitPrule(JavaGrammarParser.PruleContext ctx);
}