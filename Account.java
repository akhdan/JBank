
/**
 * kelas account berisikan deskripsi atau informasi akun customer
 * 
 * @author (Akhdan Hilmy T) 
 * @version 
 */
public class Account
{
    private char acctType;
    private double balance;
    private String id;
   

   /**
     * constructur kelass account
     */
    public Account(Customer customer,double amount,char tipe)
    {
        acctType = tipe;
        balance = amount;
        id = customer.getCustID()+" "+ tipe;
    }
    
    public String toString()
    {
      System.out.println("Tipe Akun = "+acctType);
      System.out.println("ID = "+id);
      System.out.println("Saldo = "+balance);
      return "";  
    }
    
    /**
     * method pada costractor account
     * @param type tipe akun customer
     * @param amount nilai balance customer 
     */
    public Account (char type, double amount)
    {
      acctType = type;
      balance = amount;
    }
   
    /**
     * method untuk deposit customer
     * @param amount nilai balance akun customer 
     */
    public boolean deposit(double amount)
    {
        if (amount < 0)
        { //cek deposit customer apakah kurang dari 0
            return false;
        }
        else
        { //deposit customer lebih dari 0
            balance = balance + amount;// menambhakan uang deposit
            return true;
        }
    }
    
    
    /**
     * method untuk mendapatkan tipe akun customer
     * @return tipe akun
     */
    public char getAcctType()
    {
        return acctType;
    }
    
    /**
     * method untuk mendapatkan nilai balance customer
     * @return nilai balance
     */
    public double getBalance()
    {
        return balance;
    }
    
    /**
     * method untuk mendapatkan ID customer
     * @return no id customer
     */
    public String getId()
    {
        return id;
    }
    
    /**
     * method untuk assign nilai balance customer
     * @param amount nilai deposit customer
     */
    public void setBalance (double amount)
    {
        this.balance = amount;
    }
    
    /*
    /**
     * method untuk assign ID customer
     * @param accId ID dari akun 
     */
    /*
    public void setID (String acctId)
    {
        this.id = acctId;
    }
    */
   
    /**
     * method untuk assign tipe akun customer
     * @param type tipe akun
     */
    public void setAcctType(char type)
    {
        this.acctType = type;
    }
    
    /**
     * method untuk customer mengambil uang
     */
    public boolean withdraw (double amount)
    {
        if (balance - amount < 0)//cek nilai withdraw apakah akan menghasilkan deposit yang negatif
        {
            return false;
        } 
        else 
        {//mengurangi balance saat withdraw
            balance = balance - amount;
            return true;
        }
    }
    
}
    
