package Les1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamsExample5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Nepal, Kathmandu");
        list.add("Nepal, Pokhara");
        list.add("India, Delhi");
        list.add("USA, New York");
        list.add("Africa, Nigeria");

        System.out.println("Places from Nepal: ");
        list.stream()
                .filter( (p)-> p.startsWith("Nepal") )
                .map( (p)->p.toUpperCase() )
                .forEach( (p) -> System.out.println(p) );


        List<String> names = Arrays.asList("a", "b");
        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
