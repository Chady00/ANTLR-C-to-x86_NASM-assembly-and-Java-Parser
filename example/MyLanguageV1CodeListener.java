// Generated from MyLanguageV1Code.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyLanguageV1CodeParser}.
 */
public interface MyLanguageV1CodeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyLanguageV1CodeParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MyLanguageV1CodeParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageV1CodeParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MyLanguageV1CodeParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageV1CodeParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(MyLanguageV1CodeParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageV1CodeParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(MyLanguageV1CodeParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageV1CodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MyLanguageV1CodeParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageV1CodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MyLanguageV1CodeParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageV1CodeParser#returnstmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnstmt(MyLanguageV1CodeParser.ReturnstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageV1CodeParser#returnstmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnstmt(MyLanguageV1CodeParser.ReturnstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageV1CodeParser#subprogram_dec}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_dec(MyLanguageV1CodeParser.Subprogram_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageV1CodeParser#subprogram_dec}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_dec(MyLanguageV1CodeParser.Subprogram_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageV1CodeParser#subprogram_inv}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_inv(MyLanguageV1CodeParser.Subprogram_invContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageV1CodeParser#subprogram_inv}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_inv(MyLanguageV1CodeParser.Subprogram_invContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageV1CodeParser#dowhilestmt}.
	 * @param ctx the parse tree
	 */
	void enterDowhilestmt(MyLanguageV1CodeParser.DowhilestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageV1CodeParser#dowhilestmt}.
	 * @param ctx the parse tree
	 */
	void exitDowhilestmt(MyLanguageV1CodeParser.DowhilestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageV1CodeParser#shiftstmt}.
	 * @param ctx the parse tree
	 */
	void enterShiftstmt(MyLanguageV1CodeParser.ShiftstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageV1CodeParser#shiftstmt}.
	 * @param ctx the parse tree
	 */
	void exitShiftstmt(MyLanguageV1CodeParser.ShiftstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageV1CodeParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfstmt(MyLanguageV1CodeParser.IfstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageV1CodeParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfstmt(MyLanguageV1CodeParser.IfstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageV1CodeParser#printstmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintstmt(MyLanguageV1CodeParser.PrintstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageV1CodeParser#printstmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintstmt(MyLanguageV1CodeParser.PrintstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageV1CodeParser#assignstmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignstmt(MyLanguageV1CodeParser.AssignstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageV1CodeParser#assignstmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignstmt(MyLanguageV1CodeParser.AssignstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageV1CodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MyLanguageV1CodeParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageV1CodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MyLanguageV1CodeParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageV1CodeParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(MyLanguageV1CodeParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageV1CodeParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(MyLanguageV1CodeParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageV1CodeParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(MyLanguageV1CodeParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageV1CodeParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(MyLanguageV1CodeParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageV1CodeParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(MyLanguageV1CodeParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageV1CodeParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(MyLanguageV1CodeParser.IntegerContext ctx);
}