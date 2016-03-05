
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
    private Account acct; // obyek dari Account
    private double saldo; // jml saldo
    
    // instance variables - replace the example below with your own
    /**
     * Method constructor untuk class customer.
     */
    public Teller()
    /**
    * Teller sebagai Method bertipe Constructor
    */
    {
        c1.setName("Sutandi","Sanadhi"); //task 2c number 2
        a1.setBalance(50000); //task 2c number 5
        c1.setAccount(a1); //task 2c number 6
        acct=c1.getAccount();
        saldo=acct.getBalance();
        fullname=c1.getName();
        System.out.println(fullname); //task 2c number 3
        System.out.println(saldo); //task 2c number 7
    }
    
   public static void main(String[] args)
    {
        
    }
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


