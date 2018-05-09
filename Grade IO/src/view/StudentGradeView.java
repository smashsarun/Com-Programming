/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Controllar.CalculateListener;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.StudentGrade;

/**
 *
 * @author INT105
 */
public class StudentGradeView {

    private JFrame FstudentFrame;
    private JLabel Lbsubjects[];
    private JLabel LbGPA;
    private JTextField txtgrades[];
    private JTextField txtcredits[];
    private JTextField txtGPA;
    private JButton btnCalculate;
    private JButton btnSave;
    private JButton btnSaveAs;
    private JPanel jpnstudentgrade;
    private JPanel jpnbutton;

    public StudentGradeView(StudentGrade[] gradeProfile) {
        int numOfsubject = gradeProfile.length;
        Lbsubjects = new JLabel[numOfsubject];
        txtgrades = new JTextField[numOfsubject];
        txtcredits = new JTextField[numOfsubject];
        loadSubjects(gradeProfile);

        LbGPA = new JLabel("GPA");
        txtGPA = new JTextField("0.00");
        btnCalculate = new JButton("Calculate");

        CalculateListener cal = new CalculateListener(Lbsubjects, txtgrades, txtcredits, txtGPA);
        btnCalculate.addActionListener(cal);
        jpnstudentgrade.add(LbGPA);
        jpnstudentgrade.add(txtGPA);
        jpnstudentgrade.add(btnCalculate);

        loadButton();
        btnSave.addActionListener(cal);
        btnSaveAs.addActionListener(cal);

        FstudentFrame = new JFrame("GPA Cacullate");
        FstudentFrame.add(jpnstudentgrade, BorderLayout.NORTH);
        FstudentFrame.add(jpnbutton, BorderLayout.CENTER);
        FstudentFrame.setSize(600, 400);
        FstudentFrame.setVisible(true);
        FstudentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void loadSubjects(StudentGrade[] gradeRecord) {
        jpnstudentgrade = new JPanel();
        GridLayout grid = new GridLayout(0, 3);
        jpnstudentgrade.setLayout(grid);
        jpnstudentgrade.add(new JLabel("Subject"));
        jpnstudentgrade.add(new JLabel("Grade"));
        jpnstudentgrade.add(new JLabel("Credit"));
        for (int i = 0; i < Lbsubjects.length; i++) {
            Lbsubjects[i] = new JLabel(gradeRecord[i].getSubject());
            txtgrades[i] = new JTextField(gradeRecord[i].getGrade());
            txtcredits[i] = new JTextField(gradeRecord[i].getCredit() + "");

            jpnstudentgrade.add(Lbsubjects[i]);
            jpnstudentgrade.add(txtgrades[i]);
            jpnstudentgrade.add(txtcredits[i]);

        }
    }

    public void loadButton() {

        jpnbutton = new JPanel(new FlowLayout(FlowLayout.RIGHT));
//        FlowLayout flow =new FlowLayout();
//        flow.setAlignment(FlowLayout.RIGHT);
//        jpnbutton.setLayout(flow);
        btnSave = new JButton("Save");

        btnSaveAs = new JButton("Save as");

        jpnbutton.add(btnSave);
        jpnbutton.add(btnSaveAs);
    }
}
