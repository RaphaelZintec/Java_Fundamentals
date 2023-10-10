package Les3;

public class RectangleApp {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10,15);
        System.out.println("Rectangle 1");
        System.out.println(rectangle.getHeight());
        System.out.println(rectangle.getWidth());

        Rectangle rectangle2 = new Rectangle(1,2,3,4);
        System.out.println("Rectangle 2");
        System.out.println(rectangle2.getHeight());
        System.out.println(rectangle2.getWidth());
        System.out.println(rectangle2.getX());
        System.out.println(rectangle2.getY());

        Rectangle rectangle3 = new Rectangle(rectangle);
        System.out.println("Rectangle 3");
        System.out.println(rectangle3.getHeight());
        System.out.println(rectangle3.getWidth());
        System.out.println(rectangle3.getX());
        System.out.println(rectangle3.getY());
    }
}
