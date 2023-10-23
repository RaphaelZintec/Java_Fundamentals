package Opdracht1;

public abstract class Robot {
    //ATTRIBUTS
    private String unitName;

    //CONSTRUCTORS
    public Robot(){
        unitName = "nameless robot";
    }
    public Robot(String unitName){
        this.unitName = unitName;
    }

    //METHODS
    public abstract void boot();
    public String getUnitName(){
        return unitName;
    }
}
