package student;

public class Student {

    private long stdId;
    private String stdName;

    public Student(){
        System.out.println("Student Constructor working");
    }
    
    public Student(long stdId, String stdName) {
        this.stdId = stdId;
        this.stdName = stdName;
    }

    @Override
    public boolean equals(Object obj) { //กำหนดว่าแบบไหนถึง equals
        // instanceof ดูว่า obj มีโครงสร้างเหมือน Student จริงหรือไม่
        Student temp;
        if (obj != null && obj instanceof Student) {
            temp = (Student) obj;
            if (stdId == temp.stdId) {
                return true;
            }

        }
        return false;
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

    @Override
    public String toString() {
        return "Student{" + "stdId=" + stdId + ", stdName=" + stdName + '}';
    }

}
