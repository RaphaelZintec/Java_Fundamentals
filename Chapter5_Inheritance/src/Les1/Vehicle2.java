package Les1;

public class Vehicle2 {
    private String typeOfVehicle;

    public Vehicle2() {
        //this("Car");
        System.out.println("Vehicle class no-args constructor");
    }

    public Vehicle2(String typeOfVehicle) {
        this();
        this.typeOfVehicle = typeOfVehicle;
        System.out.println("Constructor Vehicle met parameters");
    }

}
