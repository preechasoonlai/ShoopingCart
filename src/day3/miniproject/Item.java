/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3.miniproject;

/**
 *
 * @author ARIT
 */
public class Item {
    
    private int id;
    private String name;
    private  price;
    private int qty;
    
public  Item(int id,String name,double price){
    this.id = id ;
    this.name = name ;
    this.price = price ;
        
}

  public void setQty(int qty){
      this.qty = qty;
  }

   public int getQty(){
      return qty ;
  }
  
     public double getPrice(){
      return price ;
  }
   
       public String getName(){
      return name ;
  }   
     
       
       
}
