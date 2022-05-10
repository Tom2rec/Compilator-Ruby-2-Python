# Compilator-Ruby-2-Python

## Tokeny Ruby
```
KEYWORD:        | alias | and | BEGIN | begin | break | case | class 
                | def | defined? | do | else | elsif | END | end | ensure 
                | false | for | if | in | module | next | nil | not | or | redo 
                | rescue | retry | return | self | super | then | true 
                | undef | unless | until | when | while | yield

IDENTIFIER:    	^[a-zA-Z_][a-zA-Z0-9_]*$

OP_ASGN:        | += | -= | *= | /= | %= | **= | &= | |= | ^= | <<= | >>=
		        | &&= | ||= 

SYMBOL:         | :FNAME | :VARNAME

FNAME:          | IDENTIFIER | .. | "|" | ˆ | & | <=> | == | ===
                | =~ | > | >= | < | <= | + | - | * | / | % | **
                | << | >> |  ̃ | +@ | -@ | [] | []=

OPERATION:      | IDENTIFIER [! | ?]

VARNAME:        | GLOBAL | @IDENTIFIER | IDENTIFIER

GLOBAL:         | $IDENTIFIER | $any_char | $-any_char

STRING:         | " {any_char} " | ’ {any_char} ’ | ‘ {any_char} ‘

STRING2:        | %(Q|q|x)char {any_char} char

HERE_DOC:       | <<(IDENTIFIER | STRING) {any_char} IDENTIFIER

REGEXP:         | / {any_char} / [i|o|p] | %r char {any_char} char

```

## Gramatyka Ruby w postaci BNF

```
PROGRAM:	COMPSTMT

COMPSTMT:	STMT (TERM EXPR)* [TERM]

STMT:		| CALL KEYWORD [| [BLOCK_VAR] |] COMPSTMT end
			| KEYWORD FNAME
			|  KEYWORD FNAME FNAME
	    	| STMT KEYWORD EXPR
	    	| STMT KEYWORD EXPR
			| STMT KEYWORD EXPR
		    | STMT KEYWORD EXPR
            | BEGIN { COMPSTMT }
            | END { COMPSTMT }
            | LHS = COMMAND [do [| [BLOCK_VAR] |] COMPSTMT end]
		    | EXPR

EXPR:		| MLHS = MRHS
		    | KEYWORD CALL_ARGS
		    | KEYWORD  CALL_ARGS
		    | EXPR KEYWORD EXPR
		    | EXPR KEYWORD EXPR
		    | KEYWORD EXPR
		    | COMMAND
		    | ! COMMAND
		    | ARG

CALL: 		FUNCTION | COMMAND

COMMAND:    | OPERATION CALL_ARGS
		    | PRIMARY . OPERATION CALL_ARGS
		    | PRIMARY :: OPERATION CALL_ARGS
		    | KEYWORD CALL_ARGS

FUNCTION:   | OPERATION [( [CALL_ARGS] )]
		    | PRIMARY . OPERATION ( [CALL_ARGS] )
		    | PRIMARY :: OPERATION ( [CALL_ARGS] )
		    | PRIMARY . OPERATION
		    | PRIMARY :: OPERATION
		    | KEYWORD ( [CALL_ARGS] )
		    | super

ARG: 	    | LHS = ARG
		    | LHS OP_ASGN ARG
		    | ARG .. ARG
		    | ARG ... ARG
		    | ARG + ARG
		    | ARG - ARG
		    | ARG * ARG
		    | ARG / ARG
		    | ARG % ARG
		    | ARG ** ARG
		    | + ARG
		    | - ARG
		    | ARG | ARG
		    | ARG ^ ARG
		    | ARG & ARG
		    | ARG <=> ARG
		    | ARG > ARG
		    | ARG >= ARG
		    | ARG < ARG
		    | ARG <= ARG
		    | ARG == ARG
		    | ARG === ARG
		    | ARG != ARG
		    | ARG =~ ARG
		    | ARG !~ ARG
		    | ! ARG
		    | ~ ARG
		    | ARG << ARG
		    | ARG >> ARG
		    | ARG && ARG
		    | ARG || ARG
		    | KEYWORD ARG
		    | PRIMARY

PRIMARY:	| ( COMPSTMT )
		    | LITERAL
		    | VARIABLE
		    | PRIMARY :: IDENTIFIER
		    | :: IDENTIFIER
		    | PRIMARY [ [ARGS] ]
		    | [ [ARGS [,]] ]
		    | { [(ARGS|ASSOCS) [,]] }
		    | KEYWORD [( [CALL_ARGS] )]
		    | KEYWORD  [( [CALL_ARGS] )]
		    | KEYWORD ( ARG )
            | FUNCTION
		    | FUNCTION { [| [BLOCK_VAR] |] COMPSTMT }
		    | KEYWORD EXPR THEN COMPSTMT (elsif EXPR KEYWORD COMPSTMT)* [else COMPSTMT] end
		    | KEYWORD EXPR THEN COMPSTMT [else COMPSTMT] end
		    | KEYWORD EXPR KEYWORD COMPSTMT end
		    | KEYWORD EXPR KEYWORD COMPSTMT end
		    | KEYWORD COMPSTMT (when WHEN_ARGS KEYWORD COMPSTMT)+ [else COMPSTMT] end
		    | KEYWORD BLOCK_VAR KEYWORD EXPR DO COMPSTMT end
		    | begin COMPSTMT [rescue [ARGS] KEYWORD COMPSTMT]+ [else COMPSTMT] [ensure COMPSTMT] end
		    | KEYWORD IDENTIFIER [< IDENTIFIER] COMPSTMT end
		    | KEYWORD IDENTIFIER COMPSTMT end
		    | KEYWORD FNAME ARGDECL COMPSTMT end
		    | KEYWORD SINGLETON (.|::) FNAME ARGDECL COMPSTMT end

WHEN_ARGS:  ARGS [, * ARG] | * ARG

THEN:       TERM | then | TERM then

DO:         TERM | do | TERM do

BLOCK_VAR:  LHS | MLHS

MLHS:       MLHS_ITEM , [MLHS_ITEM (, MLHS_ITEM)*] [* [LHS]] | * LHS

MLHS_ITEM:  LHS | ( MLHS )

LHS:        VARIABLE | PRIMARY [ [ARGS] ] | PRIMARY . IDENTIFIER

MRHS:       ARGS [, * ARG] | * ARG

CALL_ARGS:  | ARGS | ARGS [, ASSOCS] [, * ARG] [, & ARG]
		    | ASSOCS [, * ARG] [, & ARG]
		    | * ARG [, & ARG]
		    | & ARG
		    | COMMAND

ARGS:       ARG (, ARG)*

ARGDECL:    ( ARGLIST ) | ARGLIST TERM

ARGLIST:    | IDENTIFIER(,IDENTIFIER)*[,*[IDENTIFIER]][,&IDENTIFIER]
		    | *IDENTIFIER[,&IDENTIFIER]
		    | [&IDENTIFIER]

SINGLETON:  VARIABLE | ( EXPR )

ASSOCS:	    | ASSOC (, ASSOC)*

ASSOC:		| ARG => ARG

VARIABLE:   | VARNAME
		    | nil
		    | self

LITERAL		| numeric
		    | SYMBOL
		    | STRING
		    | STRING2
		    | HERE_DOC
		    | REGEXP

TERM:       ; | \n
```



