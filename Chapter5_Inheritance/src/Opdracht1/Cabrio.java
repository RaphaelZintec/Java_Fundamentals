package Opdracht1;

public class Cabrio extends Car{

    //ATTRIBUTS
        private boolean sunroof;

    //CONSTRUCTORS
        public Cabrio(String color, int hp) {
            super(color, hp);
        }

    //GETTERS AND SETTERS
        public boolean getSunRoof(){
            return sunroof;
        }

    //OTHER METHODS
        public void openRoof(){
            sunroof = true;
        }

        @Override
        public String toString() {
            return "Cabrio{" +
                    "sunroof=" + sunroof +
                    '}';
        }
}
