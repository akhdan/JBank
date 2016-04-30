import java.util.Scanner;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.lang.Math;
import java.math.BigDecimal;
import java.math.MathContext;

/**
 * Write a description of class Teller here.
 * 
 * @author (Akhdan Hilmy T) 
 * @version (a version number or a date)
 */



public class Teller
{
    private static MathContext mc = new MathContext(8), mc1 = new MathContext(3);
    
    /*
    public static String firstName = "Yudi";
    public static String lastName = "Aslab";
    public static Date dob;
    */
    
    /*
     * belom kelar
     * newCustomer : Customer[]=new Customer[Bank.maxNumOfCustomers]
     */
    
    /**
     * Constructor Teller
     */
    public Teller()
    {
        Bank.getHoursOfOperation();
        
        
    } 
   
    /**
     * method untuk membuat customer baru
     * @param String firstName adalah nama depan nasabah
     * @param String lastName adalah nama belakang nasabah
     * @param Date dob adalah tanggal lahir nasabah
     */
    public Customer createNewCustomer(String firstName, String lastName, Date dob)
    {
        return null;
    }
    
    /**
     * method untuk customer
     * @param int custId adalah ID nasabah
     */
    public Customer getCustomer(int custId)
    {
        return null;
    }
    
    /**
     * method main termodifikasi untuk menghitung interest rate
     */
    public static void main()
    {
        //setting amount
        
        Account savings = new Account ('S', 1000);
        Account investment = new Account ('I', 1000);
        Account creditLine = new Account ('L', 500);
        
        //setting balance
        BigDecimal balanceSavings = new BigDecimal (savings.getBalance());
        BigDecimal balanceInvestment = new BigDecimal (investment.getBalance());
        BigDecimal balanceCreditLine = new BigDecimal (250);
        
        //setting rate
        BigDecimal rateSavings = new BigDecimal (.03);      //bunga 3% per hari
        BigDecimal rateInvestment = new BigDecimal (.07);   //laju investasi
        BigDecimal rateCreditLine = new BigDecimal (.18);   //besar kredit
        BigDecimal compoundDaily = new BigDecimal (360);    //komponen per hari
        BigDecimal rateYear = new BigDecimal (1.0);         //rate per tahun
        
        //function 1
        BigDecimal f1Savings = rateSavings.divide(compoundDaily, mc).add(new BigDecimal(1.0));
        BigDecimal f1Investment = rateInvestment.divide(compoundDaily, mc).add(new BigDecimal(1.0));
        BigDecimal f1creditLine = rateCreditLine.divide(compoundDaily, mc).add(new BigDecimal(1.0));
        
        //function 2
        BigDecimal f2 = compoundDaily.multiply(rateYear, mc);
        
        //function 3
        BigDecimal f3Savings = new BigDecimal (Math.pow(f1Savings.doubleValue(), f2.doubleValue()),mc);
        BigDecimal f3Investment = new BigDecimal (Math.pow(f1Investment.doubleValue(), f2.doubleValue()),mc);
        BigDecimal f3creditLine = new BigDecimal (Math.pow(f1creditLine.doubleValue(), f2.doubleValue()),mc);
        
        //function 4
        BigDecimal f4Savings = f3Savings.multiply(balanceSavings, mc);
        BigDecimal f4Investment = f3Investment.multiply(balanceInvestment, mc);
        BigDecimal f4creditLine = f3creditLine.multiply(balanceCreditLine, mc);
        
        //show
        System.out.println("Saldo Tabungan Anda   : " +savings.getBalance());
        System.out.println("Saldo Investasi Anda  : " +investment.getBalance());        
        System.out.println("Saldo Tabungan baru   : " +f4Savings.doubleValue());
        System.out.println("Saldo Investasi baru  : " +f4Investment.doubleValue());
        System.out.println("Saldo Kredit baru     : " +f4creditLine.doubleValue());
    }
    
    /**
     * main method aplikasi
     */
    public static void main(String[] args)
    {
         /*
         * Customer c1 = new Customer();
        c1.setName("Yudi","Aslab");
        System.out.print(c1.getName());
        Account a1 = new Account(), acct;
        a1.setBalance(7000000);
        c1.setAccount(a1);
        acct = c1.getAccount();
        System.out.println(acct.getBalance());
         */
        
        /*
        Customer c1 = new Customer(firstName, lastName, dob);
        System.out.println(c1.getName());
        Calendar cal1 = new GregorianCalendar(2016, 3, 10);
        System.out.println("Date  : " + cal1.get(Calendar.DAY_OF_MONTH));
        System.out.println("Month : " + cal1.get(Calendar.MONTH));
        System.out.println("Year  : " + cal1.get(Calendar.YEAR));
        */
        
        int userResponse;
        String firstName;
        String lastName;
        Date dob;
        String phoneNum;
        int accountType;
        double balanceInit;
        String random;
        String year, month, day;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Apakah Anda ingin menjadi Nasabah? 1=Ya/0=Tidak");
        userResponse = scan.nextInt();
        do
        {
            //input data nasabah
            System.out.println("Selamat Datang di Sistem Perbankan Kami");
            random = scan.nextLine();
            System.out.println("Masukkan Nama Depan Anda: ");
            firstName = scan.nextLine();
            System.out.println("Masukkan Nama Belakang Anda: ");
            lastName = scan.nextLine();
            System.out.println("Masukkan Nomor Telepon Anda: ");
            phoneNum = scan.nextLine();
            System.out.println("Masukkan Tanggal Lahir Anda:");
            System.out.println("Tanggal Lahir (angka): ");
            day = scan.nextLine();
            System.out.println("Bulan Lahir (angka): ");
            month = scan.nextLine();
            System.out.println("Tahun Lahir (angka): ");
            year = scan.nextLine();
            
            //membuat objek baru customer
            //String year="1995", month="7", day="10";
            Customer c1 = new Customer(firstName, lastName, (new GregorianCalendar(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day)).getTime()));
            
            c1.setPhoneNumber(phoneNum);
            
            System.out.println("Jenis Akun yang ingin Anda buat adalah?");
            System.out.println("1=Savings/2=Overdraft/3=CreditChecking/4=Investment/0=Tidak");
            accountType = scan.nextInt();
            
            Account a1 = new Account();
            //decision case account
            switch(accountType)
            {
                case 1:
                    System.out.println("Masukkan saldo awal Anda :");
                    balanceInit = scan.nextInt();
                    balanceInit = balanceInit+Account.balance;
                    a1 = new Account('S', balanceInit);
                    break;
                    
                case 2:
                    System.out.println("Masukkan saldo awal Anda :");
                    balanceInit = scan.nextInt();
                    a1 = new Account('O', balanceInit);
                    break;
                    
                case 3:
                    System.out.println("Masukkan saldo awal Anda :");
                    balanceInit = scan.nextInt();
                    a1 = new Account('L', balanceInit);
                    break;
                    
                case 4:
                    System.out.println("Masukkan saldo awal Anda :");
                    balanceInit = scan.nextInt();
                    a1 = new Account('I', balanceInit);
                    break;
                    
                case 0:
                    System.out.println("Terima Kasih Atas Kunjungan Anda");
                    break;
                /*    
                default :
                    System.out.println("Terima Kasih Atas Kunjungan Anda");
                    break;
                */
            }
            
            System.out.println("=====================================================");
            System.out.println("JBANK - INFO AKUN ANDA");
            System.out.println("*Nama Anda          : "+c1.getName());
            System.out.println("*Tanggal Lahir Anda : "+c1.getDateOfBirth());
            System.out.println("*Nomor Telepon Anda : "+c1.getPhoneNumber());
            System.out.println("*Nomor ID Anda      : "+c1.getCustomerId());
            System.out.println("*Jumlah Saldo Anda  : "+a1.getBalance());
            System.out.println("*Tipe Akun Anda     : "+a1.getAcctType());
            System.out.println("*Jam Operasional    : "+Bank.getHoursOfOperation());
            System.out.println("=====================================================\n");
            
            System.out.println("Apakah Anda ingin membuat Akun Nasabah lagi? 1=Ya/2=Tidak");
            userResponse = scan.nextInt();
        }
        while(userResponse==1);
        
        System.out.println("Terima Kasih Atas Kunjungan Anda");
       
    }
    
}

 

    /**
     * Constructor for objects of class Teller
     */
 

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */


