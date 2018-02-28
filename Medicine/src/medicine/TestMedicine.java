
package medicine;

public class TestMedicine {
    public static void main(String[] args) {
        String ingredient1[] = {"A","B","C"}; 
        MediAble para1 = new Paracetamol(100,4412,"ParaType1",ingredient1); //ทำให้เรียกเมธอทของ MediAble ได้หมด
        System.out.println(para1.toString());        
    }
}
