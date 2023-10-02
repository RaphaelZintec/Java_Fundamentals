package be.intecbrussel.Les5.Oefening7;

import java.time.LocalDate;
import java.time.LocalTime;

public class Oefening1 {
    public static void main(String[] args) {
        LocalDate myDate = LocalDate.now();
        LocalTime myTime = LocalTime.now();
        System.out.println("Today's date is: "+myDate);
        System.out.println("Time is now: "+myTime);
    }
}
