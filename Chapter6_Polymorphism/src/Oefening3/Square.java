package Oefening3;

public class Square extends Geometry{
    //CONSTRUCTOR
        public Square(){super(3);}

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
