
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Berikut ini merupakan kelas WindowHandler dengan ekstensi WindowAdapter, yang digunakan 
 * untuk mengatur window pada kelas ATMGUI
 * 
 * @author Akhdan Hilmy T(1306368500)
 * @version 23 April 2016
 */
public class WindowHandler extends WindowAdapter
{
   public void windowClosing(WindowEvent w){
       quitMessage();
       System.exit(0);
   }
   
   private void quitMessage(){
       JOptionPane.showMessageDialog(null,"Thank you for your transaction and see you later ! :)");
   }
}
