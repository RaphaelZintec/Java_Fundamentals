package Les2;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("jon");
        list.add("deepika");
        list.add("elmaz");
        list.add("mausam");
        list.add("abdulrazak");
        list.add("rutger");

        Iterator itr = list.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

    }
}
