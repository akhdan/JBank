
/**
 * Berikut ini kelas AmountOverDrawn yang merupakan ekstensi dari kelas exception dimana kelas 
 * ini berfungsi untuk memberikan pengecualian apabila customer mengambil uang melebihi batas uang 
 * yang dimiliki.
 * 
 * 
 * @author Akhdan Hilmy T(1306368500)
 * @version 23 April 2016
 */
public class AmountOverDrawnException extends Exception
{
    public Account acctType;

    public AmountOverDrawnException(Account acct)
    {
        super("Insufficeient Funds");
        acctType = acct;
    }

    public String getMessage()
    {
        if (acctType instanceof Savings && !(acctType instanceof Investment) ){
            return super.getMessage() + "in Savings Account";
        } else if (acctType instanceof Investment){
            return super.getMessage() + "in Investments Account";
        } else if (acctType instanceof OverDraftProtection){
            return super.getMessage() + "in OverDraft Protection Account";
        } else if (acctType instanceof LineOfCredit){
            return super.getMessage() + "in LineOfCredit Account";
        } else {
            return "Account Type Not Found !";
        }
    }
}