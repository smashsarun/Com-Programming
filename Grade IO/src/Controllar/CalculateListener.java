/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTextField;
import model.StudentGrade;
import view.StudentGradeView;

/**
 *
 * @author INT105
 */
public class CalculateListener implements ActionListener {

    private JTextField txtGrades[];
    private JTextField txtCredits[];
    private JTextField txtGPA;
    private StudentGradeView stdGrdeView;

    private JLabel lblSubjects[];

    public CalculateListener(JLabel[] subjects, JTextField[] grades, JTextField[] credit, JTextField gpa) {
        lblSubjects = subjects;
        txtGrades = grades;
        txtCredits = credit;
        txtGPA = gpa;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Calculate")) {
            calculateGrade();
        } else if (e.getActionCommand().equals("Save")) {
            saveToDateFile();

        } else if (e.getActionCommand().equals("Save as")) {
            saveToObject();
        }

    }

    public void saveToDateFile() {
        System.out.println("Saving To Data File....");
        try {
            FileOutputStream fos = new FileOutputStream("myGrade.dat");
            DataOutputStream dos = new DataOutputStream(fos);

            for (int i = 0; i < lblSubjects.length; i++) {
                String subject = lblSubjects[i].getText();
                String grade = txtGrades[i].getText();
                String temp = txtCredits[i].getText();
                float credit = Float.parseFloat(temp);

                dos.writeUTF(subject);
                dos.writeUTF(grade);
                dos.writeFloat(credit);
            }
            String temp2 = txtGPA.getText();
            float gpa = Float.parseFloat(temp2);
            dos.writeFloat(gpa);
            dos.close();

        } catch (FileNotFoundException fnf) {
            System.out.println(fnf);
        } catch (IOException io) {
            System.out.println(io);
        }

    }

    public void saveToObject() {
        System.out.println("Saving To Object File....");

        try {
            FileOutputStream fos = new FileOutputStream("myGrade-object.dat");
            ObjectOutputStream dos = new ObjectOutputStream(fos);
            for (int i = 0; i < lblSubjects.length; i++) {
                String subject = lblSubjects[i].getText();
                String grade = txtGrades[i].getText();
                String temp = txtCredits[i].getText();
                float credit = Float.parseFloat(temp);
                
                StudentGrade myStdGrade = new StudentGrade(subject, grade, credit);
                dos.writeObject(myStdGrade);
            }
            dos.close();
                
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    

    public void calculateGrade() {
        DecimalFormat fmt = new DecimalFormat("0.00");

        System.out.println("Calculate....");
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

        txtGPA.setText(fmt.format(gpa));
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
        }
        return grade;
    }

}
