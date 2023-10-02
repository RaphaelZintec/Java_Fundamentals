package be.intecbrussel.Les5.Oefening7;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Oefening2 {
    public static void main(String[] args) {
        LocalDateTime myDateTime = LocalDateTime.now();
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("E, dd MMM yyyy HH:mm:ss");
        System.out.println(myDateTime.format(myFormat));
    }
}
