/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebaspractica1compiladores;

import com.mycompany.pruebaspractica1compiladores.Instructions.Settings;
import com.mycompany.pruebaspractica1compiladores.Lexer.appLexer;
import com.mycompany.pruebaspractica1compiladores.Parcer.parser;
import java.io.BufferedReader;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlo
 */
public class main{
    public static void main (String[] args) {
        String cadenas = 
                "graficar circulo ( a + 12, 25, 15/3, rojo)\n" +
                "graficar cuadrado ( 12*3, 15+1, (15-3) / 4, verde)\n" +
                "graficar rectangulo ( 12 * 6 + 2, 15, 4 / 4,10, negro)\n" +
                "graficar poligono ( 12, 8, 12,7/7,8,amarillo)"
                ;
        
        
        /*String cadenas = 
                "graficar circulo ( (3+2)*2, 2, 3, rojo)"
                ;*/
        appLexer lex = new appLexer(new StringReader(cadenas));
        parser appParser = new parser(lex);
        try {
            appParser.parse();
            System.out.println("Numeros Recuperados: "+appParser.respuesta().getNums().toString());
            
        } catch (Exception ex) {
            System.out.println("Error irrecuperable, "+ex.getMessage());
            ex.printStackTrace();
        }
                
        
    }
}
