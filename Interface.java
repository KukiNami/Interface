interface shape{
    double getArea();
}
class Rectangle implements Shape
{
    double length;
    double width;
    public Rectangle (double l,double w){
        length=l;
        width=w;
    }
    public double getArea() {
        return ("Area = "+length*width);
    }
    public String toString() {
        return "Length:"+length+""+"Width:"+width+""+"Area:"+getArea();
    }
}
class Triangle implements Shape
{
    double base;
    double height;
    public Triangle(double b,double h){
        base=b;
        height=h;
    }
    public double getArea() {
        return("Area = "+(base*height)/2);
    }
    public String toString() {
                return "Base:"+base+""+"Height:"+height+""+"Area:"+getArea();
    }
}

public class test {
    public static void main (String args[]){
        
    }
}
