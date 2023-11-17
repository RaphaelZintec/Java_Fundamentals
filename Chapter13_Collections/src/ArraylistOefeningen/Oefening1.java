package ArraylistOefeningen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Oefening1 {
    public static void main(String[] args) {
        List<String> wordSet  = Arrays.asList("Bob", "Tom", "Jessica", "Elena");
        List<String> wordSet2 = Arrays.asList("Bob2", "Tom2", "Jessica2", "Elena2");

        List<String> wordSetFusion = new ArrayList<>(wordSet);
        wordSetFusion.addAll(wordSet2);

        wordSetFusion.stream().forEach(System.out::println);
    }
}
