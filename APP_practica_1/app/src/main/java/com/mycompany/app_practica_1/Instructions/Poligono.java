/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.app_practica_1.Instructions;

/**
 *
 * @author carlo
 */
public class Poligono {
    private int posx;
    private int posy;
    private int alto;
    private int ancho;
    private int lados;
    private String color;
    
    public Poligono(){
        
    }
    public Poligono(int posx,int posy,int alto,int ancho,int lados,String color){
        this.posx=posx;
        this.posy=posy;
        this.alto=alto;
        this.ancho=ancho;
        this.lados=lados;
        this.color=color;
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {
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
