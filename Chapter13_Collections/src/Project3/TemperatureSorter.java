package Project3;

import java.util.Comparator;

public class TemperatureSorter implements Comparator<Patient> {
    @Override
    public int compare(Patient o1, Patient o2) {
        return Integer.compare(o1.getTemperature(), o2.getTemperature());
    }
}
