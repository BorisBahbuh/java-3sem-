import java.lang.*;
public class Circle extends Shape{
    protected double radius;

    public Circle(){}

    public Circle(double r){
        radius = r;
    }
    public Circle(double r, String c, boolean f){
        radius = r;
        color = c;
        filled = f;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "area =" + getArea() + ";" + "per = " + getPerimeter();
    }

    @Override
    public double getSide() {
        return 0;
    }
}
