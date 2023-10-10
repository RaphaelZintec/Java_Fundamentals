package UMLOefening;

public class Circle {
    //ATTRIBUTS
        public static final int ANGLES = 0;
        private static int count;
        private int x;
        private int y;
        private int radius;

    //CONSTRUCTORS
        public Circle(){
        }

        public Circle(int radius) {
            this.radius = radius;
        }

        public Circle(int x, int y, int radius) {
            this.x = x;
            this.y = y;
            this.radius = radius;
        }
        public Circle(Circle c){
            this.count = c.count;
            this.x = c.x;
            this.y = c.y;
            this.radius = c.radius;
        }
    //SETTERS
        public void setX(int x){
            this.x = x;
        }
        public void setY(int y){
            this.y = y;
        }
        public void setRadius(int radius){
            this.radius = radius;
        }

    //GETTERS
        public int getX(){
            return x;
        }
        public int getY(){
            return y;
        }
        public int getRadius(){
            return radius;
        }
        public double getArea(){
            return x*y;
        }
        public double getPerimeter(){
            return (x+y)*2;
        }

        //GROW method
        public void grow(int d){
            this.x += d;
            this.y += d;
        }

        //STATIC METHOD
        public static int getCount(){
            return count;
        }

}
