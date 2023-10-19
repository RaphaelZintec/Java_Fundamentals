package Oefening4;

public class Taxi extends Vehicle{

    //ATTRIBUTS
    private static int count;

    //CONSTRUCTOR
        public Taxi(String road){
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
            return 120;
        }
        @Override
        public String toString() {
            return "Taxi{" +
                    "road='" + getTypeOfRoad() + '\'' +
                    ", hp='" + getHorsePower() + '\'' +
                    ", count=" + getCount() +
                    '}';
        }
}
