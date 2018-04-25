package sit.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GPAListener implements ActionListener {

    private JTextField gradeTxtField[];
    private JLabel creditLabel[];
    private JTextField gpaTxtField;

    public GPAListener(JTextField[] gradeTxtField, JLabel creditLabel[], JTextField gpaTxtField) {
        this.gradeTxtField = gradeTxtField;
        this.creditLabel = creditLabel;
        this.gpaTxtField = gpaTxtField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DecimalFormat dcm = new DecimalFormat("#.##");
        System.out.println(e.getActionCommand());
        double eachGrade[] = new double[6];
        for (int i = 0; i < 6; i++) {
            if (gradeTxtField[i].getText().equalsIgnoreCase("A")) {
                eachGrade[i] = 4 * Double.parseDouble(creditLabel[i].getText());
            }
            else if (gradeTxtField[i].getText().equalsIgnoreCase("B+")) {
                eachGrade[i] = 3.5 * Double.parseDouble(creditLabel[i].getText());
            }
            else if (gradeTxtField[i].getText().equalsIgnoreCase("B")) {
                eachGrade[i] = 3 * Double.parseDouble(creditLabel[i].getText());
            }
             else if (gradeTxtField[i].getText().equalsIgnoreCase("C+")) {
                eachGrade[i] = 2.5 * Double.parseDouble(creditLabel[i].getText());
            }
             else if (gradeTxtField[i].getText().equalsIgnoreCase("C")) {
                eachGrade[i] = 2 * Double.parseDouble(creditLabel[i].getText());
            }
             else if (gradeTxtField[i].getText().equalsIgnoreCase("D+")) {
                eachGrade[i] = 1.5 * Double.parseDouble(creditLabel[i].getText());
            }
             else if (gradeTxtField[i].getText().equalsIgnoreCase("D")) {
                eachGrade[i] = 1 * Double.parseDouble(creditLabel[i].getText());
            }
             else if (gradeTxtField[i].getText().equalsIgnoreCase("F")) {
                eachGrade[i] = 0 * Double.parseDouble(creditLabel[i].getText());
            }
        }
        
        double sumGrade = 0;
        double sumCredit = 0;
        for (int i = 0; i < 6; i++) {
            sumGrade += eachGrade[i];
            sumCredit += Double.parseDouble(creditLabel[i].getText());
        }
        
        double total = sumGrade / sumCredit;
        
        gpaTxtField.setText(""+ (dcm.format(total)) );
    }

}
