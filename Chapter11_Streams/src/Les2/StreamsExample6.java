package Les2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample6 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("two");
        list.add("derek");
        list.add("change");

        System.out.println(list.stream().map(element->element.toUpperCase()).collect(Collectors.toList()));
    }
}
