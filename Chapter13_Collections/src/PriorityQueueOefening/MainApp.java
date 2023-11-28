package PriorityQueueOefening;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        Queue<BurgerOrder> linkedList = new LinkedList<>();
        linkedList.offer(new BurgerOrder(2,"Bob"));
        linkedList.offer(new BurgerOrder(4,"Stefan"));
        linkedList.offer(new BurgerOrder(5,"Mia"));
        linkedList.offer(new BurgerOrder(1,"Tom"));
        linkedList.offer(new BurgerOrder(3,"Paul"));

        BurgerOrder bgTemp;
        while ((bgTemp = linkedList.poll()) != null)
            System.out.println(bgTemp);

        System.out.println();

        Queue<BurgerOrder> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(new BurgerOrder(2,"Bob"));
        priorityQueue.offer(new BurgerOrder(4,"Stefan"));
        priorityQueue.offer(new BurgerOrder(5,"Mia"));
        priorityQueue.offer(new BurgerOrder(1,"Tom"));
        priorityQueue.offer(new BurgerOrder(3,"Paul"));

        BurgerOrder bgTemp2;
        while ((bgTemp2 = priorityQueue.poll()) != null)
            System.out.println(bgTemp2);


    }
}
