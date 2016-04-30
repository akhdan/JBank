import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
/**
 * Write a description of class Bank here.
 * 
 * @author (Akhdan Hilmy T) 
 * @version (a version number or a date)
 */

public class Bank
{
   /**
    * deklarasi class variabel
    */
   private static double creditInterestRate;
   private static String closeTime;
   private static double investmentInterestRate;
   private static int lastCustID=1000;
   private static int nextCustID=1000;
   private static String phone;
   private static double premiumInterestRate;
   private static String startTime;
   public static String website;
   public static final String BANK_ADDRESS = "1234 JavaStreet, AnyCity, ThisState, 34567";
   public static int maxNumOfAcctsPerCustomer = 4;
   public static final String BANK_NAME = "JBANK";
   private static int numOfCurrentCustomer;
   private static int nextID;
   
   public static final int MAX_NUM_OF_CUSTOMERS = 20 ;
   
   
   
         
   
   /**
    * Constructor Bank tanpa argumen
    */
   public Bank()
   {
   }
   
   /**
    * mengisi alamat bank
    */
   /*
   public static String getAddress()
    {
       return BANK_ADDRESS;
    }
   */
   
   /**
    * meminta bunga bank
    */
   public static double getCreditRate()
    {
       return creditInterestRate; 
    }
    
   /**
    * meminta bunga investasi
    */
   public static double getInvestmentRate()
    {
       return investmentInterestRate;
    }
   
   /**
    * mengisi jam operasional
    */
   public static String getHoursOfOperation()
    {
       SimpleDateFormat startclose = new SimpleDateFormat("k:mm");
       Calendar start = new GregorianCalendar();
       start.set(Calendar.HOUR_OF_DAY, 8);
       start.set(Calendar.MINUTE, 0);
       Date startTime = start.getTime();
       Calendar close = new GregorianCalendar();
       close.set(Calendar.HOUR_OF_DAY, 17);
       close.set(Calendar.MINUTE, 0);
       Date closeTime = close.getTime();
       
       return startclose.format(startTime) + " TO " + startclose.format(closeTime);
    }
   
   /**
    * mengisi nomor antrian terakhir
    */ 
   public static int getLastID()
    {
       return lastCustID;
    }
   
   /**
    * mengisi nomor antrian selanjutnya
    */
   public static int getNextID()
    {
       int variable1, variable2; //local variables
       if (nextCustID == 0)
       {
           lastCustID = 1000;
           nextCustID = 1000;
           numOfCurrentCustomer += 0;
           variable1 = nextCustID;
       }
       else if (numOfCurrentCustomer == MAX_NUM_OF_CUSTOMERS)
       {
           variable1 = 0;
       }
       else
       {
           lastCustID = nextCustID;
           numOfCurrentCustomer++;
           nextCustID = lastCustID + 1;
           variable1 = nextCustID;
       }
       return variable1;
    }
   
   /**
    * mengisi jumlah maksimal nasabah
    */
   /*
   public static int getMaxCustomer()
    {
       return MAXNUMOFCUSTOMERS;
    }
   */
    
   /**
    * mengisi nama bank
    */
   /*
   public static String getName()
    {
       return BANK_NAME;
    }
   */
    
   /**
    * mengisi website bank
    */
   public static String getWebsite()
    {
       return website;
    }
   
   /**
    * mengisi bunga premium
    */
   public static double getPremiumRate()
    {
       return premiumInterestRate;
    }
  
   /**
    * mengisi nomor telepon bank
    */ 
   public static String getPhone()
    {
       return phone;
    }
   
   /**
    * mengisi jumlah nasabah sekarang
    */
   public static int getNumOfCurrentCustomer()
    {
        return numOfCurrentCustomer;
    }
    
   /**
    * mengatur laju kredit
    * @param double rate adalah besar laju kredit
    */
   public static void setCreditRate(double rate)
    {
        creditInterestRate = rate;
    }
   
   /**
    * mengatur laju investasi
    * @param double rate adalah besar laju investasi
    */
   public static void setInvestmentRate(double rate)
    {
        investmentInterestRate = rate;
    }
    
   /**
    * mengatur bunga premium
    * @param double rate adalah besar laju bunga premium
    */
   public static void setPremium(double rate)
    {
        premiumInterestRate = rate;
    }
   
   /**
    * mengatur jam buka bank
    * @param int hour menujukkan jam
    * @param int min menunjukkan menit
    */
   public static void setStartTime(int hour, int min)
   {
   }
    
   /**
    * mengatur jam tutup bank
    * @param int hour menujukkan jam
    * @param int min menunjukkan menit
    */
   public static void setCloseTime(int hour, int min)
   {
   }
     
}


    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */

