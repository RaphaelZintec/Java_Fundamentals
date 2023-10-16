package UMLOefening;

import UMLOefening.Circle;

import static UMLOefening.Circle.ANGLES;
//import static UMLOefening.Circle.getCount;
import static java.lang.Math.random;

public class CircleApp {
    public static void main(String[] args) {
        //Objects initialisation
        Circle myCircle1 = new Circle();
        Circle myCircle2 = new Circle(20);
        Circle myCircle3 = new Circle(10,10,20);
        Circle myCircle4 = new Circle(myCircle3);

        //Call * setters
        myCircle1.setX(50);
        myCircle1.setY(50);
        myCircle1.setRadius(100);
        myCircle1.grow(5);

        //Call * getters
        System.out.println("Circle1");
        System.out.println("x: "+myCircle1.getX());
        System.out.println("y: "+ myCircle1.getY());
        System.out.println("radius: "+myCircle1.getRadius());
        System.out.println("area: "+myCircle1.getArea());
        System.out.println("perimeter: "+myCircle1.getPerimeter());

        //Call statics
        System.out.println("\nStatics");
        System.out.println("Static method getCount(): "+Circle.getCount());
        System.out.println("Static constant ANGLES: "+ANGLES);

        System.out.println(random());
    }
}
