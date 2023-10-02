package be.intecbrussel.Les4;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDate justDate = LocalDate.now();
        LocalTime justTime = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(justDate);
        System.out.println(justTime);
        System.out.println(dateTime);
    }
}
