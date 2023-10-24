package Opdracht1;

public class BendingRobot extends Robot{

    //ATTRIBUTS
        private double maxBendAngle;

    //CONSTRUCTOR
        public BendingRobot(String unitName, double maxBendAngle){
            super(unitName);
            this.maxBendAngle = maxBendAngle;
        }

    //METHODS
        public void bend(double angle){
            if (angle < maxBendAngle)
                System.out.println("The bending is successful with an angle of "+angle+"°");
            else
                System.out.println("Folding by "+angle+"° is not possible, the requested angle is too large "+maxBendAngle+"° max");
        }
        @Override
        public String toString() {
            return "BendingRobot{" +
                    "name=" + getUnitName() +
                    ", MAX_BEND_ANGLE=" + maxBendAngle +
                    '}';
        }
}
