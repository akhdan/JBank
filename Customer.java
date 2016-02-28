
/**
 * Write a description of class Customer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Customer
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
    /**
     * Constructor for objects of class Customer
     */
    public Customer()
    {
        // initialise instance variables
    }
    public Customer(String fname, String lname, String dob){
        
    }
    public Customer(String firstName, String lastName, String dateOfBirth, int custId){
        
    }
    
    private String getAddress(){
        return streetAddress+cityName+zipOrPostalCode;
    }
    public Account getAccount(){
        return accounts;
    }
    public void setAccount(Account acc){
        accounts = acc;
    }
    private int getCustomerId(){
        return custId;
    }
    private String getEmail(){
        return email;
    }
    public String getCustomerName(){
        return lastName + "," + firstName;
    }
    public int getNumOfAccounts(){
        return numberOfCurrentAccounts;
    }
    private String getPhoneNumber(){
        return phoneNumber;
    }
    private void setAddress(String street, String city, String code){
        
        this.streetAddress = street;
        this.cityName = city;
        this.zipOrPostalCode = code;
        
    }
    private void setEmail(String emailAddress){
        
    }
    public void setCustomerName(String lname, String fname){
        this.firstName = fname;
        this.lastName = lname;
        return;
    }
    public void setPhoneNumber(String phoneNum){
        this.phoneNumber = phoneNum;
        return;
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */

}
