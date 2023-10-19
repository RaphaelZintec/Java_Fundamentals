package Opdracht2;

public class BelgianMalinois extends WildDog{

    //ATTRIBUTS
        private boolean dangerous;
        private double maxRunningSpeed;

    //CONSTRUCTORS
        public BelgianMalinois(){super();}

        public BelgianMalinois(String name, int lifespan, char size, boolean dangerous, double maxRunningSpeed) {
            super(name, lifespan, size);
            this.dangerous = dangerous;
            this.maxRunningSpeed = maxRunningSpeed;
        }

    //METHODS
        public boolean isDangerous() {
            return dangerous;
        }

        public void setDangerous(boolean dangerous) {
            this.dangerous = dangerous;
        }

        public double getMaxRunningSpeed() {
            return maxRunningSpeed;
        }

        public void setMaxRunningSpeed(double maxRunningSpeed) {
            this.maxRunningSpeed = maxRunningSpeed;
        }

        public void defend(){

        }
        public void attack(){

        }

    //OVERRIDES
        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + getName() + '\'' +
                    ", lifespan=" + getLifespan() +
                    ", size=" + getSize() +
                    ", dangerous=" + isDangerous() +
                    ", maxRunningSpeed=" + getMaxRunningSpeed() +
                    ", counter=" + getCount() +
                    '}';
        }
}
