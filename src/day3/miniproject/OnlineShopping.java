package day3.miniproject;

import java.util.ArrayList;
import java.util.Scanner;

public class OnlineShopping {

    ArrayList<Item> items;
    ArrayList<Item> shoppingCart;

    public OnlineShopping() {

        items = new ArrayList<>();
        shoppingCart = new ArrayList<>();
        items.add(new ClockItem(1, 40));
        items.add(new ChairItem(2, 30));
        items.add(new CalculatorItem(3, 20));
    }

    public void askCustomerToBuy() {
        System.out.println("What would you like to buy?");
    }

    public void getInputFromCustomer() {
        String input;

        do {
            askCustomerToBuy();
            showItems(items);
            Scanner sc = new Scanner(System.in);
            input = sc.nextLine();

            for (Item item : items) {
                if (Integer.valueOf(input) == item.id) {
                    System.out.println("What amount of " + item.name + " ? ");
                    input = sc.nextLine();
                    int amount = Integer.valueOf(input);
                    item.setQty(amount);
                    shoppingCart.add(item);
                    break;
                }
            }
            System.out.println("do you want to contonue shopping (y/N)?");
            input = sc.nextLine();
        } while (input.equalsIgnoreCase("y"));
        
        if (shoppingCart.size() > 0) {
            
           double totalQty = 0;
                    
            for (Item item : shoppingCart){
              totalQty = totalQty+item.getQty()   ;
                  
            System.out.println("Thanks you for shopping, you have = " + totalQty +" item in shopping cart, please checkout");
            
            }   
        }
        
        //Total
        double total = 0;
        double amount = 0;
        
        
        for (Item item : shoppingCart){
            total = total+(item.getQty()* item.getPrice())   ;
            amount = (item.getQty()* item.getPrice()) ;
            
            System.out.println("Item" + item.getName() + " = " + Integer.valueOf((int) amount) ); //
        }
        
        System.out.println("Total = " + total);
    }

    public void showItems(ArrayList<Item> items) {

        for (Item item : items) {
            System.out.println(item.id + ":" + item.name + "(" + item.price + ")");
        }

  //      Scanner sc = new Scanner(System.in);
  //      String input = sc.nextLine();

  //      for (Item item : items) {
//
  //          if (Integer.valueOf(input) == item.id) {
   //             shoppingCart.add(item);
   //             System.out.println("What amount of " + item.name + "?");
   //         }

     //   }

    }

}
