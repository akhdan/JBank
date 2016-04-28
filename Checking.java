import java.lang.Math;
/**
 * Kelas abstrak Checking ini merupakan ekstensi dari kelas Account yang berfungsi untuk 
 * memeriksa saldo customer apabila seorang customer akan melakukan pengambilan uang 
 * yang disimpan pada akun Savings.
 * @author Akhdan Hilmy T(1306368500)
 * @version 23 April 2016
 */

public abstract class Checking extends Account {
    protected double monthlyFee;
    
    /**
     * Metode abstrak feeAssessment yang digunakan untuk mengecek biaya Checking Account
     */
    protected abstract void feeAssessment();
    
    /**
     * Metode abstrak reseMonthlyFee yang digunakan untuk mengatur ulang biaya bulanan
     */
    public void resetMonthlyFee() {
        monthlyFee = 0;
    }
    
    /**
     * Metode yang digunakan untuk mendapatkan biaya Checking bulanan
     * @return monthlyfee sebagai biaya bulanan
     */
    public double getMonthlyFee() {
        return monthlyFee;
    }
}
