package Map;

import java.util.TreeMap;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Apple", 10);
        treeMap.put("Banana", 5);
        treeMap.put("Orange", 8);

        int quantityOfApple = treeMap.get("Apple");
        System.out.println("Aantal appels: "+quantityOfApple);

        System.out.println(treeMap.containsKey("Banana"));
    }
}
