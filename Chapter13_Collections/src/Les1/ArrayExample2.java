package Les1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayExample2 {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Brussels");
        cities.add("Leuven");
        cities.add("Brugge");
        cities.add("Gent");

        cities.add("Leuven");

        cities.add(3, "Genk");

        System.out.println("ArrayList->");
        cities.forEach(city -> System.out.println(city+" "));


    }
}
