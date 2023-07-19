// Generated from MyLanguageV1Code.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MyLanguageV1CodeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, ENDIF=3, PRINT=4, INT=5, SHIFTLEFT=6, DO=7, WHILE=8, RETURN=9, 
		PLUS=10, EQUAL=11, ASSIGN=12, NOTEQUAL=13, SEMICOLON=14, LPAREN=15, RPAREN=16, 
		LBRACE=17, RBRACE=18, INTEGER=19, NAME=20, NAME_TOKEN=21, WS=22;
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_statement = 2, RULE_returnstmt = 3, 
		RULE_subprogram_dec = 4, RULE_subprogram_inv = 5, RULE_dowhilestmt = 6, 
		RULE_shiftstmt = 7, RULE_ifstmt = 8, RULE_printstmt = 9, RULE_assignstmt = 10, 
		RULE_expression = 11, RULE_term = 12, RULE_identifier = 13, RULE_integer = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaration", "statement", "returnstmt", "subprogram_dec", 
			"subprogram_inv", "dowhilestmt", "shiftstmt", "ifstmt", "printstmt", 
			"assignstmt", "expression", "term", "identifier", "integer"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'endif'", "'print'", "'int'", "'<<'", "'do'", 
			"'while'", "'return'", "'+'", "'=='", "'='", "'!='", "';'", "'('", "')'", 
			"'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "ENDIF", "PRINT", "INT", "SHIFTLEFT", "DO", "WHILE", 
			"RETURN", "PLUS", "EQUAL", "ASSIGN", "NOTEQUAL", "SEMICOLON", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "INTEGER", "NAME", "NAME_TOKEN", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MyLanguageV1Code.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyLanguageV1CodeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MyLanguageV1CodeParser.EOF, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<Subprogram_decContext> subprogram_dec() {
			return getRuleContexts(Subprogram_decContext.class);
		}
		public Subprogram_decContext subprogram_dec(int i) {
			return getRuleContext(Subprogram_decContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			System.out.println("%include \"asm_io.inc\"");
			                System.out.println("segment .bss"); 
			setState(34);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(31);
					declaration();
					}
					} 
				}
				setState(36);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			System.out.println("segment .text"); 
			                System.out.println("\tglobal asm_main"); 
			                System.out.println("asm_main:"); 
			                System.out.println("\tenter 0,0"); 
			                System.out.println("\tpusha"); 
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1049234L) != 0)) {
				{
				{
				setState(38);
				statement();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			System.out.println("\tpopa"); 
			                System.out.println("\tmov eax,0"); 
			                System.out.println("\tleave"); 
			                System.out.println("\tret"); 
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(45);
				subprogram_dec();
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public Token a;
		public TerminalNode INT() { return getToken(MyLanguageV1CodeParser.INT, 0); }
		public TerminalNode SEMICOLON() { return getToken(MyLanguageV1CodeParser.SEMICOLON, 0); }
		public TerminalNode NAME() { return getToken(MyLanguageV1CodeParser.NAME, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			int a; 
			setState(54);
			match(INT);
			setState(55);
			((DeclarationContext)_localctx).a = match(NAME);
			setState(56);
			match(SEMICOLON);
			System.out.println("\t"+(((DeclarationContext)_localctx).a!=null?((DeclarationContext)_localctx).a.getText():null) + "  resd 1");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public IfstmtContext ifstmt() {
			return getRuleContext(IfstmtContext.class,0);
		}
		public PrintstmtContext printstmt() {
			return getRuleContext(PrintstmtContext.class,0);
		}
		public AssignstmtContext assignstmt() {
			return getRuleContext(AssignstmtContext.class,0);
		}
		public ShiftstmtContext shiftstmt() {
			return getRuleContext(ShiftstmtContext.class,0);
		}
		public DowhilestmtContext dowhilestmt() {
			return getRuleContext(DowhilestmtContext.class,0);
		}
		public Subprogram_invContext subprogram_inv() {
			return getRuleContext(Subprogram_invContext.class,0);
		}
		public ReturnstmtContext returnstmt() {
			return getRuleContext(ReturnstmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				ifstmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				printstmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				assignstmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
				shiftstmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(63);
				dowhilestmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(64);
				subprogram_inv();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(65);
				returnstmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnstmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(MyLanguageV1CodeParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MyLanguageV1CodeParser.SEMICOLON, 0); }
		public ReturnstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).enterReturnstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).exitReturnstmt(this);
		}
	}

	public final ReturnstmtContext returnstmt() throws RecognitionException {
		ReturnstmtContext _localctx = new ReturnstmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_returnstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(RETURN);
			setState(69);
			expression();
			setState(70);
			match(SEMICOLON);

			        System.out.println("\tleave");
			        System.out.println("\tret");
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Subprogram_decContext extends ParserRuleContext {
		public Token a;
		public TerminalNode INT() { return getToken(MyLanguageV1CodeParser.INT, 0); }
		public TerminalNode LPAREN() { return getToken(MyLanguageV1CodeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MyLanguageV1CodeParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(MyLanguageV1CodeParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(MyLanguageV1CodeParser.RBRACE, 0); }
		public TerminalNode NAME() { return getToken(MyLanguageV1CodeParser.NAME, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Subprogram_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprogram_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).enterSubprogram_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).exitSubprogram_dec(this);
		}
	}

	public final Subprogram_decContext subprogram_dec() throws RecognitionException {
		Subprogram_decContext _localctx = new Subprogram_decContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_subprogram_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			int a;
			setState(74);
			match(INT);
			setState(75);
			((Subprogram_decContext)_localctx).a = match(NAME);
			setState(76);
			match(LPAREN);
			setState(77);
			match(RPAREN);
			setState(78);
			match(LBRACE);

			        System.out.println("\t"+(((Subprogram_decContext)_localctx).a!=null?((Subprogram_decContext)_localctx).a.getText():null) + ":");
			        System.out.println("\tenter 0,0");
			        //System.out.println("\tpusha");
			    
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1049234L) != 0)) {
				{
				{
				setState(80);
				statement();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			       // System.out.println("\tpopa");
			        System.out.println("\tleave");
			        System.out.println("\tret");
			    
			setState(87);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Subprogram_invContext extends ParserRuleContext {
		public IdentifierContext a;
		public IdentifierContext identifier;
		public TerminalNode ASSIGN() { return getToken(MyLanguageV1CodeParser.ASSIGN, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(MyLanguageV1CodeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MyLanguageV1CodeParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(MyLanguageV1CodeParser.SEMICOLON, 0); }
		public Subprogram_invContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprogram_inv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).enterSubprogram_inv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).exitSubprogram_inv(this);
		}
	}

	public final Subprogram_invContext subprogram_inv() throws RecognitionException {
		Subprogram_invContext _localctx = new Subprogram_invContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_subprogram_inv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			int a;
			setState(90);
			((Subprogram_invContext)_localctx).a = ((Subprogram_invContext)_localctx).identifier = identifier();
			setState(91);
			match(ASSIGN);
			setState(92);
			((Subprogram_invContext)_localctx).identifier = identifier();
			setState(93);
			match(LPAREN);
			setState(94);
			match(RPAREN);
			setState(95);
			match(SEMICOLON);

			        System.out.println("\tcall "+(((Subprogram_invContext)_localctx).identifier!=null?_input.getText(((Subprogram_invContext)_localctx).identifier.start,((Subprogram_invContext)_localctx).identifier.stop):null));
			        System.out.println("\tmov ["+(((Subprogram_invContext)_localctx).a!=null?_input.getText(((Subprogram_invContext)_localctx).a.start,((Subprogram_invContext)_localctx).a.stop):null)+"], eax");
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DowhilestmtContext extends ParserRuleContext {
		public Token DO;
		public Token WHILE;
		public IdentifierContext a;
		public IntegerContext b;
		public TerminalNode DO() { return getToken(MyLanguageV1CodeParser.DO, 0); }
		public TerminalNode WHILE() { return getToken(MyLanguageV1CodeParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(MyLanguageV1CodeParser.LPAREN, 0); }
		public TerminalNode NOTEQUAL() { return getToken(MyLanguageV1CodeParser.NOTEQUAL, 0); }
		public TerminalNode RPAREN() { return getToken(MyLanguageV1CodeParser.RPAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public DowhilestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dowhilestmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).enterDowhilestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).exitDowhilestmt(this);
		}
	}

	public final DowhilestmtContext dowhilestmt() throws RecognitionException {
		DowhilestmtContext _localctx = new DowhilestmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dowhilestmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			int a,b;
			String labelDo,labelWhile;
			setState(100);
			((DowhilestmtContext)_localctx).DO = match(DO);

			    labelDo = "label_do_"+Integer.toString((((DowhilestmtContext)_localctx).DO!=null?((DowhilestmtContext)_localctx).DO.getTokenIndex():0));
			    System.out.println(labelDo+":");

			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1049234L) != 0)) {
				{
				{
				setState(102);
				statement();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
			((DowhilestmtContext)_localctx).WHILE = match(WHILE);
			setState(109);
			match(LPAREN);
			setState(110);
			((DowhilestmtContext)_localctx).a = identifier();
			setState(111);
			match(NOTEQUAL);
			setState(112);
			((DowhilestmtContext)_localctx).b = integer();
			setState(113);
			match(RPAREN);

			    System.out.println("\tcmp dword "+((DowhilestmtContext)_localctx).a.toString+","+((DowhilestmtContext)_localctx).b.toString);
			    labelWhile = "label_while_"+Integer.toString((((DowhilestmtContext)_localctx).WHILE!=null?((DowhilestmtContext)_localctx).WHILE.getTokenIndex():0));
			    System.out.println("\tjne "+labelDo);


			    System.out.println("\tjmp "+labelWhile);
			    System.out.println(labelWhile+":");

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ShiftstmtContext extends ParserRuleContext {
		public IdentifierContext a;
		public IntegerContext b;
		public TerminalNode SHIFTLEFT() { return getToken(MyLanguageV1CodeParser.SHIFTLEFT, 0); }
		public TerminalNode SEMICOLON() { return getToken(MyLanguageV1CodeParser.SEMICOLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public ShiftstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).enterShiftstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).exitShiftstmt(this);
		}
	}

	public final ShiftstmtContext shiftstmt() throws RecognitionException {
		ShiftstmtContext _localctx = new ShiftstmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_shiftstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 int a, b; 
			setState(118);
			((ShiftstmtContext)_localctx).a = identifier();
			setState(119);
			match(SHIFTLEFT);
			setState(120);
			((ShiftstmtContext)_localctx).b = integer();
			setState(121);
			match(SEMICOLON);

			        System.out.println("\tmov eax, [" + (((ShiftstmtContext)_localctx).a!=null?_input.getText(((ShiftstmtContext)_localctx).a.start,((ShiftstmtContext)_localctx).a.stop):null) + "]");
			        System.out.println("\tshl eax, " + (((ShiftstmtContext)_localctx).b!=null?_input.getText(((ShiftstmtContext)_localctx).b.start,((ShiftstmtContext)_localctx).b.stop):null));
			        System.out.println("\tmov [" + (((ShiftstmtContext)_localctx).a!=null?_input.getText(((ShiftstmtContext)_localctx).a.start,((ShiftstmtContext)_localctx).a.stop):null) + "], eax");
			        System.out.println("\tmov eax, [" + (((ShiftstmtContext)_localctx).a!=null?_input.getText(((ShiftstmtContext)_localctx).a.start,((ShiftstmtContext)_localctx).a.stop):null) + "]");

			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfstmtContext extends ParserRuleContext {
		public Token IF;
		public IdentifierContext a;
		public IntegerContext b;
		public TerminalNode IF() { return getToken(MyLanguageV1CodeParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(MyLanguageV1CodeParser.LPAREN, 0); }
		public TerminalNode EQUAL() { return getToken(MyLanguageV1CodeParser.EQUAL, 0); }
		public TerminalNode RPAREN() { return getToken(MyLanguageV1CodeParser.RPAREN, 0); }
		public TerminalNode ENDIF() { return getToken(MyLanguageV1CodeParser.ENDIF, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MyLanguageV1CodeParser.ELSE, 0); }
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).enterIfstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).exitIfstmt(this);
		}
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			int a,b;
			String labelElse, labelEndIf;
			setState(126);
			((IfstmtContext)_localctx).IF = match(IF);
			setState(127);
			match(LPAREN);
			setState(128);
			((IfstmtContext)_localctx).a = identifier();
			setState(129);
			match(EQUAL);
			setState(130);
			((IfstmtContext)_localctx).b = integer();
			setState(131);
			match(RPAREN);
			System.out.println("\tcmp dword "+((IfstmtContext)_localctx).a.toString+","+((IfstmtContext)_localctx).b.toString);
			             labelElse = "label_else_"+Integer.toString((((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getTokenIndex():0));
			             System.out.println("\tjnz "+labelElse); 
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1049234L) != 0)) {
				{
				{
				setState(133);
				statement();
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 labelEndIf = "label_endif_"+Integer.toString((((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getTokenIndex():0));
			              System.out.println("\tjmp "+labelEndIf);
			              System.out.println(labelElse+":"); 
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(140);
				match(ELSE);
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1049234L) != 0)) {
					{
					{
					setState(141);
					statement();
					}
					}
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				System.out.println(labelEndIf+":");
				}
			}

			setState(150);
			match(ENDIF);
			System.out.println(labelEndIf+":");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintstmtContext extends ParserRuleContext {
		public TermContext term;
		public TerminalNode PRINT() { return getToken(MyLanguageV1CodeParser.PRINT, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MyLanguageV1CodeParser.SEMICOLON, 0); }
		public PrintstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).enterPrintstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).exitPrintstmt(this);
		}
	}

	public final PrintstmtContext printstmt() throws RecognitionException {
		PrintstmtContext _localctx = new PrintstmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_printstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(PRINT);
			setState(154);
			((PrintstmtContext)_localctx).term = term();
			setState(155);
			match(SEMICOLON);
			System.out.println("\tmov eax, "+((PrintstmtContext)_localctx).term.toString);
			                System.out.println("\tcall print_int");
			                System.out.println("\tcall print_nl");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignstmtContext extends ParserRuleContext {
		public Token a;
		public TerminalNode ASSIGN() { return getToken(MyLanguageV1CodeParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MyLanguageV1CodeParser.SEMICOLON, 0); }
		public TerminalNode NAME() { return getToken(MyLanguageV1CodeParser.NAME, 0); }
		public AssignstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).enterAssignstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).exitAssignstmt(this);
		}
	}

	public final AssignstmtContext assignstmt() throws RecognitionException {
		AssignstmtContext _localctx = new AssignstmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			int a; 
			setState(159);
			((AssignstmtContext)_localctx).a = match(NAME);
			setState(160);
			match(ASSIGN);
			setState(161);
			expression();
			setState(162);
			match(SEMICOLON);
			System.out.println("\tmov ["+(((AssignstmtContext)_localctx).a!=null?((AssignstmtContext)_localctx).a.getText():null)+"], eax");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public TermContext a;
		public TermContext b;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(MyLanguageV1CodeParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(MyLanguageV1CodeParser.PLUS, i);
		}
		public List<TerminalNode> SHIFTLEFT() { return getTokens(MyLanguageV1CodeParser.SHIFTLEFT); }
		public TerminalNode SHIFTLEFT(int i) {
			return getToken(MyLanguageV1CodeParser.SHIFTLEFT, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 int a, b; 
			setState(166);
			((ExpressionContext)_localctx).a = term();
			 System.out.println("\tmov eax,"+((ExpressionContext)_localctx).a.toString+";"); 
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SHIFTLEFT || _la==PLUS) {
				{
				setState(176);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(168);
					match(PLUS);
					setState(169);
					((ExpressionContext)_localctx).b = term();
					 System.out.println("\tadd eax, "+((ExpressionContext)_localctx).b.toString+";"); 
					}
					break;
				case SHIFTLEFT:
					{
					setState(172);
					match(SHIFTLEFT);
					setState(173);
					((ExpressionContext)_localctx).b = term();
					 System.out.println("\tmov ebx, "+((ExpressionContext)_localctx).b.toString+";");
									  System.out.println("\tshl dword [eax], ebx;"); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public String toString;
		public IdentifierContext identifier;
		public IntegerContext integer;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_term);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				((TermContext)_localctx).identifier = identifier();
				((TermContext)_localctx).toString =  ((TermContext)_localctx).identifier.toString;
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				((TermContext)_localctx).integer = integer();
				((TermContext)_localctx).toString =  ((TermContext)_localctx).integer.toString;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public String toString;
		public Token NAME;
		public TerminalNode NAME() { return getToken(MyLanguageV1CodeParser.NAME, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			((IdentifierContext)_localctx).NAME = match(NAME);
			((IdentifierContext)_localctx).toString =  "["+(((IdentifierContext)_localctx).NAME!=null?((IdentifierContext)_localctx).NAME.getText():null)+"]";
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntegerContext extends ParserRuleContext {
		public String toString;
		public Token INTEGER;
		public TerminalNode INTEGER() { return getToken(MyLanguageV1CodeParser.INTEGER, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).exitInteger(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			((IntegerContext)_localctx).INTEGER = match(INTEGER);
			((IntegerContext)_localctx).toString =  (((IntegerContext)_localctx).INTEGER!=null?((IntegerContext)_localctx).INTEGER.getText():null);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0016\u00c4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001"+
		"\u0000\u0005\u0000!\b\u0000\n\u0000\f\u0000$\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u0000(\b\u0000\n\u0000\f\u0000+\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u0000/\b\u0000\n\u0000\f\u00002\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002C\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004R\b"+
		"\u0004\n\u0004\f\u0004U\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006h\b\u0006\n\u0006\f\u0006k\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u0087\b\b\n"+
		"\b\f\b\u008a\t\b\u0001\b\u0001\b\u0001\b\u0005\b\u008f\b\b\n\b\f\b\u0092"+
		"\t\b\u0001\b\u0003\b\u0095\b\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u00b1\b\u000b\n\u000b\f\u000b\u00b4\t\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00bc\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0000\u0000\u000f\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u0000\u0000\u00c5\u0000\u001e\u0001\u0000\u0000\u0000\u00025\u0001\u0000"+
		"\u0000\u0000\u0004B\u0001\u0000\u0000\u0000\u0006D\u0001\u0000\u0000\u0000"+
		"\bI\u0001\u0000\u0000\u0000\nY\u0001\u0000\u0000\u0000\fb\u0001\u0000"+
		"\u0000\u0000\u000eu\u0001\u0000\u0000\u0000\u0010|\u0001\u0000\u0000\u0000"+
		"\u0012\u0099\u0001\u0000\u0000\u0000\u0014\u009e\u0001\u0000\u0000\u0000"+
		"\u0016\u00a5\u0001\u0000\u0000\u0000\u0018\u00bb\u0001\u0000\u0000\u0000"+
		"\u001a\u00bd\u0001\u0000\u0000\u0000\u001c\u00c0\u0001\u0000\u0000\u0000"+
		"\u001e\"\u0006\u0000\uffff\uffff\u0000\u001f!\u0003\u0002\u0001\u0000"+
		" \u001f\u0001\u0000\u0000\u0000!$\u0001\u0000\u0000\u0000\" \u0001\u0000"+
		"\u0000\u0000\"#\u0001\u0000\u0000\u0000#%\u0001\u0000\u0000\u0000$\"\u0001"+
		"\u0000\u0000\u0000%)\u0006\u0000\uffff\uffff\u0000&(\u0003\u0004\u0002"+
		"\u0000\'&\u0001\u0000\u0000\u0000(+\u0001\u0000\u0000\u0000)\'\u0001\u0000"+
		"\u0000\u0000)*\u0001\u0000\u0000\u0000*,\u0001\u0000\u0000\u0000+)\u0001"+
		"\u0000\u0000\u0000,0\u0006\u0000\uffff\uffff\u0000-/\u0003\b\u0004\u0000"+
		".-\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001\u0000\u0000"+
		"\u000001\u0001\u0000\u0000\u000013\u0001\u0000\u0000\u000020\u0001\u0000"+
		"\u0000\u000034\u0005\u0000\u0000\u00014\u0001\u0001\u0000\u0000\u0000"+
		"56\u0006\u0001\uffff\uffff\u000067\u0005\u0005\u0000\u000078\u0005\u0014"+
		"\u0000\u000089\u0005\u000e\u0000\u00009:\u0006\u0001\uffff\uffff\u0000"+
		":\u0003\u0001\u0000\u0000\u0000;C\u0003\u0010\b\u0000<C\u0003\u0012\t"+
		"\u0000=C\u0003\u0014\n\u0000>C\u0003\u000e\u0007\u0000?C\u0003\f\u0006"+
		"\u0000@C\u0003\n\u0005\u0000AC\u0003\u0006\u0003\u0000B;\u0001\u0000\u0000"+
		"\u0000B<\u0001\u0000\u0000\u0000B=\u0001\u0000\u0000\u0000B>\u0001\u0000"+
		"\u0000\u0000B?\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BA\u0001"+
		"\u0000\u0000\u0000C\u0005\u0001\u0000\u0000\u0000DE\u0005\t\u0000\u0000"+
		"EF\u0003\u0016\u000b\u0000FG\u0005\u000e\u0000\u0000GH\u0006\u0003\uffff"+
		"\uffff\u0000H\u0007\u0001\u0000\u0000\u0000IJ\u0006\u0004\uffff\uffff"+
		"\u0000JK\u0005\u0005\u0000\u0000KL\u0005\u0014\u0000\u0000LM\u0005\u000f"+
		"\u0000\u0000MN\u0005\u0010\u0000\u0000NO\u0005\u0011\u0000\u0000OS\u0006"+
		"\u0004\uffff\uffff\u0000PR\u0003\u0004\u0002\u0000QP\u0001\u0000\u0000"+
		"\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000"+
		"\u0000\u0000TV\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000VW\u0006"+
		"\u0004\uffff\uffff\u0000WX\u0005\u0012\u0000\u0000X\t\u0001\u0000\u0000"+
		"\u0000YZ\u0006\u0005\uffff\uffff\u0000Z[\u0003\u001a\r\u0000[\\\u0005"+
		"\f\u0000\u0000\\]\u0003\u001a\r\u0000]^\u0005\u000f\u0000\u0000^_\u0005"+
		"\u0010\u0000\u0000_`\u0005\u000e\u0000\u0000`a\u0006\u0005\uffff\uffff"+
		"\u0000a\u000b\u0001\u0000\u0000\u0000bc\u0006\u0006\uffff\uffff\u0000"+
		"cd\u0006\u0006\uffff\uffff\u0000de\u0005\u0007\u0000\u0000ei\u0006\u0006"+
		"\uffff\uffff\u0000fh\u0003\u0004\u0002\u0000gf\u0001\u0000\u0000\u0000"+
		"hk\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000"+
		"\u0000jl\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000lm\u0005\b\u0000"+
		"\u0000mn\u0005\u000f\u0000\u0000no\u0003\u001a\r\u0000op\u0005\r\u0000"+
		"\u0000pq\u0003\u001c\u000e\u0000qr\u0005\u0010\u0000\u0000rs\u0006\u0006"+
		"\uffff\uffff\u0000st\u0006\u0006\uffff\uffff\u0000t\r\u0001\u0000\u0000"+
		"\u0000uv\u0006\u0007\uffff\uffff\u0000vw\u0003\u001a\r\u0000wx\u0005\u0006"+
		"\u0000\u0000xy\u0003\u001c\u000e\u0000yz\u0005\u000e\u0000\u0000z{\u0006"+
		"\u0007\uffff\uffff\u0000{\u000f\u0001\u0000\u0000\u0000|}\u0006\b\uffff"+
		"\uffff\u0000}~\u0006\b\uffff\uffff\u0000~\u007f\u0005\u0001\u0000\u0000"+
		"\u007f\u0080\u0005\u000f\u0000\u0000\u0080\u0081\u0003\u001a\r\u0000\u0081"+
		"\u0082\u0005\u000b\u0000\u0000\u0082\u0083\u0003\u001c\u000e\u0000\u0083"+
		"\u0084\u0005\u0010\u0000\u0000\u0084\u0088\u0006\b\uffff\uffff\u0000\u0085"+
		"\u0087\u0003\u0004\u0002\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0087"+
		"\u008a\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088"+
		"\u0089\u0001\u0000\u0000\u0000\u0089\u008b\u0001\u0000\u0000\u0000\u008a"+
		"\u0088\u0001\u0000\u0000\u0000\u008b\u0094\u0006\b\uffff\uffff\u0000\u008c"+
		"\u0090\u0005\u0002\u0000\u0000\u008d\u008f\u0003\u0004\u0002\u0000\u008e"+
		"\u008d\u0001\u0000\u0000\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090"+
		"\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091"+
		"\u0093\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093"+
		"\u0095\u0006\b\uffff\uffff\u0000\u0094\u008c\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096"+
		"\u0097\u0005\u0003\u0000\u0000\u0097\u0098\u0006\b\uffff\uffff\u0000\u0098"+
		"\u0011\u0001\u0000\u0000\u0000\u0099\u009a\u0005\u0004\u0000\u0000\u009a"+
		"\u009b\u0003\u0018\f\u0000\u009b\u009c\u0005\u000e\u0000\u0000\u009c\u009d"+
		"\u0006\t\uffff\uffff\u0000\u009d\u0013\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0006\n\uffff\uffff\u0000\u009f\u00a0\u0005\u0014\u0000\u0000\u00a0\u00a1"+
		"\u0005\f\u0000\u0000\u00a1\u00a2\u0003\u0016\u000b\u0000\u00a2\u00a3\u0005"+
		"\u000e\u0000\u0000\u00a3\u00a4\u0006\n\uffff\uffff\u0000\u00a4\u0015\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0006\u000b\uffff\uffff\u0000\u00a6\u00a7"+
		"\u0003\u0018\f\u0000\u00a7\u00b2\u0006\u000b\uffff\uffff\u0000\u00a8\u00a9"+
		"\u0005\n\u0000\u0000\u00a9\u00aa\u0003\u0018\f\u0000\u00aa\u00ab\u0006"+
		"\u000b\uffff\uffff\u0000\u00ab\u00b1\u0001\u0000\u0000\u0000\u00ac\u00ad"+
		"\u0005\u0006\u0000\u0000\u00ad\u00ae\u0003\u0018\f\u0000\u00ae\u00af\u0006"+
		"\u000b\uffff\uffff\u0000\u00af\u00b1\u0001\u0000\u0000\u0000\u00b0\u00a8"+
		"\u0001\u0000\u0000\u0000\u00b0\u00ac\u0001\u0000\u0000\u0000\u00b1\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b3\u0017\u0001\u0000\u0000\u0000\u00b4\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0003\u001a\r\u0000\u00b6\u00b7\u0006"+
		"\f\uffff\uffff\u0000\u00b7\u00bc\u0001\u0000\u0000\u0000\u00b8\u00b9\u0003"+
		"\u001c\u000e\u0000\u00b9\u00ba\u0006\f\uffff\uffff\u0000\u00ba\u00bc\u0001"+
		"\u0000\u0000\u0000\u00bb\u00b5\u0001\u0000\u0000\u0000\u00bb\u00b8\u0001"+
		"\u0000\u0000\u0000\u00bc\u0019\u0001\u0000\u0000\u0000\u00bd\u00be\u0005"+
		"\u0014\u0000\u0000\u00be\u00bf\u0006\r\uffff\uffff\u0000\u00bf\u001b\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c1\u0005\u0013\u0000\u0000\u00c1\u00c2\u0006"+
		"\u000e\uffff\uffff\u0000\u00c2\u001d\u0001\u0000\u0000\u0000\f\")0BSi"+
		"\u0088\u0090\u0094\u00b0\u00b2\u00bb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}