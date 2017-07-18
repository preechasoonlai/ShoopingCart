
package ex09_1_exercise;


public class Customer {
    private String firstName;
    private String ssn;
   
    // Encapsulate this class.  Make ssn read only.
    
    public Customer (String name){
        this.firstName = name ;
    }
    
    public void setSsn (String ssn){
        this.ssn = ssn ;
    }
    
    public String getFirstName() {
        return firstName ;
    }
    
     public String getSsn() {
        return ssn ;
    
 }

}
