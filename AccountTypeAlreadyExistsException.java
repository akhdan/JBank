
/**
 * Berikut ini merupakan kelas AccountTypeAlreadyExists yang merupakan ekstensi dari kelas exception 
 * yang berfungsi untuk memberikan pengecualian jika customer akan membuat duplikasi akun dengan 
 * tipe yang sama.
 * 
 * @author Akhdan Hilmy T(1306368500)
 * @version 23 April 2016
 */
public class AccountTypeAlreadyExistsException extends Exception
{
    public char acctType;
    private Account accountType;
    
    public AccountTypeAlreadyExistsException(char acctType)
    {
        super("Unable to create the duplicate for type of the account");
        this.acctType = acctType;
    }

    public String getMessage()
    {
       if (accountType instanceof Savings && !(accountType instanceof Investment) ){
            return super.getMessage() + "Savings";
        } else if (accountType instanceof Investment){
            return super.getMessage() + "Investments";
        } else if (accountType instanceof OverDraftProtection){
            return super.getMessage() + "OverDraft Protection";
        } else if (accountType instanceof LineOfCredit){
            return super.getMessage() + "Line of Credit";
        } else {
            return "Account Type Not Found !";
        }        
    }
}
