import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.ParseException;

/**
 * Write a description of class Investment here.
 * 
 * @author (Akhdan Hilmy Taufiqurrahman) 
 * @version (14 april 2016)
 */
public final class Investment extends Savings
{
    /**
     * variabel untuk menyimpan data tanggal akhir
     */
    private Date endDate;
    
    /**
     * variabel untuk menyimpan data laju bunga yang didapat
     */
    private double interestRate;
    
    /**
     * variabel untuk menyimpan data tanggal mulai
     */
    private Date startDate;
    
    /**
     * variabel untuk menyimpan data jangka waktu tabungan
     */
    private int term;

    /**
     * Constructor for objects of class Investment
     */
    public Investment(Customer cust, double amount, int months)
    {
        super(cust, amount);
        if(months>=0 && months<=6){
            interestRate=0.05;
        }
        else if(months>=6 && months<=12){
            term=months;
            interestRate=0.06;
        }
        else if(months>=12){
            term=months;
            interestRate=0.07;
        }
        Calendar s= new GregorianCalendar();
        startDate=s.getTime();
        s.add(Calendar.MONTH, term);
        endDate =s.getTime();
        
        
    }

    /**
     * method untuk melakukan perhitungan bunga 
     */
    public void addDailyInterest(int days)
    {
        double f=balance * (Math.pow ((1+(interestRate/365)),(days)));
        this.interestEarned= f-balance;
        balance=f;
    }
    
    
    /**
     * method untuk melakukan penarikan saldo
     */
    public boolean withdraw(double amount){
        boolean status=false;
        if(withdraw(amount)==true){
            if(Calendar.getInstance().before(endDate)==true){
                status=true;
            }
        }
        else{
            //do nothing
         }
        return status;
        }
}
