import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Date;
/**
 * Write a description of class Customer here.
 * 
 * @author (Akhdan Hilmy T)  
 * @version (a version number or a date)
 */


public class Customer
{
  /**
    * deklarasi class variable
    */
   //accounts: Account[]=new Account[Bank.maxNumOfAcctsPerCustomer]
   private Account accounts = new Account();
   private String cityAddress;
   private int custId;
   public Date dob;
   private String email;
   public String firstName;
   public String lastName;
   private int numOfCurrentAccounts;
   private String streetAddress;
   private String phoneNumber;
   private String zipOrPostalCode;
   private String checkEmail;
   private String emailRegEx = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
   private Boolean checkBoole;
   
   /**
    * Constructor customer dengan parameter
    * @param String fname adalah nama depan nasabah
    * @param String lname adalah nama belakang nasabah
    */
   public Customer(String firstName, String lastName)
    {
        this(firstName, lastName, null);
    }
    
   /**
    * Constructor customer dengan parameter
    * @param String fname adalah nama depan nasabah
    * @param String lname adalah nama belakang nasabah
    * @param String dob adalah tanggal lahir nasabah
    */
    public Customer(String firstName, String lastName, Date dob)
    {
        this.firstName = firstName; 
        this.lastName = lastName;
        this.dob = dob;
        custId = Bank.getNextID();
    }
    
   /**
    * Constructor customer dengan parameter
    * @param String fname adalah nama depan nasabah
    * @param String lname adalah nama belakang nasabah
    * @param String dob adalah tanggal lahir nasabah
    * @param  int custId adalah ID nasabah
    */
    public Customer(String firstName, String lastName, Date dob, int custId)
    {
    }
   
   /**
    * method memasukkan/menambahkan akun baru
    * @param char type adalah tipe akun
    * @param double balance adalah saldo awal
    */
   public boolean addAccount(char type, double balance)
   {
       return true;
   }
    
   /**
    * method untuk mendapatkan address
    */ 
    private String getAddress()
    {
       return streetAddress+","+cityAddress+","+zipOrPostalCode;
    }
    
   /**
    * method untuk mendapatkan akun
    */
    public Account getAccount()
    {
       return accounts;
    }
    
   /**
    * method untuk mendapatkan id nasabah
    */
    public int getCustomerId()
    {
       return custId;
    }
    
   /**
    * method untuk mendapatkan email nasabah
    */
    private String getEmail()
    {
       return email;
    }
    
    public Date getDateOfBirth()
    {
        return dob;
    }
    
   /**
    * method untuk mendapatkan nama nasabah
    */
    public String getName()
    {
       return lastName+","+firstName;
    }
    
   /**
    * method untuk mendapatkan number akun
    */
    public int getNumOfAccounts()
    {
       return numOfCurrentAccounts;
    }
    
   /**
    * method untuk mendapatkan nomer telepon
    */
    public String getPhoneNumber()
    {
       return phoneNumber;
    }
    
   /**
    * method memasukkan alamat rumah nasabah
    * @param String street adalah nama jalan
    * @param String city adalah nama kota
    * @param String code adalah kode pos
    */
    private void setAddress(String street, String city, String code)
    {
        streetAddress = street;
        cityAddress = city;
        zipOrPostalCode = code;
    }
    
   /**
    * method untuk memasukkan alamat email nasabah
    * @param String emailAddress adalah alamat email nasabah
    */
    private void setEmail(String emailAddress)
    {
        checkEmail = emailAddress;
        checkBoole = checkEmail.matches(emailRegEx);
            
            if (checkBoole == false)
            {
                System.out.println("FALSE");
            }
            else if(checkBoole == true)
            {
                System.out.println("TRUE");
                email = emailAddress;
            }
    }
    
   /**
    * method memasukkan nama nasabah
    * @param String lastName memasukkan nama belakang nasabah
    * @param String firstName memasukkan nama depan nasabah
    */
    public void setName(String lastName, String firstName)
    {
        lastName = lastName;
        firstName = firstName;
    }
   
   /**
    * method memasukkan tanggal lahir nasabah
    * @param Date dob adalah tanggal lahir nasabah
    */
   public void setDateOfBirth(Date dob)
   {
       this.dob = dob;
   }
    
   /**
    * method memasukkan nomor telepon nasabah
    * @param String phoneNum adalah nomor telepon nasabah
    */
    public void setPhoneNumber(String phoneNum)
    {
        phoneNumber = phoneNum;
    }
    
   /**
    * method penerima input berupa referensi terhadap objek dari kelas Account
    * @param Account akun adalah akun nasabah
    */
    public void setAccount(Account akun)
    {
        accounts = akun;
    }
   
   /**
    * method memasukkan ID nasabah
    * @param int custId adalah ID nasabah
    */
   public void setCustId(int custId)
   {
       custId = custId;
   }
   
   /**
    * method untuk menghapus akun
    * @param char type adalah tipe akun
    */
   public boolean removeAccount(char type)
   {
       return true;
   }
}
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */


