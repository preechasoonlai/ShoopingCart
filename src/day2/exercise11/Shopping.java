/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2.exercise11;

/**
 *
 * @author ARIT
 */
public class Shopping {
    
    public static void main(String[] args){
        Store store1 = new Store() ;
        Item item1 = new Item("Shirt",5) ;
        Item item2 = new Item("polo",8) ;
        Item item3 = new Item("plant",10) ;
        Item item4 = new Item("sport",12) ;
        
        store1.additem(item1);
        store1.additem(item2);
        store1.additem(item3);
        store1.additem(item4);
        store1.showItem();
    }
}
