import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.lang.*;
import java.math.*;
import java.lang.Math;
import java.math.BigDecimal;
import java.math.MathContext;

/**
 * Write a description of class Teller here.
 * 
 * @author (Akhdan Hilmy Taufiqurrahman) 
 * @version (14 april 2016)
 */

public class Teller
{
    
    
    public static void main(String[] args){
        
        Customer c1 = new Customer ("Akhdan", "Hilmy");
        
        Savings saving = new Savings (c1, 500);
        
        System.out.println ("Nama               :" + c1.getName());
        System.out.println ("Balance savings    :" + saving.getBalance());
        saving.addDailyInterest(280);
        System.out.println  ("Nilai balance 280 :" + saving.getBalance());
        
       
        //trial space
        System.out.println("Mulai Trial Space untuk Modul 5 task 1&2");
        Bank.getMaxNumOfCustomers();
        
        System.out.println("Max num of customer" +Bank.getMaxNumOfCustomers());
        
            Customer d1= new Customer ("hehe", "haha", ( new GregorianCalendar(12, 5, 12).getTime())); //membuat object kustomer baru dengan input yang ada
            String a = (Bank.addCustomer(d1)==true) ? "Customer ditambahkan": "Customer tidak berhasil ditambahkan";
            System.out.println(a);
            
            Customer d2= new Customer ("hehe2", "haha2", ( new GregorianCalendar(24, 5, 12).getTime())); //membuat object kustomer baru dengan input yang ada
            a = (Bank.addCustomer(d2)==true) ? "Customer ditambahkan": "Customer tidak berhasil ditambahkan";
            System.out.println(a);
            
            Customer d3= new Customer ("hehe3", "haha3", ( new GregorianCalendar(12, 6, 12).getTime())); //membuat object kustomer baru dengan input yang ada
            a = (Bank.addCustomer(d3)==true) ? "Customer ditambahkan": "Customer tidak berhasil ditambahkan";
            System.out.println(a);

       System.out.println("Print semua data");
        for (int i=0; i<Bank.getNumCust();i++){
            System.out.println(Bank.customer[i].getName());
            System.out.println(Bank.customer[i].getDOB());
            System.out.println(Bank.customer[i].getCustID());
        }
        
        System.out.println("Ambil kustomer berdasarkan ID 1001");
        System.out.println(Bank.getCustomer(1003).getName()+"\nTrial space selesai\n\n");
        
        //=======Program Jbank Utama================================================
        
        setCloseOpenTime(7, 0, 21,0);                                             //Set Waktu buka dan tutup bank dengan method dalam kelas yang sama 
        
        Date current=new GregorianCalendar().getTime();                           //Mengeset variable Date (dan waktu) saat ini agar dapat dibandingkan dengan waktu buka/tutup bank
        SimpleDateFormat df = new SimpleDateFormat("hh:mm a");
        
        /**
         * If dibawah berikut ini adalah fungsi pengecekan apakah waktu saat ini masih dalam jam buka bank, menggunakan method Date .equals, .before, .after
         * untuk membandingkan dua tanggal. Ketiga method tersebut akan mengembalikan nilai boolean untuk menilai jika paramater tanggal pertama sama, sebelum
         * atau sesudah dari tanggal kedua.
         * 
         * Jika waktu saat ini berada dalam jam operasional, maka program Jbank akan berjalan. jika tidak maka Program jbank akan keluar.
         */
        if((current.after(Bank.getStartTimeHour())==true | current.equals(Bank.getStartTimeHour())==true)&(current.before(Bank.getCloseTimeHour())==true | current.equals(Bank.getCloseTimeHour())==true)){
            
                int loop=0;                                                             //deklarasi dan Instalasi parameter melanjutkan atau memberhentikan loop do while
                
                System.out.println("Operation Hour: " + getHoursOfOperation());// Print 
                System.out.println("Current Time  : " + df.format(current));
                
                do{
                          loop=0;                                                       //instalasi ulang parameter agar tidak terjadi infinite loop
                          
                          System.out.println("Selamat datang Di Jbank. Apakah anda ingin menjadi nasabah? (y/n)");
                          Scanner inputreac = new Scanner(System.in);                   //instalasi scanner untuk mengambil input dari user, akan digunakan untuk semua jenis input
                          char reaction = inputreac.next().charAt(0);                   //ambil input tipe char (karakter pertama dari input user)
                          
                              //Jika input user Y/y, memasuki algoritma pemgambilan data kustomer
                              if (reaction=='y' | reaction=='Y'){
                                 
                                          inputreac.nextLine();                         //Deklarasi ulang untuk menghapus karakter yang tersisa pada next().charAt(0)
                                          
                                          System.out.println("Masukkan nama Depan");
                                          String namaDepan = inputreac.nextLine();      //variabel untuk menyimpan input nama depan user (berjenis string)
                                          
                                          System.out.println("Masukkan nama Keluarga");
                                          String namaBelakang = inputreac.nextLine();   //variabel untuk menyimpan input nama belakang user (berjenis String)
                                          
                                          System.out.println("Masukkan tanggal lahir (1-31)");
                                          int day = inputreac.nextInt();            //variabel untuk menyimpan input tanggal lahir user (berjenis int)
    
                                          System.out.println("Masukkan bulan lahir (1-12)");
                                          int month = inputreac.nextInt()-1;          //variabel untuk menyimpan input bulan lahir user (berjenis int)
                                          
                                          System.out.println("Masukkan tahun lahir (1995-2000)");
                                          int year= inputreac.nextInt();            //variabel untuk menyimpan input Tahun lahir user (berjenis int)
                                         
                                          /*Customer c1= new Customer (namaDepan, namaBelakang, ( new GregorianCalendar(year, month, day).getTime())); */
                                          String status = (Bank.addCustomer(c1)==true) ? "Customer ditambahkan": "Customer tidak berhasil ditambahkan";
                                          System.out.println(status);
                                          
                                                System.out.println("Apakah Anda ingin membuat Akun? (y/n)");
                                                char membuatAkun = inputreac.next().charAt(0);
                                                //Jika User ingin membuat akun
                                                if(membuatAkun=='y' | membuatAkun=='Y'){
                                          
                                                      System.out.println("Jenis Akun apa yang akan anda Buat? (Override=O/Line of Credit=L/Investasi=I/Saving=S)");
                                                      char jenisAkun = inputreac.next().charAt(0);
                                                      
                                                      System.out.println("masukkan saldo");
                                                      int initialBalance =inputreac.nextInt();
                                                      
                                                      /*Account a1= new Account (c1,initialBalance, jenisAkun);
                                                      double balance= a1.getBalance(); // mengambil balance dari akun yang baru saja dibuat */
                                                          
                                                      /*
                                                       * Mengassign kustomer ke akun. 
                                                       */
                                                      /*c1.addAccount(a1);*/
                                                      
                                                      //print hasil
                                                      System.out.println("Akun anda berhasil dibuat. Periksa kembali data dibawah ini");
                                                      /*System.out.println("Nama          : " + c1.getCustomerName());
                                                      System.out.println("Jenis Akun    : " + c1.getAccount(jenisAkun).getAcctType());
                                                      System.out.println("Saldo Saat ini: " + c1.getAccount(jenisAkun).getBalance());
                                                      System.out.println("ID akun       : " + c1.getAccount(jenisAkun).getId());*/
                                                          
                                                          //Pilihan untuk kembai ke menu utama
                                                          System.out.println("Apakah Anda ingin Kembali ke menu utama? (y/n)");
                                                          char menuUtama = inputreac.next().charAt(0);
                                                     
                                                            if (menuUtama=='y' | menuUtama=='Y'){
                                                                System.out.println("Kembali ke menu utama....");
                                                                loop=1;
                                                            }
                                                            else if (menuUtama=='n' | menuUtama=='N'){
                                                                System.out.println("terima kasih karena telah mencoba Program Jbank. Terminasi program sekarang");
                                                                loop=0;
                                                            }
                                                          
                                                    }
                                                //Jika User tidak ingin membuat akun, print data yang didapat dan berikan opsi untuk kembali ke menu utama
                                                else if(membuatAkun=='n' | membuatAkun=='N'){
                                                     System.out.println("Data anda berhasil disimpan. Periksa kembali data dibawah ini");
                                                     /*System.out.println("Nama               : " + c1.getCustomerName());
                                                     System.out.println("Tanggal Lahir      : " + c1.getDOB());
                                                     System.out.println("ID Kustomer        : " + c1.getCustid());*/
                                                     
                                                     System.out.println("Apakah Anda ingin Kembali ke menu utama? (y/n)");
                                                     char menuUtama = inputreac.next().charAt(0);
                                                     
                                                     if (menuUtama=='y' | menuUtama=='Y'){
                                                         System.out.println("Kembali ke menu utama....");
                                                         loop=1;
                                                     }
                                                     else if (menuUtama=='n' | menuUtama=='N'){
                                                         System.out.println("terima kasih karena telah mencoba Program Jbank. Terminasi program sekarang");
                                                         loop=0;
                                                     }
                                                     
                                                }
                                                
                                          }//end if
                              
                              
                              else if (reaction=='n' | reaction=='N'){
                                  //terminasi program
                                  System.out.println("terima kasih karena telah mencoba Program Jbank. Terminasi program sekarang");
                                  loop=0;
                              }
                                  
                              else{
                                  //jika input salah/tidak sesuai, tetap loop
                                  loop=1;
                              }
                                
                }while (loop==1);           //tetap loop selama nilai variabel loop sama dengan 1 
                
             }//end if
             
        else{ 
            System.out.println("Sorry, Jbank Service is not Available");            //print pesan bahwa masih Belum operasional
        }
    }
    
    
    
    //public static void printTime() {
    //    System.out.println(Bank.getHoursOfOperation());
    //}
    
    public Teller()
    {
    }
    
    private static void setCloseOpenTime(int openHour, int openMinute, int closeHour,int closeMinute){
        Bank.setCloseOpenTime(openHour, openMinute, closeHour,closeMinute);
    }
    
    /**
     * Method untuk mengembalikan waktu buka dan tutup JBank dari Teller
     * 
     * @return Jam buka bank TO jam tutup bank
     */
    private static String getHoursOfOperation(){
        String output= Bank.getHoursOfOperation();
        return output;
    }
    
}