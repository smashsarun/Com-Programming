
package view;

import model.StudentGrade;


public class main {
    public static void main(String[] args) {
        StudentGrade myGrade[]=new StudentGrade[6];
        myGrade[0] = new StudentGrade("INT101", "A", 3);
        myGrade[1] = new StudentGrade("INT102", "A", 3);
        myGrade[2] = new StudentGrade("INT103", "A", 3);
        myGrade[3] = new StudentGrade("GEN101", "A", 3);
        myGrade[4] = new StudentGrade("INT104", "A", 3);
        myGrade[5] = new StudentGrade("INT105", "A", 3);
        StudentGradeView sgv =new StudentGradeView(myGrade);
    }
}