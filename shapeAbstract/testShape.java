
package shapeAbstract;

public class testShape {
    public static void main(String[] args) {
        //Shape sh1 = new Shape(1);
        //System.out.println(sh1);
        //System.out.println("Shape Area="+sh1.getArea());
        
        Triangle2 t1 = new Triangle2();
        System.out.println(t1);
        System.out.println("Shape Area="+t1.getArea());
        
        Square sq1 = new Square(5,103);
        System.out.println(sq1);
        System.out.println("Shape Area="+sq1.getArea());
    }
}
