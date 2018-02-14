
package student;

public class TestStudent {
    public static void main(String[] args) {
        UnderGraduatedStudent ugs1 = new UnderGraduatedStudent("Money calculate", 60130666482L, "Alex"); 
        System.out.println(ugs1.toString());
        
        GraduatedStudent gs1 = new GraduatedStudent("SIT Space",57712364L,"Bee");
        System.out.println(gs1.toString());
        
        Student std1 = new Student(1,"A");
        Student std2 = new Student(1,"B");
        System.out.println(std1.equals(std2));
                      //if(stdId==temp.stdId)
                      
       UnderGraduatedStudent ugs2 = new UnderGraduatedStudent("MobileApp",5514231142L,"Toy");
        System.out.println(ugs2.toString());       
    }
    
}
