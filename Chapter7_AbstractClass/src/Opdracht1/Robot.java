package Opdracht1;

public abstract class Robot {
    //ATTRIBUTS
        private String unitName;

    //CONSTRUCTORS
        public Robot(){
            unitName = "nameless robot";
            boot();
        }
        public Robot(String unitName){
            this.unitName = unitName;
            boot();
        }

    //METHODS
        public void boot(){
            System.out.println("Robot " +getUnitName()+ " is ready");
        }
        public String getUnitName(){
            return unitName;
        }
        @Override
        public abstract String toString();
}
