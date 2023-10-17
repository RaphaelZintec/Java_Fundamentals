package Opdracht1;

public class SUV extends Car{

    //ATTRIBUTS
        private boolean bullbar;
        private boolean isAWDOn;

    //CONSTRUCTORS
        public SUV(String color, int hp) {
            super(color, hp);
        }

    //GETTER AND SETTER
        public boolean getBullbar() {
            return bullbar;
        }

        public void setBullbar(boolean bullbar) {
            this.bullbar = bullbar;
        }

        public void allWheelDrive(boolean aWD) {
            this.isAWDOn = aWD;
            if (getSpeed()>30){
                setSpeed(30);
            }
        }

        public boolean getAllWheelDrive() {
            return isAWDOn;
        }

    //OTHER METHODS
        @Override
        public void accelerate(int amount) {
            if(isAWDOn && (getSpeed() + (Math.abs(amount)+(getHp()/100))) > 30 ){
                setSpeed(30);
            } else{
                super.accelerate(Math.abs(amount));
            }
        }

        @Override
        public String toString() {
            return "SUV{" +
                    "bullbar=" + bullbar +
                    ", isAWDOn=" + isAWDOn +
                    '}';
        }
}
