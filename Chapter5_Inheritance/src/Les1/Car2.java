package Les1;

public class Car2 extends Vehicle2{

    //ATTRIBUTS
    private String brandName = "Audi";

    //PROPERTIES
    public Car2(){
        super("hi");
        System.out.println("Car class constructor");
    }

    //PROPERTIES
    public String getBrandName(){
        return brandName;
    }

    public void setBrandName(String brandName){
        this.brandName = brandName;
    }

    public void honk(){
        System.out.println("Tuut tuut!");
    }

}
