package Les1.Oefening5;

public class Flashlight {
    //ATTRIBUT
        private Battery battery;

    //CONSTRUCTOR
        public Flashlight (Battery battery){
            this.battery = battery;
        }

    //METHODS
        public void showBatteryType() {
            System.out.println("Flashlight's battery brand is " + battery.getBrand() + " and the power is "+battery.deliverPower()+" mAh");
        }

        @Override
        public String toString() {
            return "Flashlight{" +
                    "battery brand=" + battery.getBrand() +
                    ", battery power=" + battery.deliverPower() +
                    '}';
        }
}
