package Opdracht2;

public class Dog extends Wolf{

    //ATTRIBUTS
        private char size;

    //CONSTRUCTORS
        public Dog(){super();}

        public Dog(String name, int lifespan, char size) {
            super(name, lifespan);
            this.size = size;
        }

    //METHODS
        public char getSize() {
            return size;
        }

        public void setSize(char size) {
            this.size = size;
        }

        public void bark(){
            System.out.println("wow wow wow");
        }

        public void sit(){

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
