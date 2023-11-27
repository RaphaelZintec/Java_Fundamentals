package LinkedListOefeningen;

import java.util.*;

public class Oef1 {
    public static void main(String[] args) {
        List<String> list1  = Arrays.asList("Bob", "Tom", "Jessica", "Elena");
        List<String> list2 = Arrays.asList("Bob2", "Tom2", "Jessica2", "Elena2");

        LinkedList<String> linkedList = new LinkedList<>(list1);
        linkedList.addAll(list2);

        Iterator itr = linkedList.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}
