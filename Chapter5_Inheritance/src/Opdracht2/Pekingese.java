package Opdracht2;

public class Pekingese extends HomelyDog{
    //ATTRIBUTS
        private double hairLength;

    //CONSTRUCTORS
        public Pekingese(){super();}

        public Pekingese(String name, int lifespan, char size, char coat, double hairLength) {
            super(name, lifespan, size, coat);
            this.hairLength = hairLength;
        }

    //METHODS
        public double getHairLength() {
            return hairLength;
        }

        public void setHairLength(double hairLength) {
            this.hairLength = hairLength;
        }

        public void play(){}

    //OVERRIDES
        @Override
        public String toString() {
            return "HomelyDog{" +
                    "name='" + getName() + '\'' +
                    ", lifespan=" + getLifespan() +
                    ", size=" + getSize() +
                    ", coat=" + getCoat() +
                    ", hairLength=" + getHairLength() +
                    ", counter=" + getCount() +
                    '}';
        }
}
