package day2.exercise11;

public class Item {
    private final String name;
    private final double price;
    private int qty ;

  public Item(String name, double price) {
        this.name = name;
        this.price = price;
             
    }
  
  public void setQty(int qty){
      this.qty = qty;
  }
  
  public String getName(){
      return name ;
  }
  
  public double getPrice(){
      return price ;
  }
  
  public int getQty(){
      return qty ;
  }
  
  
}
