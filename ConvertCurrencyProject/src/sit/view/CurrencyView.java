
package sit.view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CurrencyView {
    private JFrame currFrame; //Top Container
    private JLabel usLable;
    private JLabel bahtLabel;
    private JTextField usTxtField;
    private JTextField bahtTxtField;
    private JButton convertBtn;
    
    public CurrencyView(){
        initGui();
    }
    
    public void initGui(){
        currFrame = new JFrame("US to Baht Currency Convert");
        usLable = new JLabel("US Dollar ($)");
        bahtLabel = new JLabel("Baht");
        usTxtField = new JTextField(10); //Number of column
        bahtTxtField = new JTextField("31.50");
        convertBtn = new JButton("convert");
    }
    
    public void loadCurrencyForm(){
        GridLayout grid = new GridLayout(3,2); //(row,col)
        currFrame.setLayout(grid);
        //add components to Frame
        //1st row
        currFrame.add(usLable);
        currFrame.add(usTxtField);
        //2nd row
        currFrame.add(bahtLabel);
        currFrame.add(bahtTxtField);
        //3rd row
        currFrame.add(convertBtn);
        
        //set frame properties (default size is (0,0), visible is false)
        currFrame.setSize(200,200); //width, height
        currFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        currFrame.setVisible(true);
    }
}
