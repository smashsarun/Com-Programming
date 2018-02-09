
public class RegisteredCourse {
    private int regisCourseID;
    private double regisCourseGrade;
    private double regisCourseCredit;
    private String regisCourseName;
    
    public RegisteredCourse (int id, double grade, double credit, String courseName){
        regisCourseID = id;
        regisCourseGrade = grade;
        regisCourseCredit = credit;
        regisCourseName = courseName;
    }

    public int getRegisCourseID() {
        return regisCourseID;
    }

    public void setRegisCourseID(int regisCourseID) {
        this.regisCourseID = regisCourseID;
    }

    public double getRegisCourseGrade() {
        return regisCourseGrade;
    }

    public void setRegisCourseGrade(double regisCourseGrade) {
        this.regisCourseGrade = regisCourseGrade;
    }

    public double getRegisCourseCredit() {
        return regisCourseCredit;
    }

    public void setRegisCourseCredit(double regisCourseCredit) {
        this.regisCourseCredit = regisCourseCredit;
    }

    public String getRegisCourseName() {
        return regisCourseName;
    }

    public void setRegisCourseName(String regisCourseName) {
        this.regisCourseName = regisCourseName;
    }

    @Override
    public String toString() {
        return "RegisteredCourse{" + "regisCourseID=" + regisCourseID + ", regisCourseGrade=" + regisCourseGrade + ", regisCourseCredit=" + regisCourseCredit + ", regisCourseName=" + regisCourseName + '}';
    }
    
    
}
