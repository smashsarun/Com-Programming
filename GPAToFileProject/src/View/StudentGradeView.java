package View;

import Controller.CalculateListener;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.StudentGrade;

public class StudentGradeView {

    private JFrame frameStudent;
    private JLabel lblSubjects[];
    private JLabel lblGPA;
    private JTextField txtGrades[];
    private JTextField txtCredits[];
    private JTextField txtGPA;
    private JButton btnCalculate;
    private JButton btnSave;
    private JButton btnSaveAs;
    private JPanel jpnStudentGrade;
    private JPanel jpnButton;

    public StudentGradeView(StudentGrade[] gradeProfile) {
        int numOfSubjects = gradeProfile.length;

        lblSubjects = new JLabel[numOfSubjects];
        txtGrades = new JTextField[numOfSubjects];
        txtCredits = new JTextField[numOfSubjects];

        loadSubjects(gradeProfile);
        
        lblGPA = new JLabel("GPA");
        txtGPA = new JTextField("0.00");
        btnCalculate = new JButton("Calculate");
        
        //add listener to btnCalculate
        CalculateListener cal = new CalculateListener(txtGrades,txtCredits,txtGPA);
        btnCalculate.addActionListener(cal);
        jpnStudentGrade.add(lblGPA);
        jpnStudentGrade.add(txtGPA);
        jpnStudentGrade.add(btnCalculate);
        
        loadButton();
        
        frameStudent = new JFrame("GPACalculater");
        frameStudent.add(jpnStudentGrade, BorderLayout.NORTH);
        frameStudent.add(jpnButton, BorderLayout.CENTER);
        frameStudent.setSize(600,400);
        frameStudent.setVisible(true);
        frameStudent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void loadButton(){
        jpnButton = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        
                
        btnSave = new JButton("Save");
        CalculateListener cal = new CalculateListener(txtGrades,txtCredits,txtGPA);
        btnSave.addActionListener(cal);
        
        btnSaveAs = new JButton("Save As Object");
        btnSaveAs.addActionListener(cal);
        
        jpnButton.add(btnSave);
        jpnButton.add(btnSaveAs);
        
    }

    public void loadSubjects(StudentGrade[] gradeRecord) {
        //create panel and set layout
        jpnStudentGrade = new JPanel();
        GridLayout grid = new GridLayout(0, 3);
        jpnStudentGrade.setLayout(grid);
        //add column header to Panel
        jpnStudentGrade.add(new JLabel("Subject"));
        jpnStudentGrade.add(new JLabel("Grade"));
        jpnStudentGrade.add(new JLabel("Credit"));
        //create subject, grade, credit and add to Panel
        for (int i = 0; i < lblSubjects.length; i++) {
            lblSubjects[i] = new JLabel(gradeRecord[i].getSubject());
            txtGrades[i] = new JTextField(gradeRecord[i].getGrade());
            txtCredits[i] = new JTextField(gradeRecord[i].getCredit() + "");
            jpnStudentGrade.add(lblSubjects[i]);
            jpnStudentGrade.add(txtGrades[i]);
            jpnStudentGrade.add(txtCredits[i]);
        }
    }
}
