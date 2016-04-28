import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;

/**
 * Kelas CustomerFileWriter ini berfungsi untuk menerima suatu ArrayList menjadi 
 * bentuk .dat file
 * 
 * @author Akhdan Hilmy T(1306368500)
 * @version 23 April 2016
 */
public class CustomerFileWriter implements Serializable {
    private File fileObject;
    private FileOutputStream fileOutputStream;
    private ObjectOutputStream objectOutputStream;
    
    /**
     * Konstruktor untuk objek pada kelas CustomerFileWriter
     */
    public CustomerFileWriter() {
    }

    /**
     * Metode untuk menyimpan customer 
     * 
     * @param custs sebagai ArrayList yang berisi objek customer
     * @return void
     */
    public void saveCustomers(ArrayList<Customer> custs) throws IOException{
        try {
            fileObject = new File("CustomerData.dat");
            fileObject.createNewFile();
            fileOutputStream = new FileOutputStream(fileObject);
            BufferedOutputStream buffer = new BufferedOutputStream(fileOutputStream);
            objectOutputStream = new ObjectOutputStream(buffer);
            try{
                objectOutputStream.writeObject(custs);
            }
            finally{
                objectOutputStream.close();
            }

            }
        catch (Exception e) {
            System.out.println("Exception Happened :" + e.getMessage());
    }
  }
}

