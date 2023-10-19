package Oefening3;

public class Square extends Geometry{
    //CONSTRUCTOR
        public Square(){super(4);}

    //OVERRIDES
        @Override
        public void whatShapeIsThat() {
            System.out.println("Thats a Square");
        }

        @Override
        public String toString() {
            return super.toString();
        }
}
