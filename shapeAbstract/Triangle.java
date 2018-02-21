
package shapeAbstract;

public abstract class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle() {
    }
    
    public Triangle(double base, double height, String shapeId) {
        super(shapeId);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    @Override
    public double getArea(){
        return  (1.0/2.0) * height * base;
    }

    @Override
    public String toString() {
        return "Triangle{" + "base=" + base + ", height=" + height + '}' 
                + super.toString();
    }
        
}
