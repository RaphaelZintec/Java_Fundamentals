package Opdracht2;

public class Akita extends HomelyDog{

    //ATTRIBUTS
        private char gender;

    //CONSTRUCTORS
        public Akita(){super();}

        public Akita(String name, int lifespan, char size, char coat, char gender) {
            super(name, lifespan, size, coat);
            this.gender = gender;
        }

    //METHODS
        public char getGender() {
            return gender;
        }

        public void setGender(char gender) {
            this.gender = gender;
            if (gender == 'F'){
                setSize('M');
            }else{
                setSize('L');
            }
        }

        public void layDown(){}
        public void dance(){}
        public void sing(){}

    //OVERRIDES
        @Override
        public void sit() {
            //null just do nothing.
        }

        @Override
        public String toString() {
            return "HomelyDog{" +
                    "name='" + getName() + '\'' +
                    ", lifespan=" + getLifespan() +
                    ", size=" + getSize() +
                    ", coat=" + getCoat() +
                    ", gender=" + getGender() +
                    ", counter=" + getCount() +
                    '}';
        }

}
