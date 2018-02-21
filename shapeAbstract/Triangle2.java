
package shapeAbstract;

public class Triangle2 extends Triangle
implements Comparable<Triangle2>{
    
    //public Triangle2(){
    //super();
    //}
    
    
    public double getPerimeter(){
        //wrong formula
        return 3*getBase();        
    }
    
    public int compareTo(Triangle2 o){ //ใส่คลาสที่อยู่
        return getShapeId().compareTo(o.getShapeId());
    }
}
