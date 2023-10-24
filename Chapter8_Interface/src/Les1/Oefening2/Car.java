package Les1.Oefening2;

public class Car implements Motor,Switch1{
    private boolean isGasOn;
    @Override
    public void gas() {
        if(!isGasOn){
            isGasOn = true;
            System.out.println("Gas turned on");
        }
        else{
            System.out.println("Gas is already on");
        }
    }
    @Override
    public void toggleSwitch() {
        if(isGasOn)
            System.out.println("Car accelerated");
        else
            System.out.println("Car cannot accelerate without gas");
    }

    @Override
    public String toString() {
        return "Car{" +
                "isGasOn=" + isGasOn +
                '}';
    }
}
