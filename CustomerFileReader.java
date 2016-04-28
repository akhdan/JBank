import java.io.*;
import java.util.*;

/**
 * Kelas CustomerFileReader ini berguna untuk membaca file .dat menjadi daftar 
 * ArrayList.
 * 
 * @author Akhdan Hilmy T(1306368500)
 * @version 23 April 2016
 */
public class CustomerFileReader implements Serializable {
    private File fileObject;
    private FileInputStream fileInputStream;
    private ObjectInputStream objectInputStream;

    /**
     * Konstruktor untuk objek dari kelas CustomerFileReader
     */
   public CustomerFileReader(){
    }

    public ArrayList<Customer> readCustomer()  throws IOException, ClassNotFoundException
   {
   ArrayList<Customer> custs = null;
        try {
            fileObject = new File("jbank1.dat");
            fileInputStream = new FileInputStream(fileObject);
            objectInputStream = new ObjectInputStream(fileInputStream);
            custs = (ArrayList<Customer>) objectInputStream.readObject();
            objectInputStream.close();}
        catch (Exception e) {
            System.out.println("Exception Happened :" + e.getMessage());
        }
        return custs;
        }
    }


