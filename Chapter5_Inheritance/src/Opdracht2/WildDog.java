package Opdracht2;

public class WildDog extends Dog{

    //ATTRIBUTS
        private char size = 'L';

    //CONSTRUCTORS
        public WildDog(){super();}

        public WildDog(String name, int lifespan, char size) {
            super(name, lifespan, size);
        }

    //METHODS
        public void bark(){

        }
        public void hunt(){

        }

    //OVERRIDES
        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + getName() + '\'' +
                    ", lifespan=" + getLifespan() +
                    ", size=" + getSize() +
                    ", counter=" + getCount() +
                    '}';
        }


}
