package Opdracht1;

public class BendingRobot extends Robot{

    //ATTRIBUTS
        private final double MAX_BEND_ANGLE;
        private double absAngle;

    //CONSTRUCTOR
        public BendingRobot(String unitName, double maxBendAngle){
            super(unitName);
            this.MAX_BEND_ANGLE = maxBendAngle;
        }

    //METHODS
        public void bend(double angle){
            this.absAngle = Math.abs(angle);
            if(absAngle == 0)
                System.out.println("Robot remains at his initial position");
            else if (absAngle < MAX_BEND_ANGLE)
                System.out.println("Robot bended by "+absAngle+"°");
            else
                System.out.println("Robot cannot bend more than "+MAX_BEND_ANGLE+"°");
        }
        @Override
        public String toString() {
            return "BendingRobot{" +
                    "name=" + getUnitName() +
                    ", angle=" + absAngle +
                    ", MAX_BEND_ANGLE=" + MAX_BEND_ANGLE +
                    '}';
        }
}
