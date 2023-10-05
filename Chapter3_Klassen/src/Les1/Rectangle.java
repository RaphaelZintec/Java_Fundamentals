package Les1;

public class Rectangle {

    public int getArea(int length, int widh){
        return length * widh;
    }
    public double getArea(double length, double widh){
        return length * widh;
    }
    public long getArea(long length, long widh){
        return length * widh;
    }

    public void getMessageCreation(double length){
        System.out.println("Rectangle is created! " + length);
    }
    public void getMessageCreation(double length, double width){
        System.out.println("Rectangle is created! " + length +" & "+ width);
    }

    //static method can be called without creating an object
    public static void messageStatic(){
        System.out.println("Hello message from a static method");
    }
}
