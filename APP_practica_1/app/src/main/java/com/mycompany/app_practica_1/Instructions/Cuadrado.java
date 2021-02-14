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
public class Cuadrado {
    private int posx;
    private int posy;
    private int tamLado;
    private String color;
    public Cuadrado(){
        
    }
    public Cuadrado(int posx,int posy,int tamLado,String color){
        this.posx=posx;
        this.posy=posy;
        this.tamLado=tamLado;
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

    public int getTamLado() {
        return tamLado;
    }

    public void setTamLado(int tamLado) {
        this.tamLado = tamLado;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "posx=" + posx + ", posy=" + posy + ", tamLado=" + tamLado + ", color=" + color + '}';
    }
    
}
