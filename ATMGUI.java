import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;

/**
 * Berikut ini merupakan komponen - komponen maupun elemen - elemen dari kelas ATMGUI yang akan
 * menjadi antarmuka bagi pengguna.
 * 
 * @author Akhdan Hilmy T(1306368500) 
 * @version 23 April 2016
 */

public class ATMGUI extends JPanel
{
   private JFrame hugeFrame;
   private JTextField custIdText, amountText;
   public JTextArea text;
   private JLabel custIdLabel, amountLabel;
   private JButton btnDeposit, btnWithdraw, btnExit, btnTotal;
   private JRadioButton savingsRB, investmentRB, locRB, overdraftRB;
   private ButtonGroup bgType;

    /**
     * Constructor bagi objek pada kelas ATMGUI
     */
     public ATMGUI()
   {
       BuildGUI();
   }
   
   public static void main(String[] args)
   {
       ATMGUI atm = new ATMGUI();
       atm.showATM();
    }
    
   private void BuildGUI(){
       hugeFrame = new JFrame("ATM");
       hugeFrame.setSize(600,400);
       
        hugeFrame.addWindowListener(new WindowHandler() 
        {
         public void windowClosing(WindowHandler WindowEvent){
            System.exit(0);
         }        
      });
      hugeFrame.setVisible(true);
    }
 
    
     public void showATM(){
       JPanel thePanel = new JPanel();
       thePanel.setLayout(new BoxLayout(thePanel, BoxLayout.Y_AXIS));
       
       custIdLabel = new JLabel("Enter customer id :");
       custIdText = new JTextField(7);
       amountLabel = new JLabel("Enter amount :");
       amountText = new JTextField(7);
       savingsRB = new JRadioButton("Savings");
       investmentRB = new JRadioButton("Investment");
       locRB = new JRadioButton("Line Of Credit");
       overdraftRB = new JRadioButton("Overdraft");
       
       JPanel panelType = new JPanel();
       panelType.setLayout(new BoxLayout(panelType, BoxLayout.Y_AXIS));
       panelType.setBorder(BorderFactory.createTitledBorder("Account type"));
       //BoxLayout layoutType = new BoxLayout(panelType, BoxLayout.Y_AXIS);
       
       ButtonGroup bgType = new ButtonGroup();
       bgType.add(savingsRB);
       bgType.add(investmentRB);
       bgType.add(locRB);
       bgType.add(overdraftRB);
       savingsRB.setSelected(true);
       
       panelType.add(savingsRB);
       panelType.add(investmentRB);
       panelType.add(locRB);
       panelType.add(overdraftRB);
       
       JPanel infoPanel = new JPanel();
       infoPanel.setPreferredSize(new Dimension(600, 150));
       infoPanel.setBorder(BorderFactory.createTitledBorder("Account's Information :"));
       
       infoPanel.add(custIdLabel);
       infoPanel.add(custIdText);
       infoPanel.add(panelType);
       infoPanel.add(amountLabel);
       infoPanel.add(amountText);
       
       thePanel.add(infoPanel);
       
       JPanel panelSide = new JPanel();
       panelSide.setLayout(new GridLayout(4,1));
       
       btnDeposit = new JButton("Deposit");
       btnDeposit.addActionListener(new ButtonHandler(this));
       btnWithdraw = new JButton("Withdraw");
       btnWithdraw.addActionListener(new ButtonHandler(this));
       btnExit = new JButton("Exit");
       btnExit.setActionCommand("Exit");
       btnExit.addActionListener(new ButtonHandler(this));
       btnTotal = new JButton ("Total");
       
       
       panelSide.add(btnDeposit);
       panelSide.add(btnWithdraw);
       panelSide.add(btnTotal);
       panelSide.add(btnExit);
       
       JPanel textPanel = new JPanel();
       textPanel.setPreferredSize(new Dimension(600,350));
       textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.X_AXIS));
       
       text = new JTextArea();
       text.setFont(new Font("Arial", Font.BOLD, 12));
       text.setBackground(Color.black);
       text.setEditable(false);
       text.setForeground(Color.white);
       text.setText("Hello User, Welcome To JBank");
       
       JScrollPane scrollText = new JScrollPane (text, 
       JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
       JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
       
       textPanel.add(scrollText);
       textPanel.add(panelSide);
       
       thePanel.add(textPanel);
       
       hugeFrame.add(thePanel);
       hugeFrame.setVisible(true);
   }
   
     /**
     * Method getTextArea digunakan untuk mengembalikan isi teks pada GUI
     * 
     * @return ID sebagai ID dari customer
     */
    public String getTextArea(){

       String textDisplay = text.getText();
       return textDisplay;
    }
    
    /**
     * Method getIDcust digunakan untuk mengembalikan ID Customer pada GUI
     * 
     * @return ID kustomer
     */
    public String getIDcostumer(){
       String id = custIdText.getText();
       return id;
    }
    
     /**
     * Method getNominal digunakan untuk mendapatkan nominal uang yang ditulis customer dalam GUI
     * 
     * @return Nominal sebagai jumlah uang yang ditulis
     */
    public String getNominal(){
       String amount = amountText.getText();
       return amount;
    }
    
}