
package shapeAbstract;

public class Square extends Shape {
    private double side;

    public Square(double side, int shapeId) {
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
    public String toString() {
        return "Square{" + "side=" + side + '}' + super.toString();
    }

        
}
