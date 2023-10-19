package Oefening3;

public class Triangle extends Geometry{
    //CONSTRUCTOR
        public Triangle(){super(3);}

    //OVERRIDES
        @Override
        public void whatShapeIsThat() {
            System.out.println("Thats a triangle");
        }

        @Override
        public String toString() {
            return super.toString();
        }
}
