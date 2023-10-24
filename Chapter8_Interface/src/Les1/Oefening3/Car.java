package Les1.Oefening3;

public class Car implements Vehicle {
    private boolean isGasOn;
    private int openedDoors = 0;

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
        if(isGasOn && openedDoors == 0)
            System.out.println("Car accelerated");
        else {
            if (openedDoors != 0)
                System.out.println("Car cannot accelerate with opened windows");
            else
                System.out.println("Car cannot accelerate without gas");
        }
    }

    @Override
    public void openDoor(int door) {
        if ((openedDoors + door) <= DOORS){
            openedDoors += door;
            System.out.println(door+" door(s) opened");
        }
        else
            System.out.println("Car doesn't have so many doors to open");
    }

    @Override
    public void closeDoor(int door) {
        if ((openedDoors - door) >= 0){
            openedDoors -= door;
            System.out.println(door+" door(s) closed");
        }
        else
            System.out.println("Car doesn't have so many doors to close");
    }

    @Override
    public String toString() {
        return "Car{" +
                "isGasOn=" + isGasOn +
                ", openedDoors=" + openedDoors +
                '}';
    }
}
