
package day2.exercise82;


public class Item {
    String desc;
    int quantity;
    double price;
    char colorCode = 'U';   //'U' = Undetermined

    public void displayItem() {
        System.out.println("Item: " + desc + ", " + quantity + ", "
                + price + ", "+colorCode);
    }

    // Write a public 3-arg setItemDisplay method that returns void.
    
    public void setItemDisplay( String desc, int quantity, double price)
    {
        this.desc = desc ;
        this.quantity = quantity ;
        this.price = price ;
       
    
    }

    // Write a public 4-arg setItemDisplay method that returns an int.
    public void setItemDisplay( String desc, int quantity, double price , char c)
       {
        this.desc = desc ;
        this.quantity = quantity ;
        this.price = price ;
       this.char = c ;
    
    }
    
}
