package com.mycompany.pruebaspractica1compiladores.Instructions;

import java.util.ArrayList;


public class Settings {
    private ArrayList<Integer> nums = new ArrayList<>();
    private ArrayList instructions = new ArrayList();
    
    public Settings() {
        
    }

    public ArrayList getNums() {
        return nums;
    }
    public void agregarNumero(int num){
        this.nums.add(num);
    }
    public void setNums(ArrayList nums) {
        this.nums = nums;
    }

    public ArrayList getInstructions() {
        return instructions;
    }
    
    public void agregarInstruccion(Object obj){
        this.instructions.add(obj);
    }
    public void setInstructions(ArrayList instructions) {
        this.instructions = instructions;
    }
    
    
    
}
