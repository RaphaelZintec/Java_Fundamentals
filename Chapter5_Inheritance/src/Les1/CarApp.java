package Les1;

public class CarApp {
    public static void main(String[] args) {
        Car myCar = new Car();

        System.out.println(myCar.getTypeOfVehicle());
        System.out.println(myCar.getBrandName());

        myCar.honk();
        myCar.sound();
    }
}
