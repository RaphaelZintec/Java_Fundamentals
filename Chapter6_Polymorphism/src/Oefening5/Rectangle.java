package Oefening5;

public class Rectangle extends Shape{

    //ATTRIBUTS
        private static int count;
        private double length;
        private double width;

    //CONSTRUCTOR
        public Rectangle(double length, double width){
            super(4, length, width, true);
            ++count;
            this.length = length;
            this.width = width;
        }

    //OVERRIDES
        @Override
        public String toString() {
            return "Rectangle{" +
                    "area=" + getArea() +
                    ", sides=" + getSides() +
                    ", length=" + length +
                    ", width=" + width +
                    ", count=" + count +
                    '}';
        }
}
