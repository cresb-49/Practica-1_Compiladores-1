/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebaspractica1compiladores.Instructions;

/**
 *
 * @author carlo
 */
public class Circulo {
    private int posx;
    private int posy;
    private int radio;
    private String color;
    public Circulo(){
        
    }
    public Circulo(int posx,int posy,int radio,String color){
        this.posx=posx;
        this.posy=posy;
        this.radio=radio;
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

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circulo{" + "posx=" + posx + ", posy=" + posy + ", radio=" + radio + ", color=" + color + '}';
    }
    
}
