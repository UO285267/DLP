lexer grammar Lexicon
	;

LITENT
	: [0-9]+
	;
LITREAL
	: [0-9]+ '.' [0-9]+
	;

	

IDENT
	: [a-zA-Z][a-zA-Z0-9_]*
	;
OPERADOR
	:'+'|'-'|'*'|'/'|'%'
	;
COMPARADOR
	: '>'|'<'|'='|'<='|'>='|'!='
	;
LOGICO
	:'&&'|'||'|'!'
	;
LINE_COMMENT
	: '//' .*? ('\n' | EOF) -> skip
	;

MULTILINE_COMMENT
	: '/*' .*? '*/' -> skip
	;

WHITESPACE
	: [ \t\r\n]+ -> skip
	;
