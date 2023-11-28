package Person;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.stream.Collectors;

public class MainApp {
    public static void main(String[] args) {
        ArrayDeque<Person> arrayDeque = new ArrayDeque<>();
        arrayDeque.offerFirst(new Person("Jerry", Person.Gender.MALE));
        arrayDeque.offerFirst(new Person("John",  Person.Gender.MALE));
        arrayDeque.offerFirst(new Person("Matt",  Person.Gender.MALE));

        arrayDeque.offerLast(new Person("Mary",  Person.Gender.FEMALE));
        arrayDeque.offerLast(new Person("Suzan", Person.Gender.FEMALE));
        arrayDeque.offerLast(new Person("Katy",  Person.Gender.FEMALE));

        System.out.println("Couples are: "+arrayDeque.pollFirst().getName()+" and "+arrayDeque.pollLast().getName());
        System.out.println("Couples are: "+arrayDeque.pollFirst().getName()+" and "+arrayDeque.pollLast().getName());
        System.out.println("Couples are: "+arrayDeque.pollFirst().getName()+" and "+arrayDeque.pollLast().getName());
    }
}
