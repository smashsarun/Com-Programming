
import java.text.DecimalFormat;


public class Student {
    private long stdId;
    private String stdName;
    private RegisteredCourse stdCourses[];
    private Address addr;

    public Student(long stdId, String stdName, RegisteredCourse[] stdCourses,Address addr) {
        this.stdId = stdId;
        this.stdName = stdName;
        this.stdCourses = stdCourses;
        this.addr = addr;
    }

    public long getStdId() {
        return stdId;
    }

    public void setStdId(long stdId) {
        this.stdId = stdId;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public RegisteredCourse[] getStdCourses() {
        return stdCourses;
    }

    public void setStdCourses(RegisteredCourse[] stdCourses) {
        this.stdCourses = stdCourses;
    }

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }
    
    
    public double GPAX (){
        //DecimalFormat fm1 = new DecimalFormat("#.##");
        double gpax = 0;
        double credit = 0;
        double grade = 0;
        //รวมเครดิต
        for (int i = 0; i < stdCourses.length; i++) {
            credit+= stdCourses[i].getRegisCourseCredit();
        }
        //รวมเกรด
        for (int i = 0; i < stdCourses.length; i++) {
            grade += stdCourses[i].getRegisCourseGrade()*stdCourses[i].getRegisCourseCredit();
        }
        //คิด GPAX
        gpax = grade / credit;
        
        return gpax;
        
    }

    @Override
    public String toString() {
        String listOfCourses= "";
        for (int i = 0; i < stdCourses.length; i++) {
            listOfCourses +="Course Name: "+stdCourses[i].getRegisCourseName()
                    +" Course Grade: "+stdCourses[i].getRegisCourseGrade()
                    +" Course Credit: "+stdCourses[i].getRegisCourseCredit()+"\n";
        }
        return "Student{" + "stdId=" + stdId + ", stdName=" + stdName
                + "\nstdCourses= " + listOfCourses
                + "\n addr=" + addr + '}';
    }
    

    
    
}
