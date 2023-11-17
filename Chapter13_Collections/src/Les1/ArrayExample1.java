package Les1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayExample1 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("nina");
        list.add("jana");
        list.add("maxime");
        list.add("haytam");
        list.add("abdu");
        list.add("raphael");

        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
