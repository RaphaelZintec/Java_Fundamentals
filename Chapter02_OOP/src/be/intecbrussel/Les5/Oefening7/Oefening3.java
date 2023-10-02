package be.intecbrussel.Les5.Oefening7;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Oefening3 {
    public static void main(String[] args) {
        LocalDate dateOfBirth = LocalDate.of(1994, Month.SEPTEMBER, 20);
        LocalDate now = LocalDate.now();
        Period period = Period.between(dateOfBirth,now);

        System.out.println("Your date of birth is: 20 september 1994 and you lived:");
        System.out.println(period.getDays()+" days");
        System.out.println(period.getMonths()+" months");
        System.out.println(period.getYears()+" years");
    }
}
