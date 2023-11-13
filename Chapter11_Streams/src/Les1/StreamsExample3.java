package Les1;

import java.util.stream.Stream;

public class StreamsExample3 {
    public static void main(String[] args) {
        Stream.of("bob","tom","abdu").sorted().forEach(System.out::println);
    }
}
