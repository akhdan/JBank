
/**
 * Write a description of class Customer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Customer
/**
 * Fungsi Class Customer : konfigurasi data Customer contohnya nama,alamat, dan nomor telepon.
 */
{
    // instance variables - replace the example below with your own
    private Account accounts =new Account();
    private String cityAddress;
    private int custId;
    private String dateOfBirth;
    private String email;
    private String firstName;
    private String lastName;
    private String cityName;
    private int numberOfCurrentAccounts;
    private String streetAddress;
    private String phoneNumber;
    private String zipOrPostalCode;
    private String emailVali;
    private String emailRegex = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
    private Boolean boolVali;
    
     /**
     * Constructor for objects of class Customer
     */
    public Customer()
    {
    
    }
    /**
     * Custructor with parameter for object of class Customer
     * @param fname define the firstname of the customer
     * @param lname define the lastname of the customer
     *
     */
    public Customer(String fname, String lname){
        this(fname, lname, "");
    }
    /**
     * Custructor with parameter for object of class Customer
     * @param firstName define the firstname of the customer
     * @param lastName define the lastname of the customer
     * @param dateOfBirth define the date pf birth of the customer
     * 
     */
    public Customer(String firstName, String lastName, String dateOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.custId = Bank.getNextID();
    }
    /**
     * this method used to get the value of the customer's address
     * @return String This returns combination of streetAddress, cityName, and zipOrPostalCode
     */
    public String getAdress(){
        return streetAddress+" "+cityName+" "+zipOrPostalCode;  //gabungan dari alamat jalan, nama kota dan kodepos
    }
    /**
     * this method used to get the value of the customer's account
     * @return String This returns account that has assigned to a customer
     */
    public Account getAccount(){
        return accounts;
    }
    public int getCustomerId(){
        return custId;
    }
    public String getEmail(){
        return email;
    }
    public String getCustomerName(){
        return lastName+","+firstName;      //nama dari customer namun dibalik dan dipisahkan koma
    }
    public int getNumOfAccounts(){
        return numberOfCurrentAccounts;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    /**
     * this method used to get the value of the customer's name
     * @return String This returns combination of the firstname and lastname of a customer
     */
    public String getName(){
        return firstName+" "+lastName;  //nama dari customer
    }
    /**
     * this method used to set the value of the customer's address
     * @param street this is the first parameter should be filled with street address of a customer
     * @param city this is the second parameter should be filled with cityname where the customer stay
     * @param code this is the third parameter should be filled with postalcode address of a customer
     */
    public void setAdress(String street, String city, String code){
        streetAddress = street;
        cityName = city;
        zipOrPostalCode = code;
    }
    public String setEmail(String emailAddress){
        String email_pattern = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$"; //pattern format email
        Pattern pattern = Pattern.compile(email_pattern);
        Matcher matcher = pattern.matcher(emailAddress);
        
        if(matcher.matches()){
            email=emailAddress;
            return "Email disimpan";
        }
        else return "Email Salah";
    }
    /**
     * this method used to set the value of the customer's name
     * @param lname this is the first parameter should be filled with firstname of a customer
     * @param fname this is the second parameter should be filled with lastname of a customer
     */
    public void setName(String lname, String fname){
        lastName = lname;
        firstName = fname;
    }
    public void setPhoneNumber(String phoneNum){
        phoneNumber = phoneNum;
    }
    /**
     * this method used to set an account to a customer
     */ 
    public void setAccount(Account accounts_masuk){
        accounts = accounts_masuk;
    }
    public void setCustId(int id){
        custId = id;
    }
}


    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */


