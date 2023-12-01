package Les4;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple");

        System.out.println(set);
        System.out.println(set.contains("Apple"));

        set.remove("Orange");
        System.out.println(set);

        set.clear();
        System.out.println(set.isEmpty());
    }
}
