package LinkedListOefeningen;

import java.util.Iterator;
import java.util.LinkedList;

public class Oef3<T> extends LinkedList{
    public static void main(String[] args) {
        Oef3<Integer> list = new Oef3<Integer>();
        list.add(5);
        list.add(10);
        list.add(20);

        list.printList();   System.out.println();
        list.printSum();    System.out.println();
        list.printAverage();
    }

    public void printList(){
        Iterator itr = this.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }
    public void printSum(){
        System.out.println(this.stream().mapToInt(n-> (int) n).sum());
    }
    public void printAverage(){
        System.out.println( this.stream().mapToInt(n-> (int) n).average().getAsDouble());
    }
}
