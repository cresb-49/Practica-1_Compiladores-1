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
public class Linea {
    private int posx;
    private int posy;
    private int posx2;
    private int posy2;
    private String color;
    public Linea(){
        
    }
    public Linea(int posx,int posy,int posx2,int posy2,String color){
        this.posx=posx;
        this.posy=posy;
        this.posx2=posx2;
        this.posy2=posy2;
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

    public int getPosx2() {
        return posx2;
    }

    public void setPosx2(int posx2) {
        this.posx2 = posx2;
    }

    public int getPosy2() {
        return posy2;
    }

    public void setPosy2(int posy2) {
        this.posy2 = posy2;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Linea{" + "posx=" + posx + ", posy=" + posy + ", posx2=" + posx2 + ", posy2=" + posy2 + ", color=" + color + '}';
    }
    
}
