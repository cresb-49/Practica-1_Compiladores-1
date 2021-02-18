/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebaspractica1compiladores;

import com.mycompany.pruebaspractica1compiladores.Instructions.Point;
import com.mycompany.pruebaspractica1compiladores.Instructions.Settings;
import com.mycompany.pruebaspractica1compiladores.Lexer.appLexer;
import com.mycompany.pruebaspractica1compiladores.Parcer.Sincronizar;
import com.mycompany.pruebaspractica1compiladores.Parcer.parser;
import java.io.BufferedReader;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlo
 */
public class main {

    public static void main(String[] args) {
        /*
        String cadenas
                = "graficar circulo ( 1 + 12, 25, 15/3, rojo)\n"
                + "graficar linea ( 12 * 3 + 2, 15, 4 / 4, 50 * 1, amarillo)\n"
                + "animar objeto anterior(4,2,linea)\n"
                + "graficar cuadrado ( 12*3, 15+1, (15-3) / 4, verde)\n"
                + "graficar rectangulo ( 12 * 6 + 2, 15, 4 / 4,10, negro)\n"
                + "graficar poligono ( 12, 8, 12,7/7,8,amarillo)";

        /*String cadenas = 
                "graficar circulo ( (3+2)*2, 2, 3, rojo)"
                ;*/
        /*
        cadenas="";
        appLexer lex = new appLexer(new StringReader(cadenas));
        parser appParser = new parser(lex);
        try {
            appParser.parse();

            if (lex.getErrorsList().isEmpty() && appParser.getErrorsList().isEmpty()) {
                Sincronizar syn = new Sincronizar();
                System.out.println("----------- RESULTADOS DE LECTURA --------------");
                System.out.println("Numeros Recuperados: " + appParser.respuesta().getNums().toString());
                System.out.println("Sentencias Recuperadas: ");
                for (Object arg : syn.asignar(appParser.respuesta().getNums(), appParser.getSentencias())) {
                    System.err.println(arg.toString());
                }
                //syn.asignar(appParser.respuesta().getNums(), appParser.getSentencias());
                
            } else {
                System.out.println("----------- SE ENCONTRARON ERRORES --------------");
                System.out.println("----------- ERRORES LEXICOS --------------");
                for (String err : lex.getErrorsList()) {
                    System.err.println(err);
                }
                System.out.println("----------- ERRORES DE SINTAXIS --------------");
                for (String err : appParser.getErrorsList()) {
                    System.err.println(err);
                }
            }

        } catch (Exception ex) {
            System.out.println("Error irrecuperable, " + ex.getMessage());
            ex.printStackTrace();
        }
        */
        double a=1.7,b=2;
        int lados = 3;
        
        double angulos[]= new double[lados+1];
        Point puntos[] = new Point[lados+1];
        
        for (int i = 0; i <= lados; i++) {
            angulos[i]=(i*(360/lados));
        }
        double tx,ty,r;
        int cont =0;
        for(double an:angulos){
            r = radio(an, a, b);
            tx = r*Math.cos(an*Math.PI/180);
            ty = r*Math.sin(an*Math.PI/180);
            System.out.println("Angulo: "+an+" radio= "+r+" ,x= "+tx+" ,y= "+ty);
            puntos[cont]=new Point(tx, ty);
            cont++;
        }
        for(Point p:puntos){
            System.out.println(p.toString());
        }
        
        
    }
    private static double radio(double angulo,double a,double b){
        double tmp1,tmp2,tmp3,cos,sin;
        
        cos = Math.cos(angulo*Math.PI/180);
        
        sin = Math.sin(angulo*Math.PI/180);
       
        
        tmp1 = (Math.pow(cos, 2))/(Math.pow(a, 2));
        tmp2 = (Math.pow(sin, 2))/(Math.pow(b, 2));
        
        tmp3 = Math.sqrt(1/(tmp1+tmp2));
        
        return tmp3;
    }
    
}
