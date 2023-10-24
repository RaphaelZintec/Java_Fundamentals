package Opdracht1;

public class LiftingRobot extends Robot{
    //ATTRIBUTS
        private double maxLiftHeight;

    //CONSTRUCTOR
        public LiftingRobot(String unitName, double maxLiftHeight){
            super(unitName);
            this.maxLiftHeight = maxLiftHeight;
        }

    //METHODS
        public void lift(double height){
            if(height <= maxLiftHeight)
                System.out.println("The lifting is successful with a height of "+height+" meters");
            else
                System.out.println("Lifting by "+height+" meters is not possible, the requested height is too high, max is "+maxLiftHeight );
        }
        @Override
        public String toString() {
            return "LiftingRobot{" +
                    "name=" + getUnitName() +
                    ", MAX_LIFT_HEIGHT=" + maxLiftHeight +
                    '}';
        }
}
