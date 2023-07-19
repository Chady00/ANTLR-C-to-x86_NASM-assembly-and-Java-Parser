// corrected code : after q4 A simple syntax-directed translator for a simple language

grammar MyLanguageV1Code;

// Root non-terminal symbol
// A program is a bunch of declarations followed by a bunch of statements
// The Java code outputs the necessary NASM code around these declarations

program         : 
                {System.out.println("%include \"asm_io.inc\"");
                System.out.println("segment .bss"); }
                declaration*
                {System.out.println("segment .text"); 
                System.out.println("\tglobal asm_main"); 
                System.out.println("asm_main:"); 
                System.out.println("\tenter 0,0"); 
                System.out.println("\tpusha"); }
                statement*
                {System.out.println("\tpopa"); 
                System.out.println("\tmov eax,0"); 
                System.out.println("\tleave"); 
                System.out.println("\tret"); }
                subprogram_dec*
                EOF
                ;

// Parse rule for variable declarations

declaration   : 
              {int a; }
              INT a=NAME SEMICOLON
              {System.out.println("\t"+$a.text + "  resd 1");}
              ;

// Parse rule for statements

statement      : 
                ifstmt 
                |printstmt 
                |assignstmt
                |shiftstmt 
                |dowhilestmt
                |subprogram_inv
                |returnstmt
               ;

// Parse rule for return statements
returnstmt:
    RETURN expression SEMICOLON
    {
        System.out.println("\tleave");
        System.out.println("\tret");
    }
    ;

// parsing rule for subprogram declaration
subprogram_dec:
    {int a;}
    INT a=NAME LPAREN RPAREN LBRACE  
    {
        System.out.println("\t"+$a.text + ":");
        System.out.println("\tenter 0,0");
        //System.out.println("\tpusha");
    }
    statement*
    {
       // System.out.println("\tpopa");
        System.out.println("\tleave");
        System.out.println("\tret");
    }
    RBRACE
    ;

// parsing rule for subprogram invocation
subprogram_inv:
    {int a;}
    a=identifier ASSIGN identifier LPAREN RPAREN SEMICOLON
    {
        System.out.println("\tcall "+$identifier.text);
        System.out.println("\tmov ["+$a.text+"], eax");
    }
    ;




// Parse rule for doWhile
dowhilestmt :
{int a,b;}
{String labelDo,labelWhile;}
DO
{
    labelDo = "label_do_"+Integer.toString($DO.index);
    System.out.println(labelDo+":");
}
statement*
WHILE LPAREN a=identifier NOTEQUAL b=integer RPAREN
{
    System.out.println("\tcmp dword "+$a.toString+","+$b.toString);
    labelWhile = "label_while_"+Integer.toString($WHILE.index);
    System.out.println("\tjne "+labelDo);
}
{
    System.out.println("\tjmp "+labelWhile);
    System.out.println(labelWhile+":");
}
;




//Parse rule for shift statements
shiftstmt:
    { int a, b; }
    a = identifier SHIFTLEFT b = integer SEMICOLON
    {
        System.out.println("\tmov eax, [" + $a.text + "]");
        System.out.println("\tshl eax, " + $b.text);
        System.out.println("\tmov [" + $a.text + "], eax");
        System.out.println("\tmov eax, [" + $a.text + "]");

    }
    ;

// Parse rule for if statements

ifstmt      : 
            {int a,b;} 
            {String labelElse, labelEndIf;}  
            IF LPAREN a=identifier EQUAL b=integer RPAREN
            {System.out.println("\tcmp dword "+$a.toString+","+$b.toString);
             labelElse = "label_else_"+Integer.toString($IF.index);
             System.out.println("\tjnz "+labelElse); }
            statement*
            { labelEndIf = "label_endif_"+Integer.toString($IF.index);
              System.out.println("\tjmp "+labelEndIf);
              System.out.println(labelElse+":"); }
            (ELSE
            statement*
            {System.out.println(labelEndIf+":");}
            )?
            ENDIF
            {System.out.println(labelEndIf+":");}
            ;



// Parse rule for print statements

printstmt      : 
               PRINT term SEMICOLON 
               {System.out.println("\tmov eax, "+$term.toString);
                System.out.println("\tcall print_int");
                System.out.println("\tcall print_nl");} 
               ;

// Parse rule for assignment statements

assignstmt      : 
                {int a; }
                a=NAME ASSIGN expression SEMICOLON 
                {System.out.println("\tmov ["+$a.text+"], eax");} 
                ;

// Parse rule for expressions

expression      : 
                { int a, b; }
				a=term 
                { System.out.println("\tmov eax,"+$a.toString+";"); } 
				( PLUS b=term 
				{ System.out.println("\tadd eax, "+$b.toString+";"); }
				| SHIFTLEFT b=term
				{ System.out.println("\tmov ebx, "+$b.toString+";");
				  System.out.println("\tshl dword [eax], ebx;"); }
				)*
				;


// Parse rule for terms

term returns [String toString]  : 
                                identifier {$toString = $identifier.toString;} 
                              | integer {$toString = $integer.toString;} 
                                ;

// Parse rule for identifiers

identifier returns [String toString]: NAME {$toString = "["+$NAME.text+"]";} ;

// Parse rule for numbers 

integer returns [String toString]: INTEGER {$toString = $INTEGER.text;} ;


// Reserved Keywords
////////////////////////////////

IF: 'if';
ELSE: 'else';
ENDIF: 'endif';
PRINT: 'print';
INT: 'int';
SHIFTLEFT: '<<';
DO: 'do';
WHILE: 'while';
RETURN: 'return';

// Operators
PLUS: '+';
EQUAL: '==';
ASSIGN: '=';
NOTEQUAL: '!=';


// Semicolon and parentheses
SEMICOLON: ';';
LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';



// Integers
INTEGER: [0-9][0-9]*;

// Variable names
NAME: [a-z]+;   
NAME_TOKEN : [a-zA-Z]+ ;
// Ignore all white spaces 
WS: [ \t\r\n]+ -> skip ; 