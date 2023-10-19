package Oefening5;

public class Shape {

    //ATTRIBUTS
        private static int count;
        private double area;
        private int sides;

    //CONSTRUCTORS
        public Shape(int sides){
            ++count;
            this.sides = sides;
        }
        public Shape(int sides, double area){
            this(sides);
            this.area = area;
        }
        public Shape(int sides, double pi, double radius){
            this(sides);
            setArea(pi, radius);
        }
        public Shape(int sides, double side1, double side2, double side3){
            this(sides);
            setArea(side1, side2, side3);
        }
        public Shape(int sides, double length, double width, boolean isRectangle){
            this(sides);
            setArea(length, width, isRectangle);
        }

    //METHODS
        //CIRCLE
        public void setArea(double pi, double radius){
            this.area = pi * (radius * radius);
        }
        //TRIANGLE
        public void setArea(double side1, double side2, double side3){
            double halfPerimeter = (side1 + side2 + side3) / 2;
            this.area = Math.sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));
        }
        //RECTANGLE
        public void setArea(double length, double width, boolean isRectangle){
            if(isRectangle){
                this.area = length * width;
            }
        }
        public double getArea() {
            return area;
        }
        public int getSides() {
            return sides;
        }


    //OVERRIDES
        @Override
        public String toString() {
            return "Shape{" +
                    "area=" + area +
                    ", sides=" + sides +
                    ", count=" + count +
                    '}';
        }
}
