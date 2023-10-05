package Les1;

public class Auto {

    //Propreties
    private String merk;
    private String model;
    private int speed;

    //constructor
    public Auto(String merk, String model){
        this.merk = merk;
        this.model = model;
    }

    //methode
    public void getMessageCreation(){
        System.out.println("Auto is created!");
    }
    public int increaseSpeed(int increment){
        this.speed = this.speed + increment;
        return this.speed;
    }
}
