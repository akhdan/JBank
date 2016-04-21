import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Write a description of class Teller here.
 * 
 * @author (Akhdan Hilmy Taufiqurrahman) 
 * @version (14 april 2016)
 */
public class Customer
{
    private Account[] accounts=new Account[4];  // variabel untuk akun baru */
    private String cityAddress;                 // variabel Alamat kota */
    private int custId;                         // variabel ID pelanggan */
    private Date DOB;                           // variabel tanggal lahir */
    private String email;                       // variabel alamat email */
    private String firstName;                   // variabel nama depan */
    private String lastName;                    // variabel nama belakang */
    private int numberOfCurrentAccounts;        // variabel jumlah account */
    private String emailregex;                  // variabel regular expression email */
    private Boolean b;                          // variabel boolean untuk mengecek kebenaran email */
    private String streetAddress;               // variabel Alamat jalan */
    private String cityName;                    // variabel nama kota */
    private String phoneNumber;                 // variabel nomor telepon */
    private String zipOrPostalCode;             // variabel kode pos */
    
    /**Constructor kelas Customer*/
    public Customer(){}
    /**Constructor untuk kelas Customer dapat diidentifikasikan dengan variabel-variabel berikut */
    public Customer(String fname, String lname, Date dob){
        this.firstName=fname;
        this.lastName=lname;
        this.DOB=dob;
        this.custId=Bank.getNextID();
    }
    /**Constructor untuk kelas Customer dapat diidentifikasikan dengan variabel-variabel berikut*/
    public Customer(String firstName, String lastName)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.DOB=null;
        this.custId=Bank.getNextID();
    }
      
    /**method accessor untuk mengambil data alamat 
       *@return alamat Jalan, kode pos, nama kota
       *pada Modul 2, method ini diberi hasil return*/
    public String getAddress() 
    {
        return streetAddress+" "+ cityAddress +" "+ zipOrPostalCode;
        //hasil return-nya adalah gabungan dari variabel alamat Jalan, kode pos, nama kota
        //penggabungan dilakukan dengan memberi tanda '+'
    }
    
    public Account getAccount(char type){
        for (int i=0; i<4; i++){
                if(accounts[i]!=null){  
                   if(type==accounts[i].getAcctType()){
                       return accounts[i];
                   }
                }
         }
        return null;
    }
    
    /**
     * Menghapus akun dari kustomer dari array
     * 
     * @param type tipe akun yang akan dihapus dari array
     * @return mengembalikan status dari mrhod, jika true maka akun terhapus, jika tidak makan akun tidak terhapus
     */
    public boolean removeAccount(char type){
        for (int i=0; i<4; i++){
                if(accounts[i]!=null){  
                   if(type==accounts[i].getAcctType()){
                       accounts[i]=null;
                       this.numberOfCurrentAccounts--;
                       return true;
                   }
                }
         }
        return false;
    }
    
    
    
    
    
    
    
    
    
    
    /**method accessor untuk mengambil data nama 
       *@return Nama Belalakng, Nama Depan
       *pada Modul 2, method ini diberi hasil return*/
    public String getName() 
    {
        return lastName+","+firstName; 
        //hasil return-nya adalah gabungan dari variabel nama belakang, dan nama depan
        //penggabungan dilakukan dengan memberi tanda '+'
        //untuk agar hasil gabungan keduanya dipisahkan oleh koma, tambahkan "," ditengah tanda '+'
    }
    
   
    
    /** method untuk mengambil data ID Customer
     *@return custId*/
    public int getCustID() 
    {
        return custId; //mengembalikan nilai dari atribut custId pada method
    }
    
    public Date getDOB ()
    {
        return DOB;
    }
    
     
    /** method untuk mengambil data email
     * @return email*/
    public String getEmail() 
    {
        return email; //mengembalikan nilai dari atribut email pada method
    }   
    
    /** method untuk mengambil data jumlah akun yang dimiliki
     * @return numberOfCurrentAccounts*/
    public int getNumOfAccounts()
    {
        return numberOfCurrentAccounts; //mengembalikan nilai dari atribut numberOfCurrentAccounts pada method
    }
    
    /** method untuk mengambil data nomor telepon
     * @return phoneNumber*/
    public String getPhoneNumber()
    {
        return phoneNumber; //mengembalikan nilai dari atribut phoneNumber pada method
    }
    
    /** variabel untuk men-set sebuah alamat
       *pada Modul 2, method ini diberi suatu nilai
       @param street, city, code*/
    public void setAddress(String street, String city, String code) 
    {
        streetAddress=street; //men-set nilai dari street ke atribut objek streetAddress
        cityName=city;        //men-set nilai dari city ke atribut objek cityName
        zipOrPostalCode=code; //men-set nilai dari code ke atribut objek zipOrPostalCode
    }
    
    /** method untuk men-set sebuah email
       @param emailAddress*/
    public void setEmail(String emailAddress) 
    {
        String emailregex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$"; //regex yang digunakan untuk mengecek validasi suatu email
        Pattern pattern = Pattern.compile(emailregex); //men-set nilai dari emailAddress ke atribut objek email
        Matcher matcher = pattern.matcher(emailAddress); //mencocokan suatu email dengan regex-nya
        System.out.println(emailAddress +" : "+ matcher.matches()); //hasil print validasinya
        if (matcher.matches()==true){
            email=emailAddress;
        }
    }
    
    /** method untuk men-set sebuah nama  
       *pada Modul2, nama methodnya dirubah dari setCustomerName menjadi set Name
       *pada Modul 2, method ini diberi suatu nilai
       *@param lname fname*/
    public void setName(String lname, String fname) 
    {
        lastName = lname;   //men-set nilai dari lname ke atribut objek lastName
        firstName = fname;  //men-set nilai dari fname ke atribut objek firstName
    }
    
    /* method untuk mengatur sebuah akun
       *pada Modul 2, method ini diberi suatu nilai 
       *@param akun
    public void setAccount(Account akun) 
    {
        accounts =akun; //men-set nilai dari akun ke atribut objek accounts
    }*/
   
    /** method untuk men-set nomor telepon
       *@param phoneNum*/
    public void setPhoneNumber(String phoneNum) 
    {
        this.phoneNumber=phoneNum; //men-set nilai dari phoneNum ke atribut objek phoneNumber
    }
   
    
    public boolean addAccount(Account akun){
        /**
         * Variabel lokal untuk boolean akun dimasukan ke array atau tidak
         */
        boolean accountAdded=false;
        if (getNumOfAccounts()<5){
            if(checkMultiAccount(akun)==false){
                accounts[numberOfCurrentAccounts]=akun;
                numberOfCurrentAccounts++;
                accountAdded=true;
            }
            else if (checkMultiAccount(akun)==true){
                //do nothing
            }
        }
        else{
            return accountAdded;
        }
        return accountAdded;
    }
    
    
    
    public boolean checkMultiAccount(Account akun){
         for (int i=0; i<4; i++){
                if(accounts[i]!=null){  
                   if(akun.getAcctType()==accounts[i].getAcctType()){
                       return true;
                   }
                }
         }
         return false;
    }
    
    
    
    
    
    
    
    
    public void setCustId(int custId) {
        this.custId = custId; //mengembalikan nilai dari atribut custId pada method
    }
    
}