package Les1.Oefening2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.toggleSwitch();
        car.gas();
        car.toggleSwitch();
        car.gas();

        System.out.println(car.toString());
    }
}
