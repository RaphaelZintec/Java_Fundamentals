package Les1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsExample4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("adam");
        list.add("kilian");
        list.add("nathan");
        list.add("luna");
        list.add("lucas");
        long count = list.stream().filter((str)->str.length()<=4).count();
        System.out.println(count);
    }
}
