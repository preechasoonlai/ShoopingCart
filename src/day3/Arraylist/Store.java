package day3.Arraylist;

import java.util.ArrayList;

public class Store {

    private ArrayList<Item> items;

    public Store() {

        items = new ArrayList();

    }
    
    public void setAdditem(Item item){
        this.items.add(item);
    }
    
     public void showItem(){
        for (Item item : items){
            
            System.out.println("item name :" + item.getName() + item.getPrice() ) " ;
            
        }
    }
     
     
}
