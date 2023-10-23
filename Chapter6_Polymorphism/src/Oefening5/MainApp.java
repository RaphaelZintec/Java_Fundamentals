package Oefening5;

public class MainApp {
    public static void main(String[] args) {
        Shape shape = new Shape(5, 10);
        Circle circle = new Circle(0, 10);
        Triangle triangle = new Triangle(22, 10, 22);
        Rectangle rectangle = new Rectangle(10, 5);

        Shape shape2 = new Circle(0,10);
        //Circle circle2 = new Shape(0,10);
        System.out.println(shape2.toString());

/*
        System.out.println(shape.toString());
        System.out.println(circle.toString());
        System.out.println(triangle.toString());
        System.out.println(rectangle.toString());

        System.out.println(circle instanceof Object);
        System.out.println(circle instanceof Shape);
        System.out.println(circle instanceof Circle);
        System.out.println(shape instanceof Object);
        System.out.println(shape instanceof Shape);
        System.out.println(shape instanceof Circle);

 */

    }
}
