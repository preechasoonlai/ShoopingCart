package day2.exercise11;

import java.util.ArrayList;

public class Store {

    private final ArrayList<Item> items ;
    
    public Store(){
        
        items = new ArrayList() ;
        
    }
    
    public void additem(Item item){
        switch (item.getName()){
            case "shirt":
            case "polo":
            case "plant" :
            case "sport" :
                
          this.items.add(item);
          break ;  
            default :
           break ;      
        }
    }
    
    public void showItem(){
        
        for(Item item : items){
            
            System.out.println("item name: " + item.getName() + " - " + item.getPrice());
        }
        
    }
    
}
