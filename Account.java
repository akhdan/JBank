
/**
 * Write a description of class Account here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Account
{
    // instance variables - replace the example below with your own
    private char acctType;
    private double balance;
    private String id;
    private double predictBalance;
    /**
     * Constructor for objects of class Account
     */
    public Account()
    {
    }
    public Account(char type, double amount){
    }
    public void deposit(double amount){
        if (amount > 0)
        {
            balance = balance + amount;
            System.out.println("true");
        }
        else
        {
            System.out.println("False");
        }
    }
    
    public char getAcctType(){
        return acctType;
    }
    public double getBalance(){
        return balance;
    }
    public String getId(){
        return id;
    }
    public void setBalance(double amount){
        this.balance = amount;
    }
    public void setID(String acctId){
        this.id = acctId;
    }
    public void setAcctType(char code){
        this.acctType = code;
    }
    private void withdraw(double amount){
         predictBalance = balance - amount;
        
        
        if (predictBalance < 0)
        {
            System.out.println("false");
        }
        else
        {
            balance = balance - amount;
            System.out.println("true");
        }
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
}
