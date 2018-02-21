
package shapeAbstract;

public class Square extends Shape {
    private double side;

    public Square(double side, String shapeId) {
        super(shapeId);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    
    @Override
    public double getArea(){
        double area = side*side;
        return area;
    }
    
    @Override
    public double getPerimeter(){
        return side*4;
    }

    @Override
    public String toString() {
        return "Square{" + "side=" + side + '}' + super.toString();
    }

        
}
