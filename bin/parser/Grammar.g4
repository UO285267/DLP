grammar Grammar
	;

import Lexicon
	;

start
	: (definicion|funcion|estructura)* EOF
	;

estructura
	: 'struct' IDENT '{' (parametro ';')*'}' ';'
	;

definicion
	:	'var ' IDENT ':' tipo';'
	;

sentencia
	: ('print'|'printsp'|'println') expr ';'
	| 'read' expr ';'
	| expr '=' expr ';'
	| 'if' '(' expr ')' '{' sentencia* '}' 'else' '{' sentencia* '}'
	| 'if' '(' expr ')' '{' sentencia* '}'
	| 'while' '(' expr ')' '{' sentencia* '}'
	| 'return' expr ';'
	| 'return' ';'
	;	
	
expr
	: LITENT
	| LITREAL
	| IDENT
	| IDENT'('expr ( ','expr )* ')'
	| expr '[' expr ']'
	| expr '.' IDENT
	| '(' expr ')'
	|  '<' tipo '>' '(' expr ')'
	| expr ('*' | '/') expr
	| expr ('+' | '-') expr 
	| expr ('>' | '<' | '>=' | '<=') expr
	| expr ('==' | '!=') expr 
	| expr '&&' expr
	| expr '||' expr
	| '!' expr
	;

funcion
	:IDENT '('parametro (','parametro)*')' ':' tipo '{'definicion* sentencia+ '}'
	|IDENT '('parametro (','parametro)*')''{' definicion*	sentencia+ '}'
	|IDENT '()' ':' tipo '{'definicion* sentencia+ '}'
	|IDENT '()' '{' definicion* sentencia+ '}'
	;

parametro
	:	IDENT ':' tipo
	;

tipo
	: 'int'
	| 'float'
	| 'char'
	| '['expr']' tipo
	|	IDENT
	;





