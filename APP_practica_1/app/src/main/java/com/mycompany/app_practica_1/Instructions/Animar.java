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
public class Animar implements Serializable {
    private int destinox;
    private int destinoy;
    private String typeAnimation;
    public Animar(){
        
    }
    public Animar(int destinox,int destinoy,String typeAnimation){
        this.destinox=destinox;
        this.destinoy=destinoy;
        this.typeAnimation=typeAnimation;
        
    }

    public int getDestinox() {
        return destinox;
    }

    public void setDestinox(int destinox) {
        this.destinox = destinox;
    }

    public int getDestinoy() {
        return destinoy;
    }

    public void setDestinoy(int destinoy) {
        this.destinoy = destinoy;
    }

    public String getTypeAnimation() {
        return typeAnimation;
    }

    public void setTypeAnimation(String typeAnimation) {
        this.typeAnimation = typeAnimation;
    }

    @Override
    public String toString() {
        return "Animar{" + "destinox=" + destinox + ", destinoy=" + destinoy + ", typeAnimation=" + typeAnimation + '}';
    }
    
    
}
