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
public class Plant extends Cloth{
    
    char Genger ;
    
    public Plant(double price, char size, String type) {
        super(price, size, type);
       
    }
    
     private Plant(double price, char size, String type,char Genger) {
        this(price, size, type);
        this.Genger = Genger ;
    }
    
       @Override
  public double getCost(){
        return 3 ;  
  }
}
