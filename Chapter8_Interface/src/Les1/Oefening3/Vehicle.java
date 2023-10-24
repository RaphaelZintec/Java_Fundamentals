package Les1.Oefening3;

import Les1.Oefening2.Motor;
import Les1.Oefening2.Switch1;

public interface Vehicle extends Motor, Switch1 {
    int DOORS = 5;
    void openDoor(int door);
    void closeDoor(int door);
}
