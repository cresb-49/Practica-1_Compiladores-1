package com.mycompany.app_practica_1.Lexer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import java_cup.runtime.Symbol;

public class reportLexer implements Serializable {
    public List<Symbol> countMas = new ArrayList();
    public List<Symbol> countMenos = new ArrayList();
    public List<Symbol> countMulti = new ArrayList();
    public List<Symbol> countDiv = new ArrayList();

    public int shapeCirculo =0;
    public int shapeCuadrado =0;
    public int shapeRect =0 ;
    public int shapeLinea=0;
    public int shapePoligono=0;

    public int animCurva=0;
    public int animLinea=0;

    public int countAzul=0;
    public int countRojo=0;
    public int countVerde=0;
    public int countAmarillo=0;
    public int countNaranja=0;
    public int countMorado=0;
    public int countCafe=0;
    public int countNegro=0;

    public reportLexer(){

    }
}
