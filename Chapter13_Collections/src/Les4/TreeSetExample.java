package Les4;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> set=new TreeSet<>();
        set.add(5);
        set.add(10);
        set.add(2);
        set.add(8);
        set.add(3);
        System.out.println(set);
        System.out.println(set.higher(2));
        System.out.println(set.subSet(3,8));

    }
}
