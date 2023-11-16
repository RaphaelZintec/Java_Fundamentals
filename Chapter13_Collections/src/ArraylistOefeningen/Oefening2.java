package ArraylistOefeningen;

import java.util.*;
import java.util.stream.Collectors;

public class Oefening2 {
    public static void main(String[] args) {
        List<Integer> listNumbers  = new ArrayList<>();
        String numbers = "";
        Random random = new Random();

        for (int i=0; i<10; ++i)
            listNumbers.add(random.nextInt(1000));

        numbers = listNumbers.stream()
                .map(String::valueOf)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining(", "));

        System.out.println(numbers.toString());

    }
}
