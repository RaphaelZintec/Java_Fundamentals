package Les1;

import java.util.ArrayList;
import java.util.List;

public class StreamsExample2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Rakeesh");
        list.add("Panjeet");
        list.add("Calia");
        list.add("Vihesh");
        list.add("Vishna");
        list.forEach(
                (name) -> System.out.println(name)
        );
    }
}
