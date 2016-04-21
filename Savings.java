
/**
 * Write a description of class Teller here.
 * 
 * @author (Akhdan Hilmy Taufiqurrahman) 
 * @version (14 april 2016)
 */
public class Savings extends Account
{
    // instance variables - replace the example below with your own
    public double interestEarned;

    /**
     * Constructor for objects of class Savings
     */
    public Savings(Customer customers, double amount)
    {
        super();
        id=customers.getCustID()+"";
        if(amount>=10){
            setBalance(amount);
        
    }

    
}

public double getInterestEarned()
{
    return interestEarned;
}

public boolean withdraw (double amount) 
{
    return false;
}


public void addDailyInterest (int days) 
{
    double f=balance * (Math.pow ((1+(0.03/365)), (days)));
    this.interestEarned = f-balance;
    balance = f;

}
}
