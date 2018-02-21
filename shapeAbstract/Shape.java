
package shapeAbstract;

public abstract class Shape {
//เพราะมี method abstract เลยต้องมาแก้ที่ class ด้วย
    private int shapeId;

    public Shape() {
    }
    
    
    public Shape(int shapeId) {
        this.shapeId = shapeId;
    }

    public int getShapeId() {
        return shapeId;
    }

    public void setShapeId(int shapeId) {
        this.shapeId = shapeId;
    }

    public abstract double getArea();
    //ทำ abstract method โดยต้องไปแก้ที่ class ด้วย
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" + "shapeId=" + shapeId + '}';
    }
    
}
