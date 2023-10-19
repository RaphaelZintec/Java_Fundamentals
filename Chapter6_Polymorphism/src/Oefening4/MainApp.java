package Oefening4;

public class MainApp {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Taxi taxi = new Taxi("city");
        Truck truck = new Truck("highway");
        Tractor tractor = new Tractor("farm");

        System.out.println(vehicle.toString());
        System.out.println(taxi.toString());
        System.out.println(truck.toString());
        System.out.println(tractor.toString());

        //UPCASTING
        Vehicle vehicle2 = taxi;
        System.out.println("\n"+vehicle2.toString());

        //DOWNCASTING
        Vehicle vehicle3 = new Taxi("city");
        Taxi taxi2 = (Taxi)vehicle3;
        System.out.println("\n"+taxi2.toString());


    }
}
