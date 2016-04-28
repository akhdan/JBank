
/**
 * Berikut ini kelas AccountTypeNotFound yang merupakan ekstensi dari kelas Exception 
 * yang berguna untuk memeriksa ketersediaan tipe akun. Apabila tipe akun tidak ditemukan 
 * maka suatu pesan exception akan ditampilkan. 
 * 
 * @author Akhdan Hilmy T(1306368500) 
 * @version 23 April 2016
 */
public class AccountTypeNotFoundException extends Exception
{
    public char acctType;
    public String message;
    private Account accountType;

    public AccountTypeNotFoundException(char acct)
    {
        super("Account type does not exist");
        acctType = acct;
    }

    public String getMessage()
    {
        switch (acctType)
        {
            case 'S':
            {
                message = "Savings";
                return message+super.getMessage();
            }
            case 'I':
            {
                message = " Investment ";
                return message+super.getMessage();
            }
            case 'L':
            {
                message = " LineOfCredit ";
                return message+super.getMessage();
            }
            case 'O':
            {
                message = " OverDraftProtection ";
                return message+super.getMessage();
            }
            default :
            {
                message = "Wrong Type Of Account !";
                return message;
            }
        }
    }
}
