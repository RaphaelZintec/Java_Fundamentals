package Oefening3;

public class Circle extends Geometry{

    //CONSTRUCTOR
        public Circle(){super(0);}

    //OVERRIDES
        @Override
        public void whatShapeIsThat() {
            System.out.println("Thats a circle");
        }

        @Override
        public String toString() {
            return super.toString();
        }
}
