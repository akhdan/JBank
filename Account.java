/**
 * Write a description of class Teller here.
 * 
  * @author (Akhdan Hilmy Taufiqurrahman) 
 * @version (14 april 2016)
 */
public abstract class Account
{
    private char acctType;  /**assign variabel acctType */
    public double balance, checkWithdrawBalance; /**assign variabel balance */
    public String id;      /**assign variabel id */
    
    public Account(){ ///method constructor dari kelas Account 
        setBalance(1000);
        setAcctType('L');
    } 
    
    public Account(char type, double amount){
        setBalance(amount);
        setAcctType(type);
    }
    
    public Account(Customer cust, char type, double balance){
        setBalance(balance);
        setAcctType(type);
        this.id= Integer.toString(cust.getCustID())+type;
    }
    /**method constructor dari kelas Account */
    
    public boolean deposit(double amount){
        if(amount<0){
            return false;
        }
            else if (amount>0|amount!=0){
                balance=balance + amount;
                return true;
            }
                else{
                    return false;
                }
    }
    
    /** untuk mengambil data jenis dari suatu account
     * @return acctType*/
    public char getAcctType() 
    {
        return acctType; //mengembalikan nilai dari atribut acctType pada method
    }
    
    /**method accessor untuk mengambil data jumlah saldo
     * @return balance*/
    public double getBalance() 
    {
        return balance; //mengembalikan nilai dari atribut balance pada method
    }
    
    /**method accessor untuk memperoleh data dari suatu ID
     * @return id*/
    public String getId() 
    {
        return id; //mengembalikan nilai dari atribut id pada method
    }
    
    /**method mutator untuk men-set nilai pada suatu account 
     * @param amount */
    public void setBalance(double amount){
        if(amount>0){
                balance=amount;
        }
    }
    
    /**method mutator untuk men-set suatu ID 
     * @param acctId*/
    public void setID(String acctId) 
    {
        id = acctId; //men-set nilai dari acctId ke atribut objek id
    }
    
    /** method mutator untuk men-set jenis suatu account
    *@param type */
    public void setAcctType(char type){
         if(type=='S'|type=='O'|type=='L'|type=='I'){
             acctType = type;
         }
    }
    
    public boolean withdraw(double amount){
        checkWithdrawBalance= balance - amount;
        if (checkWithdrawBalance<0|amount<0){
            return false;
        }
        else{
            this.balance=balance-amount;
            return true;
        }
    }
    

    
}