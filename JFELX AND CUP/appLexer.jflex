/*PRIMER SECCION, CODIGO DE USUARIO*/
package com.mycompany.pruebaspractica1compiladores.Lexer;
import java_cup.runtime.*;
import static com.mycompany.pruebaspractica1compiladores.Lexer.sym.*;

%%

/*segunda seccion, configuracion*/
%class appLexer
%cup
/*%standalone*/
%unicode
%line
%column
%public

/*EXPRECIONES REGULARES*/
LineTerminator = [\r|\n|\r\n]+
WhiteSpace = [ \t\n]+
RecervateWords = (graficar|animar|objeto|anterior)
Colors = (azul|rojo|verde|amarillo|naranja|morado|cafe|negro)
TypeAnimation = (linea|curva)
TypeShape = (circulo|cuadrado|rectangulo|linea|poligono)
Numbers = [0-9]+
Words = [a-zA-Z]+

%%

/*LEXIX RULES*/
<YYINITIAL>{
    {RecervateWords}
        {
            //System.out.println("Palabra recervada: "+yytext());
            switch (yytext()) {
                case "graficar":
                    return new Symbol (RESERVATE_WORD_GRAPHIC,yyline+1,yycolumn+1,yytext());
                case "animar":
                    return new Symbol (RESERVATE_WORD_ANIMATION,yyline+1,yycolumn+1,yytext());
                case "objeto":
                    return new Symbol (RESERVATE_WORD_OBJECT,yyline+1,yycolumn+1,yytext());
                case "anterior":
                    return new Symbol (RESERVATE_WORD_REFERENCE,yyline+1,yycolumn+1,yytext());
            }
            
        }
    {Colors}
        {   
            //System.out.println("Color de la figura: "+yytext());
            return new Symbol (COLOR,yyline+1,yycolumn+1,yytext());
        }
    {TypeAnimation}
        {   
            //System.out.println("Tipo de animacion: "+yytext());
            return new Symbol (ANIMATION,yyline+1,yycolumn+1,yytext());
        }
    {TypeShape}
        {   
            //System.out.println("Tipo de figura: "+yytext());
            switch (yytext()) {
                case "circulo":
                    return new Symbol (SHAPE_CIR,yyline+1,yycolumn+1,yytext());
                case "cuadrado":
                    return new Symbol (SHAPE_CUA,yyline+1,yycolumn+1,yytext());
                case "rectangulo":
                    return new Symbol (SHAPE_REC,yyline+1,yycolumn+1,yytext());
                case "linea":
                    return new Symbol (SHAPE_LIN,yyline+1,yycolumn+1,yytext());
                case "poligono":
                    return new Symbol (SHAPE_POL,yyline+1,yycolumn+1,yytext());
            }
        }
    {Numbers}
        {
            //System.out.println("Numero encontrado: "+yytext());
            return new Symbol (NUMBER,yyline+1,yycolumn+1,yytext());
        }
    ","
        {
            //System.out.println("Separador coma: "+yytext());
            return new Symbol (COMA,yyline+1,yycolumn+1,yytext());
        }
    "+"
        {
            //System.out.println("Signo mas: "+yytext());
            return new Symbol (SUMA,yyline+1,yycolumn+1,yytext());
        }
    "-"
        {
            //System.out.println("Signo menos: "+yytext());
            return new Symbol (RESTA,yyline+1,yycolumn+1,yytext());
        }
    "*"
        {
            //System.out.println("Signo multiplicacion: "+yytext());
            return new Symbol (MULTI,yyline+1,yycolumn+1,yytext());
        }
    "/"
        {
           //System.out.println("Signo divicion: "+yytext());
            return new Symbol (DIV,yyline+1,yycolumn+1,yytext());
        }
    "("
        {
            //System.out.println("Parentecis Apertura: "+yytext());
            return new Symbol (PARENTECIS_APERTURA,yyline+1,yycolumn+1,yytext());
        }
    ")"
        {
            //System.out.println("Parentecis Cierre: "+yytext());
            return new Symbol (PARENTECIS_CIERRE,yyline+1,yycolumn+1,yytext());
        }
    {Words}
        {
            System.out.println("\""+yytext()+"\" no es una intruccion del programa");
        }
    {LineTerminator}
        {
            /*Do nothing*/
        }
    {WhiteSpace}
        {
            /*Do nothing*/
        }
}
[^] {System.out.println("Caracter invalido en el lenguaje: "+yytext()+" Linea: "+(yyline+1)+" Columna: "+(yycolumn+1));}
