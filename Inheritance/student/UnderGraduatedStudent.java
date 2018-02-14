
package student;

public class UnderGraduatedStudent extends Student {
    private String project;

    public UnderGraduatedStudent(){
        //super(); ถ้าไม่ใส่จะไปเรียกอัตโนมัติ
        System.out.println("UnderGraduated Constructor working");
    }
    
    public UnderGraduatedStudent(String project, long stdId, String stdName) {
        super(stdId, stdName);
        this.project = project;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "UnderGraduatedStudent{" + "project=" + project + " " + super.toString()+ '}';
    }
    
    
}
