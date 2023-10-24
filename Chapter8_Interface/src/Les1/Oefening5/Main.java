package Les1.Oefening5;

public class Main {
    public static void main(String[] args) {
        Flashlight flashlight1 = new Flashlight(new Duracel());
        Flashlight flashlight2 = new Flashlight(new Philips());
        Flashlight flashlight3 = new Flashlight(new Varta());

        flashlight1.showBatteryType();
        flashlight2.showBatteryType();
        flashlight3.showBatteryType();

        System.out.println("\n"+flashlight1.toString());
        System.out.println(flashlight2.toString());
        System.out.println(flashlight3.toString());
    }
}
