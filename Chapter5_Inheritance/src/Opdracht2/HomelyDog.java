package Opdracht2;

public class HomelyDog extends Dog{

    //ATTRIBUTS
        private char size = 'M';
        private char coat;

    //CONSTRUCTORS
        public HomelyDog(){super();}

        public HomelyDog(String name, int lifespan, char size, char coat) {
            super(name, lifespan, size);
            this.size = size;
            this.coat = coat;
        }

    //METHODS
        public char getCoat() {
            return coat;
        }

        public void setCoat(char coat) {
            this.coat = coat;
        }

    //OVERRIDES
        @Override
        public String toString() {
            return "HomelyDog{" +
                    "name='" + getName() + '\'' +
                    ", lifespan=" + getLifespan() +
                    ", size=" + getSize() +
                    ", coat=" + getCoat() +
                    ", counter=" + getCount() +
                    '}';
        }

}
