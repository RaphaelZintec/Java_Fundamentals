package Opdracht1;

public class CrazyRobot extends Robot{

    //ATTRIBUTS
        private StringBuilder originalName;

    //CONSTRUCTOR
        public CrazyRobot(){}
        public CrazyRobot(StringBuilder unitName){
            super(unitName.reverse().toString());
            this.originalName = unitName.reverse();
        }

    //METHODS
        @Override
        public String toString() {
            return "BendingRobot{" +
                    "orginal name=" + originalName +
                    ", reversed name=" + getUnitName() +
                    '}';
        }
}
