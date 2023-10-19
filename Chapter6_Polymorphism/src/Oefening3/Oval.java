package Oefening3;

public class Oval extends Circle{

    //CONSTRUCTOR
        public Oval(){super();}

    //OVERRIDES
        @Override
        public void whatShapeIsThat() {
            System.out.println("Thats an oval");
        }

        @Override
        public String toString() {
            return super.toString();
        }
}
