
package medicine;

public class TestMedicine {
    public static void main(String[] args) {
        //static binding
          Medicine m1 = new Medicine();
          Medicine m2 = new Paracetamol();
          System.out.println(m1.properties);
          System.out.println(m2.properties);
        
          //สองอันนี้บน-ล่างตรงกันข้ามกัน
          
        //dynamic binding
//        Medicine m = new Medicine();
//        System.out.println(m.getProperties());
//        m = new Paracetamol();
//        System.out.println(m.getProperties());
        
        
        
//        MediAble med;
//        //เรียกใช้ปกติ
//        Medicine m1 = new Medicine(1,"ABC", new String[]{"A","B","C"}, 
//                "Exam Preventing", "Do not take over 2 times per day");      
//        System.out.println(m1.medicProperties());
//        
//        Paracetamol p1 = new Paracetamol(100, 44123,"Tylinol",new String[]{"Paracetamol 100%"},
//        "Relieve headache","Do not take over 10 tables per day");
//    
//        //Polymorphism
//        med = new Paracetamol(100, 44124, "Zara", new String[]{"Paracetamol","White color"},
//        "Relieve headache","Drink water after take it");
//        System.out.println(med.toString()+"\n");
//        
//        med = m1;
//        System.out.println(med.medicProperties());
//        
//        med = p1;
//        System.out.println(med.medicProperties());
    }
}
