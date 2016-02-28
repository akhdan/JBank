
/**
 * Write a description of class Teller here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Teller
{
    /**
     * variabel dari kelas :
     */
    private Customer c1 = new Customer (); // obyek dari customer
    private Account a1 = new Account (); //obyek dari account
    private String fullname; //string untuk nama lengkap customer pada teller
    private Account acc; // obyek dari Account
    private double balance; // jml saldo
    
    // instance variables - replace the example below with your own
    /**
     * metod konstruktor untuk kelas customer
     */
    
    public Teller(){
        
        c1.setCustomerName("Sutandi","Sanadhi");
        fullname = c1.getCustomerName();
        
        System.out.println(fullname);
        
        a1.setBalance(30000);
        c1.setAccount(a1);
        
        acc = c1.getAccount();
        balance = acc.getBalance();
        
        System.out.println(balance);
        
    }
    
    
    public static void main(String[] args){
    
    }

    /**
     * Constructor for objects of class Teller
     */
 

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */

}
