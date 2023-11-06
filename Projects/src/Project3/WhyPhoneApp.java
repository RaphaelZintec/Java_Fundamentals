package Project3;

import javax.sound.midi.Soundbank;

public class WhyPhoneApp {
    public static void main(String[] args) {
        WhyPhone phone = new WhyPhone(1000, "Galaxy", "Red");
        WhyPhoneApp.showSpecs(phone);

        System.out.println("\nDummy phone");
        DummyPhone dummyPhone = new DummyPhone();
        dummyPhone.showSpecs();
    }
    public static void showSpecs(SmartPhone phone){
        System.out.println("\nPrice:\n"+phone.getPRICE());
        System.out.println("\nBrand:\n"+phone.getBRAND());
        System.out.println("\nshootAPhoto:"); phone.shootAPhoto(2);
        System.out.println("\nviewPhotos:\n"+phone.viewPhotos());
        System.out.println("\nlocate:\n"+phone.locate(30.33,44.55));
        System.out.println("\nnavigate:"); phone.navigate();
        System.out.println("\nplayChannel:"); phone.playChannel(333.33);
        System.out.println("\nchangeChannel:"); phone.changeChannel(33.44);
        System.out.println("\nconnect:"); phone.connect("Wifi");
        System.out.println("\ndisconnect:"); phone.disconnect("Wifi");
        System.out.println("\nstartCall:"); phone.startCall("0488 54 55 32");
        System.out.println("\nendCall:"); phone.endCall();
    }
}
