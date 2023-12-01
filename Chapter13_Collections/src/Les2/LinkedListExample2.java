package Les2;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample2 {
    public static void main(String[] args) {

        LinkedList<String> cities = new LinkedList<>();

        cities.add("Brussel");
        cities.add("Leuven");
        cities.add("Brugge");
        cities.add("Gent");

        cities.add("Leuven");

        cities.add(3, "Genk");

        System.out.println("LinkedList");
        cities.forEach(city ->
                System.out.print(city+" "));

    }
}
