# Project-Entiny
A own Scriptlanguage Project for Entities, Items and Effects in Minecraft

### BNF for the Scriptlanguage

\<block\> ::= '{' {\<statement\>+} '}' <br>
\<statement\> ::= \<if\> | \<while\> | \<block\> | \<print\> | \<assignment\>

\<if\> ::= if '(' \<boolCond\> ')' \<statement\> [ else \<statement\> ] <br>
\<while\> ::= while '(' \<boolCond\> ')' \<statement\> <br>
\<assignment\> ::= \<var\> '=' \<numExpr\> ';' <br>
\<print\> ::= print \<var\> ';' <br>

\<numExpr\> ::= \<numProduct\> { ( '+' | '-' ) \<numProduct\> } <br>
\<numProduct\> ::= \<numLiteral\> { ( '*' | '/' | '%' ) \<numLiteral\> } <br>
\<numLiteral\> ::= \<var\> | \<number\> | '(' \<numExpr\> ')'
  
\<boolCond\> ::= \<numExpr\> ( '<' | '>' | '==' | '<=' | '>=' | '!=' ) \<numExpr\> [ ( '&&' | '||' ) \<boolCond\> ]
