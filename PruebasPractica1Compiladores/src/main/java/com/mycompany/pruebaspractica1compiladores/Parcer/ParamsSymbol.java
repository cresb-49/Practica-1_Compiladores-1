/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebaspractica1compiladores.Parcer;

import java_cup.runtime.Symbol;

/**
 *
 * @author carlo
 */
public class ParamsSymbol {
    public int line;
    public int column;
    public String lexema;
    public Symbol after_symbol;

    public ParamsSymbol() {
    }
    
    public ParamsSymbol(int line, int column, String lexema) {
        this.line = line;
        this.column = column;
        this.lexema = lexema;
    }
    
    
    
    
}
