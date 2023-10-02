package be.intecbrussel.Les4;

import java.time.*;

public class LocalDateTimeExample2 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        LocalTime time = LocalTime.now();
        LocalDate date = LocalDate.now();

        System.out.println("now: "+LocalDateTime.now());
        System.out.println("Apr 15, 1994, 11:30am: "+ LocalDateTime.of(1994, Month.APRIL, 15, 11,30));
        System.out.println("now (from instant):"+ LocalDateTime.ofInstant(Instant.now(),ZoneId.systemDefault()));
        System.out.println("6 months from now: "+ LocalDateTime.now().plusMonths(6) );
        System.out.println("6 months ago: "+ LocalDateTime.now().minusMonths(6));

    }
}
