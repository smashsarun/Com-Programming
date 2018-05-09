package view;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.StudentGrade;

public class TestStream {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileInputStream fis = null;
        do {
            try {
                System.out.println("Enter your filename: ");
                String fileName = sc.nextLine();
                fis = new FileInputStream(fileName);
                //DataInputStream dis = new DataInputStream(fis);
                ObjectInputStream ois = new ObjectInputStream(fis);

                //Subject (String) Grade(String) credit(Float)
                //GPA (float)
                int count = 0;
                while (true) {
                    Object tmp = ois.readObject();
                    //throw EOF Exception
                    StudentGrade stdGrade = (StudentGrade) tmp;
                    System.out.println(stdGrade.toString());
                }
                
                /*while(count < 6) {
                String subject = dis.readUTF();
                String grade = dis.readUTF();
                float credit = dis.readFloat();
                count++;
                System.out.println(subject + ", "+ grade + ", " + credit);
            }
            float gpa = dis.readFloat();
            System.out.println("GPA: "+gpa);
            dis.close();*/
                                    
            } catch (ClassNotFoundException cnf) {
                System.out.println(cnf);
            } catch (EOFException eof) {
                System.out.println("End Of File");
            } catch (FileNotFoundException fnf) {
                System.out.println(fnf);
            } catch (IOException io) {
                System.out.println(io);
            }
        } while (fis == null);

    }
}
