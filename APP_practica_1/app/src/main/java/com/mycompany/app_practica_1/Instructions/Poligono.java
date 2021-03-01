/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.app_practica_1.Instructions;

import java.io.Serializable;

/**
 *
 * @author carlo
 */
public class Poligono implements Serializable {
    private double posx;
    private double posy;
    private double alto;
    private double ancho;
    private double lados;
    private String color;
    
    public Poligono(){
        
    }
    public Poligono(double posx,double posy,double alto,double ancho,double lados,String color){
        this.posx=posx;
        this.posy=posy;
        this.alto=alto;
        this.ancho=ancho;
        this.lados=lados;
        this.color=color;
    }

    public double getPosx() {
        return posx;
    }

    public void setPosx(double posx) {
        this.posx = posx;
    }

    public double getPosy() {
        return posy;
    }

    public void setPosy(double posy) {
        this.posy = posy;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLados() {
        return lados;
    }

    public void setLados(double lados) {
        this.lados = lados;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Poligono{" + "posx=" + posx + ", posy=" + posy + ", alto=" + alto + ", ancho=" + ancho + ", lados=" + lados + ", color=" + color + '}';
    }
    
}
