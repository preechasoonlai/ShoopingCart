/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcart;

/**
 *
 * @author ARIT
 */
public class Cart {
    public Item[] items ;
    public double total ;
    
    public Cart() {
       items = new Item[5] ;
        
    }
    
    public void addItem(Item item) {
        // Insert item in to items
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                break;
            }
        }
    }
    
    public void removeItem(Item item) {
        //remove item
    }
    
    
    public double checkout() {
        double totalPrice = 0.0 ;
        // Sum (Multiply Items*price)
        for (Item item : items) {
            if(item != null) {
                totalPrice = totalPrice + (item.price);
            }
        }
        
        return totalPrice ;
    }
    
}
