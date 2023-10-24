package Les1.InterfaceExample1;

public class Main {
    public static void main(String[] args) {
        Vehicle car1 = new Car(0,5,0,120);
        car1.shiftGearUp();
        System.out.println("Car current gear: " + car1.getCurrentGear());
    }
}
