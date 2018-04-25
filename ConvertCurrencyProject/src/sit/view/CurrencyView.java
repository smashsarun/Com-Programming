
package sit.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import sit.controller.ConvertListener;

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
        //--Currency Panel--
        JPanel currencyPanel = new JPanel();
        
        GridLayout grid = new GridLayout(2,2); //(row,col)
        currencyPanel.setLayout(grid);
        //add components to Panel
        //1st row
        currencyPanel.add(usLable);
        currencyPanel.add(usTxtField);
        //2nd row
        currencyPanel.add(bahtLabel);
        currencyPanel.add(bahtTxtField);
        
        //--convert Panel--
        JPanel convertPanel = new JPanel
        (new FlowLayout(FlowLayout.CENTER));
        
//        FlowLayout flow = new FlowLayout();
//        flow.setAlignment(FlowLayout.CENTER);
//        convertPanel.setLayout(flow); ไม่ต้องใส่เพราะ default เป็น flow อยู่แล้ว
        
        ConvertListener cvtListener = new ConvertListener(usTxtField,bahtTxtField);
        convertBtn.addActionListener(cvtListener);
        convertPanel.add(convertBtn);
        
        currFrame.add(currencyPanel, BorderLayout.NORTH);
        currFrame.add(convertPanel, BorderLayout.CENTER);
                
        //set frame properties (default size is (0,0), visible is false)
        currFrame.setSize(200,200); //width, height
        currFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        currFrame.setVisible(true);
    }
    
}
