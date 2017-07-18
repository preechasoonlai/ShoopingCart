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
public class Shirt extends Cloth {
 
    char shape;
    
 
  public Shirt(double price, char size, String type)  {
      super (price,size,type) ;
  }    
    
    
  private Shirt(double price, char size, String type, char shape)  {
      
      this(price,size,type) ;
      this.shape = shape  ;
  }
    
  @Override
  public double getCost(){
        return 3 ;  
  }
  
    @Override
  public String toString(){
        return  " I am Shirt " ;  
  }
  
  public static void main(String[] args){
     
  }
  
  
  
}
