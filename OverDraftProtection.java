
/**
 * Kelas OverDraftProtection ini merupakan ekstensi dari kelas Checking yang berguna untuk
 * memberikan perlindungan overdraft terhadap akun Savings.
 * @author Akhdan Hilmy T(1306368500)
 * @version 23 April 2016
 */
public class OverDraftProtection extends Checking
{
    private Savings savingsAccount;

    /**
     * Constructor dari OverDraftProtect dengan beberapa parameter :
     * @param cust Obyek Customer yang bersangkutan
     * @param amount Jumlah saldo yang ingin dimasukkan
     * @param save Obyek Savings Account sebagai acuan
     */
    public OverDraftProtection(Customer cust, double amount, Savings save) {
        super();
        id = Integer.toString(cust.getCustID());
        balance = amount;
        savingsAccount = save;
    }
    
    /**
     * Method feeAssessment yang digunakan sebagai perhitungan biaya proteksi Overdraft
     */
    public void feeAssessment () {
        monthlyFee += 3;
        balance -= 3;
    }
    
    /**
     * Method withdraw digunakan untuk menarik sejumlah Saldo dari akun Overdraft
     * @param amount sebagai jumlah Saldo
     */
    public boolean withdraw (double amount) {
        if ( ( balance + savingsAccount.getBalance() ) - amount >= 10) {
            if (balance >= amount) {
                balance -= amount;
            } else {
                savingsAccount.withdraw(amount - balance);
                balance = 0;
                feeAssessment();
            }
            return true;
        } else {
            return false;
        }
    }
}
