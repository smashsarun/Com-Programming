
package sit.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

public class ConvertListener implements ActionListener{
    private JTextField usTxtField;
    private JTextField bahtTxtField;
    
    public ConvertListener (JTextField us, JTextField baht){
        this.usTxtField = us;
        this.bahtTxtField = baht;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        double usCurr = Double.parseDouble(usTxtField.getText());
        double bahtCurr = usCurr * 31.5;
        bahtTxtField.setText(bahtCurr+"");
    }
    
}
