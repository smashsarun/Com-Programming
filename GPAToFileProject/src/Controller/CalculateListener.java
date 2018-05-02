package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JTextField;

public class CalculateListener implements ActionListener {

    private JTextField txtGrades[];
    private JTextField txtCredits[];
    private JTextField txtGPA;

    public CalculateListener(JTextField[] grades, JTextField[] credits, JTextField txtGPA) {
        txtGrades = grades;
        txtCredits = credits;
        this.txtGPA = txtGPA;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //System.out.println(e.getActionCommand());
        if (e.getActionCommand().equals("Calculate")) {
            calculateGrade();
        }
        else if(e.getActionCommand().equals("Save")){
            saveToDataFile();
        }
        else if(e.getActionCommand().equals("Save As Object")){
            saveToObjectFile();
        }
    }
    
    public void saveToDataFile(){
        System.out.println("Saving To Data File...");
    }
    
     public void saveToObjectFile(){
         System.out.println("Saving To Object File...");
    }
    
    public void calculateGrade() {
        System.out.println("Calculating...");

        float totalGrade = 0;
        float totalCredit = 0;
        float gpa = 0;

        for (int i = 0; i < txtGrades.length; i++) {
            float grade = convertGrade(txtGrades[i].getText());
            float credit = Float.parseFloat(txtCredits[i].getText());
            totalGrade += grade * credit;
            totalCredit += credit;
        }

        gpa = totalGrade / totalCredit;
        DecimalFormat dcm = new DecimalFormat("0.00");
        txtGPA.setText(dcm.format(gpa));
    }

    public float convertGrade(String gradeString) {
        float grade = 0;
        switch (gradeString) {
            case "A":
                grade = 4f;
                break;
            case "B+":
                grade = 3.5f;
                break;
            case "B":
                grade = 3f;
                break;
            case "C+":
                grade = 2.5f;
                break;
            case "C":
                grade = 2f;
                break;
            case "D+":
                grade = 1.5f;
                break;
            case "D":
                grade = 1f;
                break;
            default:
                grade = 0;
                break;
        }
        return grade;
    }

}
