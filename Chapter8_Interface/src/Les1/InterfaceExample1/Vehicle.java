package Les1.InterfaceExample1;

public interface Vehicle {
     int DOORS = 3;
     int WHEELS = 4;

    void speedUp();
    void braking();
    void shiftGearUp();
    void shiftGearDown();
    int getCurrentGear();
}
