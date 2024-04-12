grammar StateDuino;

prog        : function* stateMachine;

stateMachine    : STATEMACHINE ID '{' (expression';')* state+ '}' ;

state           : STATE ID stateBody ;

stateBody       : '{'(expression';')* onEntry? onRepeat? onExit? transitions? '}' ;

onEntry         : ONENTRY'{'statement* '}' ;

onRepeat        : ONREPEAT'{'statement* '}' ;

onExit          : ONEXIT'{'statement* '}' ;

transitions     : TRANSITIONS '{'(CHANGESTATE'(' ID ',' expression ',' NUMBER_LITERAL ')'';')+'}' ;

function : FUNCTION ID '(' (typeSpecifier ID','| typeSpecifier ID)* ')' '{' statement* '}' ;

statement  : expression ';'
           | ifStatement
           | switchStatement
           | forStatement
           | whileStatement
           | RETURN expression ';'
           ;

ifStatement     : IF '(' expression ')' '{' statement*'}'
                (ELSEIF '(' expression ')' '{' statement* '}')*
                (ELSE '{' statement* '}')? ;

switchStatement : SWITCH '(' expression ')' '{' caseStatement* defaultCaseStatement '}' ;

caseStatement   : CASE expression ':' statement* BREAK ';' ;

defaultCaseStatement : DEFAULT ':' statement* BREAK ';' ;

forStatement : FOR '(' expression ';' expression ';' expression ')' '{' statement* '}' ;

whileStatement : WHILE '(' expression ')' '{' statement* '}' ;

functionNames   : DELAY
                | DIGITALWRITE
                | DIGITALREAD
                | ANALOGREAD
                | ANALOGWRITE
                | ID
                ;

expression : '(' expression ')'
           | functionNames'(' (expression','| expression)* ')'
           | expression unary
           | (unary | NOT) expression
           | expression binary expression
		   | expression '?' expression ':' expression ';'
		   | CONST? typeSpecifier ID
           | values
           ;

values  : ID
        | ('+'|'-')? NUMBER_LITERAL
        | BOOL_LITERAL
        | HIGH
        | LOW
        ;

unary : INC
      | DEC
      ;

binary : arithmetic
       | logical
       ;

arithmetic  : (MUL | DIV | MOD |
             ADD | SUB |
             ASSIGN | ADD_ASSIGN |SUB_ASSIGN)
             ;
logical     : (LT | LE | GT | GE | EQUAL |
            NOTEQUAL | XOR | AND | OR)
            ;


typeSpecifier   : 'void'
                | 'number'
                | 'char'
                | 'enum'
                | 'bool' ;

STATE           : 'state' ;
STATEMACHINE    : 'stateMachine';
ONENTRY         : 'onEntry' ;
ONREPEAT        : 'onRepeat' ;
ONEXIT          : 'onExit' ;
TRANSITIONS     : 'transitions' ;
CHANGESTATE     : 'changeState' ;
NUMBER          : 'number' ;
BOOL            : 'bool' ;
BREAK           : 'break' ;
CASE            : 'case' ;
CONST           : 'const' ;
ELSE            : 'else' ;
ELSEIF          : 'else if' ;
ENUM            : 'enum' ;
FOR             : 'for' ;
IF              : 'if' ;
RETURN          : 'return' ;
WHILE           : 'while' ;
SWITCH          : 'switch' ;
VOID            : 'void' ;
DIGITALREAD     : 'digitalRead' ;
DIGITALWRITE    : 'digitalWrite' ;
ANALOGREAD      : 'analogRead' ;
ANALOGWRITE     : 'analogWrite' ;
HIGH            : 'HIGH' ;
LOW             : 'LOW' ;
DELAY           : 'delay' ;
FUNCTION        : 'function' ;
DEFAULT         : 'default' ;

STRING_LITERAL  : '"' (ESC|.)*? '"' ;
NUMBER_LITERAL  : (INT_LITERAL | FLOAT_LITERAL) ;
BOOL_LITERAL    : 'true' | 'false' ;
ID              : [a-zA-Z]+[a-zA-Z0-9_]* ;

LPAREN          : '(' ;
RPAREN          : ')' ;
LBRACE          : '{' ;
RBRACE          : '}' ;
LBRACK          : '[' ;
RBRACK          : ']' ;
SEMI            : ';' ;
COMMA           : ',' ;
DOT             : '.' ;

GT              : '>' ;
LT              : '<' ;
NOT            : '!' ;
QUESTION        : '?' ;
COLON           : ':' ;
EQUAL           : '==' ;
LE              : '<=' ;
GE              : '>=' ;
NOTEQUAL        : '!=' ;
XOR             : 'XOR' ;
AND             : '&&' | 'AND' ;
OR              : '||' | 'OR' ;
INC             : '++' ;
DEC             : '--' ;
ADD             : '+' ;
SUB             : '-' ;
MUL             : '*' ;
DIV             : '/' ;
CARET           : '^' ;
MOD             : '%' ;
ADD_ASSIGN      : '+=' ;
SUB_ASSIGN      : '-=' ;
ASSIGN          : '=' ;

WS              : [ \t\r\n]+ -> skip ;
COMMENT         : '/*' .*? '*/' -> skip ;
LINE_COMMENT    : '//' ~[\r\n]* -> skip ;

fragment ESC    : '\\' [ "ntr\\" ] ;
fragment DIGIT  : [0-9] ;
fragment NONZERODIGIT : [1-9] ;
fragment INT_LITERAL     : NONZERODIGIT DIGIT* | '0';
fragment FLOAT_LITERAL : INT_LITERAL'.' INT_LITERAL;