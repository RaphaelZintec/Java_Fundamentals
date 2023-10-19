package Oefening5;

public class Triangle extends Shape {

    //ATTRIBUTS
        private static int count;
        private double side1;
        private double side2;
        private double side3;

    //CONSTRUCTOR
        public Triangle(double side1, double side2, double side3){
            super(3, side1, side2, side3);
            ++count;
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }

    //OVERRIDES
        @Override
        public String toString() {
            return "Triangle{" +
                    "area=" + getArea() +
                    ", sides=" + getSides() +
                    ", side1=" + side1 +
                    ", side2=" + side2 +
                    ", side3=" + side3 +
                    ", count=" + count +
                    '}';
        }
}
