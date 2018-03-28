package sit.view;

import java.sql.SQLException;
import sit.Controller.CourseController;
import sit.model.Course;

public class TestCourseDB {

    public static void main(String[] args) {
        try {
            CourseController courseCtrl = new CourseController("sit", "sit");

//            courseCtrl.dropCourseTable();
//            courseCtrl.createCourseTable();
            Course c1 = new Course("INT105","Computer Programming II");
            courseCtrl.insertCourse(c1);
            
            courseCtrl.closeCourseConnection();

        } catch (SQLException sqlEx) {
            System.out.println(sqlEx);
        } catch (ClassNotFoundException cnfEx) {
            System.out.println(cnfEx);
        }
        System.out.println("Mission Complete");
    }
}
