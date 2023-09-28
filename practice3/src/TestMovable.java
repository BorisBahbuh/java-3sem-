import java.lang.*;
public class TestMovable {
    public static void main(String[] args) {
        Shape circle1 = new Circle(2, "Black", true);
        Shape rectangle1 = new Rectangle(6.0, 5.0, "orange", false);
        Shape square1 = new Square(4.6, "blue", true);

        Circle circle2 = new Circle(5.0);
        Rectangle rectangle2 = new Rectangle(3.5, 2);
        Square square2 = new Square(7.0);

        Circle circle3 = new Circle();
        Rectangle rectangle3 = new Rectangle();
        Square square3 = new Square();

        System.out.println(circle1);
        System.out.println((rectangle1));
        System.out.println(square1);

        circle2.setColor("beige");
        circle2.setFilled(true);
        rectangle2.setColor("off-white");
        rectangle2.setFilled(false);
        square2.setColor("green");
        square2.setFilled(false);

        System.out.println(circle2);
        System.out.println(rectangle2);
        System.out.println(square2);

        circle3.setColor("white");
        circle3.setFilled(true);
        rectangle3.setColor("brown");
        rectangle3.setFilled(true);
        square3.setColor("gold");
        square3.setFilled(false);

        System.out.println(circle3);
        System.out.println(rectangle3);
        System.out.println(square3);

        MovablePoint point1 = new MovablePoint(0, 0, 2, 2);
        MovableCircle circle4 = new MovableCircle(0, 0, 1, 1, 4);
        MovableRectangle rectangle4 = new MovableRectangle(1, 1, 3, 3, 3, 3);

        System.out.println(point1);
        System.out.println(circle4);
        System.out.println(rectangle4);

        point1.moveRight();
        point1.moveUp();
        circle4.moveDown();
        circle4.moveDown();
        rectangle4.moveLeft();
        rectangle4.moveDown();
        rectangle4.moveLeft();

        System.out.println(point1);
        System.out.println(circle4);
        System.out.println(rectangle4);
    }
}