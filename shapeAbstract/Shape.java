
package shapeAbstract;

public abstract class Shape {
//เพราะมี method abstract เลยต้องมาแก้ที่ class ด้วย
    private String shapeId;

    public Shape() {
    }
    
    
    public Shape(String shapeId) {
        this.shapeId = shapeId;
    }

    public String getShapeId() {
        return shapeId;
    }

    public void setShapeId(String shapeId) {
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
