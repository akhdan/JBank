
/**
 * Write a description of class Account here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Account
{
    // instance variables - replace the example below with your own
    /**
    * Account Class : memanage isi akun customer
    */
    private char acctType;
    private double balance;
    private String id;
    private double predictBalance;
    
    /**
     * Method constructor untuk class customer.
     */
    public Account()
    {
         this.acctType = 'S' ;
         this.balance = 10.00;
        
    }
    /**
    * Constructor Method for Account
    * @param type untuk tipe akun
    * @param amount untuk jumlah saldo
    */
    public Account(char type, double amount)
    {
        acctType = type ;
        amount = balance;
         
    }
    
    /**
     * Setter method, melakukan deposit pada sebuah account.
     * @param amount jumlah deposit yang akan dilakukan.
     * @return void
     */
    public boolean deposit(double amount)
    {
        if (amount < 0)
        {
            return false ;
        }
        else
        {
            balance = balance + amount; //memodifikasi var balance sehingga balance ditambah amount akan menambah isi saldonya
            return true;
        }  
    }
    
    /**
     * Getter method, return informasi tipe akun.
     * @return acctType tipe dari akun yang dimaksud, berbentuk char.
     */
    public char getAcctType()
    {
        return acctType;
    }
    
    /**
     * Getter method, return informasi saldo.
     * @return balance jumlah saldo pada suatu akun pelanggan.
     */
    public double getBalance()
    {
        return balance;
    }
    
    /**
     * Getter method, return informasi id.
     * @return id informasi id akun.
     */
    public String getId()
    {
        return "id" ;
    }
    
    /**
     * Setter method, mengubah jumlah saldo
     * @param amount besaran saldo yang akan ditetapkan.
     * @return void
     */
    public void setBalance(double amount)
    {
        balance = amount; //melakukan setting balance saldo customer
    
    }
    
    /**
     * Setter method, mengubah informasi ID akun.
     * @param acctId informasi ID yang akan menjadi ID sebuah akun.
     * @return void
     */
    public void setID(String acctId)
    {
        id = acctId;// melakukan setting id customer
    
    }
    
    /**
    * Mutator Method for setacctType 
    * @param acctType tipe akun customer
    */  
    public void setacctType(char type) 
    {
        acctType = type; // melakukan setting tipe akun customer
    } 

    /**
    * Mutator Method for withdraw
    * @param amount jumlah saldo customer
    */      
    public boolean withdraw(double amount) 
    {
       //Mutator agar customer dapat mengambil saldo miliknya
        if (balance-amount < 0)
        {
            return false;
        }
        else
        {
            balance = balance - amount;
            return true;
        }  
    }
}
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */

