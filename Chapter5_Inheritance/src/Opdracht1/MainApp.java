package Opdracht1;

public class MainApp {
    public static void main(String[] args) {
        SUV suv = new SUV("Red", 250);
        Cabrio cabrio = new Cabrio("Yellow", 200);
        ElectricCar electricCar = new ElectricCar("Green", 60);

        suv.accelerate(50);
        cabrio.accelerate(50);
        electricCar.accelerate(50);

        System.out.println("SUV SPEED: "+suv.getSpeed());
        System.out.println("CABRIO SPEED: "+cabrio.getSpeed());
        System.out.println("ELECTRIC SPEED: "+electricCar.getSpeed());

        suv.allWheelDrive(true);
        System.out.println("SUV SPEED AFTER AWD ON: "+suv.getSpeed());


    }
}
