
public class testStudent {
    public static void main(String[] args) {
        RegisteredCourse Math = new RegisteredCourse (442123, 3.0, 3.0, "Math");
        RegisteredCourse LNG103 = new RegisteredCourse (442124, 4.0, 3.0, "English");
        RegisteredCourse LNG101 = new RegisteredCourse (442125, 3.5, 2.0, "IT Fundamental");
        RegisteredCourse[] IT = {Math,LNG103,LNG101};
        Address addr1 = new Address (6930, "TaoPoon", "Chon Buri");
        Student std1 = new Student (60130500088L, "Alex", IT, addr1);
        
        System.out.println(std1.GPAX());
        System.out.println(std1.toString());
    }
}
