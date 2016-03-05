
/**
 * Write a description of class Bank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bank
{
    // instance variables - replace the example below with your own
    private static double creditInterestRate;
    private static String closeTime;
    private static double investmentInterestRate; 
    private static int lastCustID = 1000;
    private static int nextCustID;
    private static String phone;
    private static double premiumInterestRate;
    private static String startTime;
    public static String website;
    public static String bankAddress="1234 JavaStreet, Anycity, ThisState, 34567";
    public static int maxNumOfCustomers= 20;
    public static String bankName="JBANK";
    private static int numOfCurrentCustomer, nextId;
    
    /**
     * Method constructor untuk class bank.
     */
    
    public Bank () 
    {
    
    } 
    /**
    * Accessor Method for getAddress
    * @return kembali ke nilai "null"
    */
   
    /**
     * Getter method, return variabel address. Seharusnya address JBank sendiri.
     * @return bankAddress sebuah variabel alamat bank.
     */
    public static String getAddress()
    {
        return ""; //untuk mengembalikan nilai ke value null
    
    }
    
    /**
     * Getter method, return variabel rate kredit yang sedang diberikan JBank.
     * @return creditInterestRate sebuah variabel interest.
     */
    public static double getCreditRate()
    {
        return 0; //untuk mengembalikan nilai ke value 0
    
    }
    
    /**
     * Getter method, return variabel rate investment yang sedang diberikan JBank.
     * @return investmentInterestRate sebuah variabel interest.
     */
    public static double getInvestmentRate()
    {
        return 0; //untuk mengembalikan nilai ke value 0
    }
    
    /**
     * Getter method, return variabel jam operasi bank, didukung dengan variabel startTime dan closeTime.
     * @return premiumInterestRate sebuah variabel interest.
     */
    public static String getHoursOfOperation()
    {
        return ""; //untuk mengembalikan nilai ke value null
    
    }
    
    /**
     * Getter method, return variabel ID pelanggan terakhir.
     * @return lastCustID sebuah variabel berisi isi ID pelanggan terakhir.
     */
    public static int getLastID()
    {
        return 0; //untuk mengembalikan nilai ke value 0
    
    }
    
    /**
     * Getter method, return variabel jumlah maksimum pelanggan yang boleh terdaftar pada Jbank.
     * @return maxNumOfCustomer variabel integer yang berisi berapa banyak pelanggan yang boleh terdaftar pada bank.
     */
    public static int getMaxCustomers()
    {
        return 0; //untuk mengembalikan nilai ke value 0
    
    }
    
    /**
     * Getter method, return variabel nama bank, yaitu JBank.
     * @return bankName variabel yang berisi nama bank.
     */
    public static String getName()
    {
        return ""; //untuk mengembalikan nilai ke value null
    
    }
    
    /**
     * Getter method, return variabel ID pelanggan selanjutnya.
     */
    public static int getNextID()
   {
        int var1, var2;
       if (nextCustID == 0)  
       {
            nextCustID = 1000;
            numOfCurrentCustomer += 1;
            var1=nextCustID;
            return var1;
        }
        else if (numOfCurrentCustomer == maxNumOfCustomers)
        {
            var1=0;
            return var1;
        }
        else 
        {
            lastCustID = nextCustID;
            nextCustID += 1;
            numOfCurrentCustomer += 1;
            var2 = nextCustID;
            return var2;
        }
    }
   
    /**
     * Getter method, return variabel website Jbank.
     * @return nextCustID sebuah variabel berisi isi ID pelanggan selanjutnya.
     */
    public static String getWebsite()
    {
        return "";//untuk mengembalikan nilai ke value null
    
    }

    /**
     * Getter method, return variabel rate premium yang ditawarkan bank.
     * @return premiumInterestRate sebuah variabel interest.
     */
    public static double getPremiumRate()
    {
        return 0;//untuk mengembalikan nilai ke value 0
    
    }
    
    /**
     * Getter method, return variabel nomor telefon bank.
     * @return phone sebuah variabel yang berisi nomor telefon bank.
     */
    public static String getPhone()
    {
        return "";//untuk mengembalikan nilai ke value null
    
    }
    
    /**
     * Setter method, dapat mengubah rate kredit bank menggunakan method ini.
     * @param rate yang akan dimasukkan pada variabel creditInterestRate.
     * @return void
     */
    public static void setCreditRate(double rate)
    {
        
    }
    
    /**
     * Setter method, dapat mengubah rate investment bank menggunakan method ini.
     * @param rate yang akan dimasukkan pada variabel investmentInterestRate.
     * @return void
     */
    public static void setInvestmentRate(double rate)
    {
        
    }
    
    /**
     * Setter method, dapat mengubah rate premium bank menggunakan method ini.
     * @param rate yang akan dimasukkan pada variabel premiumInterestRate.
     * @return void
     */
    public static void setPremium(double rate)
    {
        
    }
    
    /**
     * Accessor Method for getNumOfCurrentCustomers
     * @return jumlah user yang ada sampai saat ini
     */
    public int getNumofCurrentCustomer()
    {
        return numOfCurrentCustomer;
    }
    }
    
    

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */

