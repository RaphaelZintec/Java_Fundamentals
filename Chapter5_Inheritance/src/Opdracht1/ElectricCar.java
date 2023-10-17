package Opdracht1;

public class ElectricCar extends Car{

    //ATTRIBUTS
        private int battery;

    //CONSTRUCTORS
        public ElectricCar(String color, int battery) {
            super(color);
            this.battery = battery;
        }

    //GETTERS AND SETTERS
        public int getBattery() {
            return battery;
        }

        public void setBattery(int battery) {
            this.battery = battery;
        }

    //METHODS
        @Override
        public void accelerate(int amount) {
            setSpeed(getSpeed() + (Math.abs(amount)+(getBattery()/100)) );
        }

        @Override
        public void slow(int amount) {
            setSpeed(getSpeed() - (Math.abs(amount)+(getBattery()/100)) );
        }

        @Override
        public void park() {
            super.park();
        }

        @Override
        public String toString() {
            return "ElectricCar{" +
                    "battery=" + battery +
                    '}';
        }
}
