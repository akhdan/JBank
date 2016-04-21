import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.ParseException;
import java.util.*;

/**
 * Write a description of class Teller here.
 * 
 * @author (Akhdan Hilmy Taufiqurrahman) 
 * @version (14 april 2016)
 */
public class Bank
{
    private static double cInterestRate;        //variabel laju kredit */
    private static Date ctime;                  //variabel waktu tutup */
    private static double iInterestRate;        //variabel laju investasi*/
    private static int lastCustID=1000;              //variabel ID pelanggan terakhir */
    private static int nextCustID=1000;              // variabel ID pelanggan berikut */
    private static double pInterestRate;        // variabel laju bunga premi */
    private static Date stime ;                 // variabel waktu mulai */
    public static String Address="1234 JavaStreet, AnyCity, ThisState, 34567"; 
                                                // variabel alamat bank */
    public static int maxNumOfAcctsPerCustomer=4;   // static field maksimum nomor pelanggan*/
    public static int maxNumOfCustomers;    // variabel jumlah pelanggan maksimal, yaitu 20 */
    public static String Name="JBANK";          // variabel nama JBANK
    public static String phone;                 // variabel telepon */
    public static String website;               // variabel website */
    
    public static int numOfCurrentCustomer;
    
    private static int nextID=1000;
    
    public static Customer[] customer;
    
    /**
     * Static Initializer block
     * 
     * mengeset jumlah maximum customer yang dapat di buat dalam array
     */
    static {
        System.out.println("Enter Max number of customer");
        Scanner trial = new Scanner(System.in);
        maxNumOfCustomers=trial.nextInt();
        
        customer= new Customer[maxNumOfCustomers];
    }
    
    public static int numCust;
    
    
    public static boolean addCustomer(Customer cust){
            if (numCust<maxNumOfCustomers){
                customer[numCust]=cust;
                numCust++;
                return true;
            }
            else {
                return false;
            }
    }
    
    public static int getNumCust(){
        return numCust;
    }
    
    public static Customer getCustomer(int custID){
        for (int i=0; i<maxNumOfCustomers; i++){
            if (customer[i]!=null){
                if (customer[i].getCustID()==custID){
                    return customer[i];
                }
            }
        }
        return null;
    }
    
    
    public static int getMaxNumOfCustomers(){
        return maxNumOfCustomers;
    }
    
    /*public static String getAddress() 
    {
        return null;
    }*/
    
    public static double getCreditRate() /**method accessor untuk mengambil data laju kredit */
    {
        return cInterestRate;
    }
    
    public static double getInvestmentRate() /**method accessor  untuk mengambil data laju investasi */
    {
        return iInterestRate;
    }
    
    public static String getHoursOfOperation() /** method accessor untuk mengambil data dari jam operasional */
    {
        SimpleDateFormat df = new SimpleDateFormat("hh:mm a");
        String start1 = df.format(getStartTimeHour());
        String close1 = df.format(getCloseTimeHour());
        return start1 + " TO " + close1;
    }
    
    public static int getLastID() /** method accessor untuk mengambil ID terakhir */
    {
        return 0;
    }
    
    public static int getMaxCustomers(){
        return maxNumOfCustomers;
    }
    
    /*public static String getName() 
    {
        return null;
    }*/
    
    public static int getNextID (){ 
    /** Method accessor untuk me-return variabel numOfCurrentCustomer
       * @return nextCustID*/
    //method ini akan me-return variabel dari nextCustID
    
    nextCustID=lastCustID+1;
        if( numOfCurrentCustomer==maxNumOfCustomers){
            nextID=0;
        }
        else if(nextCustID==0){
            nextCustID=1000;
            numOfCurrentCustomer++;
            nextCustID=nextCustID;
        }
        else{
            nextID=nextCustID;
            lastCustID=nextCustID;
            numOfCurrentCustomer++;
        }
        return nextID;
    }
    
    
    public static String getPhone() /**method accessor untk mengambil telepon */
    {
        return null;
    }
    
    public static double getPremiumRate() /**method accessor untuk mengambil laju premi */
    {
        return pInterestRate;
    }
    
    public static String getWebsite() /** method accessor untuk mengambil website */
    {
        return null;
    }
    
    public static Date getStartTimeHour ()
    {
        return stime;
    }
    
    public static Date getCloseTimeHour ()
    {
        return ctime;
    }
    
    /** Method accessor untuk me-return variabel numOfCurrentCustomer
     * @return numOfCurrentCustomer
     */
    //method ini akan me-return variabel dari numOfCurrentCustomer
    /*public static int getNumOfCurrentCustomer () 
    {
        return numOfCurrentCustomer;
    }*/
    
    
    
    public static void setCreditRate(double rate) /** method mutator untuk men-set laju kredit */
    {
        cInterestRate=rate;
    }
    
    
    public static void setCloseTime(int hour, int min) {
        Calendar currentTime = new GregorianCalendar();
        ctime=new GregorianCalendar(currentTime.get(Calendar.YEAR), currentTime.get(Calendar.MONTH), currentTime.get(Calendar.DATE), hour, min).getTime();
    }
    
    public static void setInvestmentRate(double rate) /** method mutator untuk men-set laju investasi */
    {
        iInterestRate=rate;
    }
    
    
    public static void setPremium(double rate) /** method mutator untuk men-set premi */
    {
        pInterestRate=rate;
    }
    
    public static void setStartTime (int hour, int min)
    {
        Calendar currentTime = new GregorianCalendar();
        stime=new GregorianCalendar(currentTime.get(Calendar.YEAR), currentTime.get(Calendar.MONTH), currentTime.get(Calendar.DATE), hour, min).getTime();
    }
    
    public static void setCloseOpenTime(int openHour, int openMinute, int closeHour,int closeMinute){
        setCloseTime(closeHour, closeMinute);
        setStartTime(openHour, openMinute);
    }
    
}

