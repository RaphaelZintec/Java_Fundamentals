package Oefening3;

public class MainApp {
    public static void main(String[] args) {
        Geometry geo = new Geometry();
        Geometry triangle = new Triangle();
        Geometry square = new Square();
        Geometry circle = new Circle();
        Geometry oval = new Oval();

        geo.whatShapeIsThat();
        triangle.whatShapeIsThat();
        square.whatShapeIsThat();
        circle.whatShapeIsThat();
        oval.whatShapeIsThat();
    }
}
