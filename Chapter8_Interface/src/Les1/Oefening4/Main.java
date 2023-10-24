package Les1.Oefening4;

public class Main {
    public static void main(String[] args) {
        Battery iphoneBattery  = new IPhone();
        Battery samsungBattery = new SamsungGalaxy();

        System.out.println("Battery of iphone is: "+iphoneBattery.deliverPower()+" mAh");
        System.out.println("Battery of samsung is: "+samsungBattery.deliverPower()+" mAh");
    }
}
