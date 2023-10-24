package Les1.Oefening3;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.closeDoor(2);
        car.toggleSwitch();

        System.out.println();
        car.gas();
        car.openDoor(2);
        car.toggleSwitch();

        System.out.println();
        car.closeDoor(2);
        car.toggleSwitch();

        System.out.println("\n"+car.toString());
    }
}
