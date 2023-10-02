package be.intecbrussel.Les4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {
    public static void main(String[] args) {
        LocalDateTime myDate = LocalDateTime.now();
        System.out.println("before format: "+myDate);

        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss");
        String formatDateTime = myDate.format(myFormat);
        System.out.println("after format: "+formatDateTime);

        //yyyy-MM-dd 1988-09-29
        //dd/MM/yyyy 29/03/1994
        //dd-MMM-yyyy 29-Sep-1998
        //E, MMM dd yyyy Thu, Sep 29 1998
    }
}
