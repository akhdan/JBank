
/**
 * Abstract class Checking - 
 * 
  * @author (Akhdan Hilmy Taufiqurrahman) 
 * @version (14 april 2016)
 */
public abstract class Checking extends Account
{
    /**
     * variabel biaya bulanan
     */
    protected double monthlyFee;
    
    protected abstract void feeAssessment();
    
    /**
     * method untuk mereset biaya bulanan
     */
    public void resetMonthlyFee(){
        monthlyFee=0;
    }
    
    /**
     * method untuk mengembalikan biaya bulanan
     * 
     * @return biaya bulanan
     */
    public double getMonthlyFee(){
        return monthlyFee;
    }
}
