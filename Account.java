
/**
 * Write a description of class Account here.
 * 
 * @author (Akhdan Hilmy T)  
 * @version (a version number or a date)
 */
public class Account
{
   /**
    * deklarasi class variable
    */
   public char acctType;
   public static double balance;
   private double drawBalance;
   public String id;
   
   /**
    * Constructor Account tanpa parameter
    */
   public Account()
    {
        acctType = 'S';
        balance = 10.00;
    }
    
   /**
    * Constructor Account dengan parameter
    * @param char type menunjukkan tipe akun
    * @param amount menunjukkan jumlah uang
    */
   public Account(char type, double amount)
    {
        acctType = type;
        balance = amount;
    }
   
   /**
    * method deposit dengan
    * @param amount menunjukkan jumlah uang
    */
   public boolean deposit(double amount)
    {
        if (amount>=0)
        {
            balance = balance + amount;
            return true;
        }
        else
        {
            return false;
        }
    }
   
   /**
    * method untuk mengembalikan nilai tipe akun
    */
   public char getAcctType()
    {
       return acctType;
    }
   
   /**
    * untuk mengembalikan nilai balance
    */
   public double getBalance()
    {
       return balance;
    }
    
   /**
    * method untuk mengembalikan id
    */
   public String getId()
    {
       return id;
    }
    
   /**
    * method untuk melakukan setting jumlah balance
    */
   public void setBalance(double amount)
    {
        balance = amount;
    }
    
   /**
    * method untuk melakukan setting id
    */
   public void setID(String acctId)
    {
        id = acctId;
    }
    
   /**
    * untuk melakukan setting tipe akun
    */ 
   public void setAcctType(char type)
    {
        acctType = type;
    }
    
   /**
    * method untuk menarik uang
    */
   public boolean withdraw(double amount)
    {
        double drawBalance;
        drawBalance = balance - amount;
        if (drawBalance>=0)
        {
            balance = drawBalance;
            return true;
        }
        else
        {
            return false;
        }
    }
}


   /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */

