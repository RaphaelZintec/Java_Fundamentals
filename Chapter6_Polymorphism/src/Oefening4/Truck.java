package Oefening4;

public class Truck extends Vehicle{

    //ATTRIBUTS
        private static int count;

    //CONSTRUCTOR
        public Truck(String road){
            super();
            ++this.count;
            this.setTypeOfRoad(road);
        }

    //OVERRIDES
        @Override
        public int getCount() {
            return count;
        }
        @Override
        public int getHorsePower() {
            return 200;
        }
        @Override
        public String toString() {
            return "Truck{" +
                    "road='" + getTypeOfRoad() + '\'' +
                    ", hp='" + getHorsePower() + '\'' +
                    ", count=" + getCount() +
                    '}';
        }
}
