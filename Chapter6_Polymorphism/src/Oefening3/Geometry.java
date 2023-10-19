package Oefening3;

public class Geometry {

    //ATTARIBUTS
        private int numberOfSides;
        private int count;

    //CONSTRUCTORS
        public Geometry(){
            ++count;
        }
        public Geometry(int numberOfSides){
            this.numberOfSides = numberOfSides;
            ++count;
        }

    //METHODS
        public int getNumberOfSides() {
            return numberOfSides;
        }
        public void setNumberOfSides(int numberOfSides) {
            this.numberOfSides = numberOfSides;
        }
        public int getCount() {
            return count;
        }
        public void setCount(int count) {
            this.count = count;
        }
        public void whatShapeIsThat(){
            System.out.println("We don't know");
        }

    @Override
        public String toString() {
            return "Geometry{" +
                    "numberOfSides=" + numberOfSides +
                    ", count=" + count +
                    '}';
        }
}
