package Les3;

public class Rectangle {
    //PROPERTIES
    private int height;
    private int width;
    private int x;
    private int y;

    public static final int CORNERS = 4;

    public static int count = 0;

    //CONSTRUCTORS
        //Default
        public Rectangle(){
            this(1,1);
        }
        //1 param
        public Rectangle(Rectangle r) {
            this.height = r.height;
            this.width = r.width;
            this.x = r.x;
            this.y = r.y;
        }
        //2 params
        public Rectangle(int height, int width){
            this.height = height;
            this.width = width;
        }
        //4 params
        public Rectangle(int height, int width, int x, int y) {
            this.height = height;
            this.width = width;
            this.x = x;
            this.y = y;
        }

    //METHODS
        //SETTERS
        public void setHeight(int height) {
            this.height = height < 0 ? Math.abs(height) : height;
        }
        public void setWidth(int width) {
            this.width = width < 0 ? Math.abs(width) : width;
        }
        public void setX(int x) {
            this.x = x;
        }
        public void setY(int y) {
            this.y = y;
        }
        public void setPosition(int x, int y){
            this.x = x;
            this.y = y;
        }
        public void grow(int d){
            this.height += Math.abs(d);
            this.width  += Math.abs(d);
        }

        //GETTERS
        public int getHeight() {
            return height;
        }
        public int getWidth() {
            return width;
        }
        public int getX() {
            return x;
        }
        public int getY() {
            return y;
        }
        public double getArea(){
            return height * width;
        }
        public double getPerimeter(){
            return (height + width) * 2;
        }

}
