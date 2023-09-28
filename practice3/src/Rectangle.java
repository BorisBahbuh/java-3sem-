import java.lang.*;
public class Rectangle extends Shape{
    protected double width;
    protected double length;
    public Rectangle(){}
    public Rectangle(double l, double w){
        length = l;
        width = w;
    }
    public Rectangle(double l, double w, String c, boolean f){
        length = l;
        width = w;
        color = c;
        filled = f;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return width * length;
    }

    public double getPerimeter() {
        return (width+length)*2;
    }

    public String toString() {
        return "ar = " + getArea() + ";" + "per =" + getPerimeter();
    }

    public double getSide() {
        return width;
    }
}
