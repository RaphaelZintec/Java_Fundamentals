package be.intecbrussel.MyLes;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.now().minusDays(6);
        LocalDate date3 = LocalDate.now().plusMonths(2);
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String myDate = date1.format(format);
        System.out.println(myDate);
    }
}
