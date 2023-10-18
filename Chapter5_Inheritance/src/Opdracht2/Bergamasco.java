package Opdracht2;

public class Bergamasco extends HomelyDog{

    //ATTRIBUTS
        private int maxRunningSpeed;
        private double hairLength;

    //CONSTRUCTORS
        public Bergamasco(){super();}

        public Bergamasco(String name, int lifespan, char size, char coat, int maxRunningSpeed, double hairLength) {
            super(name, lifespan, size, coat);
            this.maxRunningSpeed = maxRunningSpeed;
            this.hairLength = hairLength;
        }

    //METHODS
        public int getMaxRunningSpeed() {
            return maxRunningSpeed;
        }

        public void setMaxRunningSpeed(int maxRunningSpeed) {
            this.maxRunningSpeed = maxRunningSpeed;
        }

        public double getHairLength() {
            return hairLength;
        }

        public void setHairLength(double hairLength) {
            this.hairLength = hairLength;
        }

        public void kiss(){}

    //OVERRIDES
        @Override
        public String toString() {
            return "HomelyDog{" +
                    "name='" + getName() + '\'' +
                    ", lifespan=" + getLifespan() +
                    ", size=" + getSize() +
                    ", coat=" + getCoat() +
                    ", maxRunningSpeed=" + getMaxRunningSpeed() +
                    ", hairLength=" + getHairLength() +
                    ", counter=" + getCount() +
                    '}';
        }
}
