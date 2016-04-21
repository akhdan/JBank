import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class ATMGUI here.
 * 
  * @author (Akhdan Hilmy Taufiqurrahman) 
 * @version (14 april 2016)
 */
public class ATMGUI extends JPanel
{
    // instance variables - replace the example below with your own
    public JLabel customerLabel;
    public JLabel amountLabel;
    public JRadioButton SavingacctType;
    public JRadioButton InvestmentacctType;
    public JRadioButton LineOfCreditacctType;
    public JRadioButton OverdraftacctType;
    public JTextField customerText;
    public JTextField amountText;
    public JTextArea textAreaMain;
    public JButton deposit;
    public JButton withdraw;
    public JButton exit;
    public ButtonGroup radioGroup;

    /**
     * Constructor for objects of class ATMGUI
     */
    
    public ATMGUI ()
    {
        
        buildGUI();
    }
    
    public void buildGUI()
    {
        // initialise instance variables
        JFrame mainframe    = new JFrame ("ATMGUI");
        mainframe.setSize(500,300);
        mainframe.setLayout (new BoxLayout (mainframe, BoxLayout.Y_AXIS));        
        
        JPanel buttonPanel= new JPanel();
        buttonPanel.setLayout (new BoxLayout (buttonPanel, BoxLayout.Y_AXIS));
        JPanel checkboxPanel= new JPanel();
        checkboxPanel.setLayout(new FlowLayout());
        JPanel infoPanel= new JPanel();
        infoPanel.setLayout(new FlowLayout ());
        JPanel textPanel= new JPanel ();
        textPanel.setLayout(new FlowLayout());
        
        customerLabel   = new JLabel ("Enter Customer ID :");
        amountLabel     = new JLabel ("Enter amount here :");
        
        SavingacctType      = new JRadioButton ("Savings");
        InvestmentacctType  = new JRadioButton ("Investment");
        LineOfCreditacctType= new JRadioButton ("Line Of Credit");
        OverdraftacctType   = new JRadioButton ("Overdraft");
        
        deposit     =new JButton("Deposit");
        withdraw    =new JButton("Withdraw");
        exit        =new JButton("Exit");
        
        customerText    = new JTextField(20);
        amountText      = new JTextField(20);
        textAreaMain    = new JTextArea(20,40);
        
        buttonPanel.add(deposit);
        buttonPanel.add(withdraw);
        buttonPanel.add(exit);
        
        checkboxPanel.add(SavingacctType);
        checkboxPanel.add(InvestmentacctType);
        checkboxPanel.add(LineOfCreditacctType);
        checkboxPanel.add(OverdraftacctType);
        
       infoPanel.add(customerLabel);
       infoPanel.add(customerText);
       infoPanel.add(checkboxPanel);
       infoPanel.add(amountLabel);
       infoPanel.add(amountText);
       
       textPanel.add(textAreaMain);
       textPanel.add(buttonPanel);
       
       this.add(infoPanel);
       this.add(textPanel);
       
        
        /*buttonGroup     =new ButtonGroup();
        buttonGroup.add(deposit);
        buttonGroup.add(withdraw);
        buttonGroup.add(exit);
        
        radioGroup = new ButtonGroup ();
        radioGroup.add(SavingacctType);
        radioGroup.add(InvestmentacctType);
        radioGroup.add(LineOfCreditacctType);
        radioGroup.add(OverdraftacctType);*/
        //setLayout (new FlowLayout);
        
       // add(customerLabel);
       // add(customerText);
       // add(radioGroup);
       // add(amountLabel);*/
    }
    
}
