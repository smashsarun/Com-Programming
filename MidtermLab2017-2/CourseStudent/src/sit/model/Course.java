package sit.model;

public class Course {
    
    private String courseName;
    
    private int numberOfStudents;
    
    private RegisStudent[] students;
    
    private int numOfStudentCanRegis;
    
    public Course(String courseName, int numOfStudentCanRegis) {
        this.students = new RegisStudent[numOfStudentCanRegis];
        this.numOfStudentCanRegis = numOfStudentCanRegis;
        this.courseName = courseName;
    }
    
    public int addStudent(RegisStudent student) {
        int value = 0;
        for (int i = 0; i < students.length; i++) {
            if (numberOfStudents == numOfStudentCanRegis) {
                value = -1;
                break;
            }
            if (student.equals(this.students[i]) == true) {
                value = -2;
                break;
            }
            if (student.equals(this.students[i]) == false && students[i] == null) {
                value = i;
                students[i] = student;
                numberOfStudents++;
                break;
            }
            
        }
        return value;
    }
    
    public boolean dropStudent(RegisStudent student) {
        boolean value = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                break;
            }
            if (students[i].equals(student)) {
                value = true;
            for (int j = i+1; j < students.length; j++) {
                    students[i] = students[j];
                    i++;
                }
                numberOfStudents--;
            }
        }
        return value;
    }    
    
    public RegisStudent[] getStudents() {
        return students;
    }
    
    public int getNumberOfStudents() {
        return numberOfStudents;
    }
    
    public String getCourseName() {
        return courseName;
    }
    
    public String toString() {
        String course = "----" + courseName + "----\n";
        for (RegisStudent rs : students) {
            course += rs + "\n";
        }
        return course;
        
    }
}
