package Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        int ageOfAlice = map.get("Alice");
        System.out.println(ageOfAlice);

        boolean containsBob = map.containsKey("Bob");
        System.out.println(containsBob);

        int size = map.size();
        System.out.println(size);

        for (String key : map.keySet()){
            System.out.println(key);
        }

        for (int value : map.values()){
            System.out.println(value);
        }

        map.clear();
        System.out.println(map.isEmpty());

    }
}
