package Oefening4;

public class Vehicle {

    //ATTRIBUTS
        private String road;
        private static int count;

    //CONSTRUCTOR
        public Vehicle(){++count;}

    //METHODS
        public int getCount() {
            return count;
        }
        public String getTypeOfRoad() {
            return road;
        }
        public void setTypeOfRoad(String road) {
            this.road = road;
        }
        public int getHorsePower(){
            return 2;
        }

    //OVERRIDES
        @Override
        public String toString() {
            return "Vehicle{" +
                    "road='" + road + '\'' +
                    ", hp='" + getHorsePower() + '\'' +
                    ", count=" + count +
                    '}';
        }
}
