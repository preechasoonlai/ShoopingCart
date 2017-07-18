/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;

/**
 *
 * @author ARIT
 */
public class Polo extends Cloth{
    
    char color ;
    
   
    
    public void setPrice(double price){
        
    }
    
    public Polo(double price, char size, String type) {
        super(price, size, type);
    
    }
    
    private Polo(double price, char size, String type,char color) {
        this(price, size, type);
        this.color = color ;
    }
 
    @Override
    public double getCost() {
        
        return 3 ;
    }
    
}
