
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Berikut ini merupakan kelas ButtonHandler yang berfungsi
 * untuk mengatur pengimplementasian ActionLister dari ATM GUI.
 * 
 * @author Akhdan Hilmy T(1306368500)
 * @version 23 April 2016
 */
public class ButtonHandler implements ActionListener
{
   private ATMGUI gui;

   private String newline = "\n\n";

   
   /**
    * Constructor untuk kelas Button Handler
    * @param gui sebagai objek gui yang akan digunakan.
    */
   public ButtonHandler(ATMGUI gui){
       this.gui=gui;
   }
   
   /**
    * Method actionPerformed yang digunakan untuk memberikan aksi terhadap
    * input yang dilakukan oleh customer.
    * 
    * @param event Sebagai event yang sedang dilakukan
    */
   public void actionPerformed(ActionEvent event){
       JTextArea text = gui.text;
       if(event.getActionCommand().equals("Deposit")){
           text.append(newline + "Customer: " + gui.getIDcostumer() +" saves amount of money:" + gui.getNominal());
       }
       else if(event.getActionCommand().equals("Withdraw")){
           text.append(newline + "Customer: " + gui.getIDcostumer() +" withdraws amount of money:" + gui.getNominal());
       }
      else if(event.getActionCommand().equals("Exit")){
           JOptionPane.showMessageDialog(null,"Thank you for your transaction and see you later ! :)");
            System.exit(0);
        }
    }
}

      