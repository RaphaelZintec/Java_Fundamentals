package Opdracht1;

public class LiftingRobot extends Robot{
    //ATTRIBUTS
        private double MAX_LIFT_HEIGHT;
        private double absHeight;

    //CONSTRUCTOR
        public LiftingRobot(String unitName, double maxLiftHeight){
            super(unitName);
            this.MAX_LIFT_HEIGHT = maxLiftHeight;
        }

    //METHODS
        public void lift(double height){
            this.absHeight = Math.abs(height);
            if(absHeight == 0)
                System.out.println("Robot remains at his initial position");
            else if(absHeight <= MAX_LIFT_HEIGHT)
                System.out.println("Robot lifted successfully up "+absHeight+" meters");
            else
                System.out.println("Robot cannot lift more than "+MAX_LIFT_HEIGHT+" meters" );
        }
        @Override
        public String toString() {
            return "BendingRobot{" +
                    "name=" + getUnitName() +
                    ", height=" + absHeight +
                    ", MAX_LIFT_HEIGHT=" + MAX_LIFT_HEIGHT +
                    '}';
        }
}
