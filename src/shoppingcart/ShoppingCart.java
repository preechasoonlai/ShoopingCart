/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcart;

import bangkok.Customer;

/**
 *
 * @author ARIT
 */
public class ShoppingCart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Item[] items = new Item[4];

        items[0] = new Item("Shirt", 20, 10);
        items[1] = new Item("polo", 10, 10);
        items[2] = new Item("plant", 10, 10);
        items[3] = new Item("plol2", 5, 10);

        Customer cutomer1 = new Customer("Duke",100);

        Cart cart = new Cart();
        cart.addItem(items[0]);
        cart.addItem(items[3]);

        cutomer1.pay(cart);
    
    }

}
