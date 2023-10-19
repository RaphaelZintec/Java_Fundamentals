package Oefening5;

public class Circle extends Shape{

    //ATTRIBUTS
        private static int count;
        private double radius;

    //CONSTRUCTOR
        public Circle(int sides, double radius){
            super(sides, Math.PI, radius);
            ++count;
            this.radius = radius;
        }

    //OVERRIDES
        @Override
        public String toString() {
            return "Circle{" +
                    "area=" + getArea() +
                    ", sides=" + getSides() +
                    ", radius=" + radius +
                    ", count=" + count +
                    '}';
        }
}
