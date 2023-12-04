package Test;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car(5,"Hi");
        Car c2 = new Car(6,"Hi");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
    }
}
