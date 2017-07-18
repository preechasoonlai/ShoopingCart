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
public abstract class Cloth {

    double price;
    char size;
    String type;
       
    
       public double sellPrice(){
           return getPrice() * getCost();
       
    }
    
    
    public double getPrice(){
            return price;
        
    }  

       public String getType(){
            return type;
        
    } 
    
    public abstract   double getCost(); 
       
    public Cloth (double price, char size, String type) {

        this.price = price;
        this.size = size;
        this.type = type; 
        
    }
 
      public static void main(String[] args) {
        
      Cloth c1 = new Shirt(10,'M',"0") ;
      c1.displaySellPrice();
      
            
    }
    
    public void displaySellPrice() {
       System.out.println("This Shirt price is " +
                getPrice() + " sell price = " +
               sellPrice()); 
        
    }

      
}
