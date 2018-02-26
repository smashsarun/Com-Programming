
public abstract class Circle implements ShapeInterface{
     //ใส่ abstract เพราะใส่เมธอทจาก ShapeInterface ไม่ครบ
    private double radius;
    
    public Circle(){
        
    }
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public double getArea(){
        return Math.PI*Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }
    
    
}
