package Oefening4;

public class Tractor extends Vehicle{

    //ATTRIBUTS
        private static int count;

    //CONSTRUCTOR
        public Tractor(String road){
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
            return 30;
        }
        @Override
        public String toString() {
            return "Tractor{" +
                    "road='" + getTypeOfRoad() + '\'' +
                    ", hp='" + getHorsePower() + '\'' +
                    ", count=" + getCount() +
                    '}';
        }
}
