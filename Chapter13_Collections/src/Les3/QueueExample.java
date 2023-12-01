package Les3;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Alice");
        queue.offer("Bob");
        queue.offer("Charlie");

        System.out.println("Queue: "+queue);

        String frontElement = queue.peek();
        System.out.println(frontElement);

        String removedElement = queue.poll();
        System.out.println("Removed element"+ removedElement);
        System.out.println("Updated Queue "+ queue);

        System.out.println("is queue empty "+queue.isEmpty());
        System.out.println("Size of queue "+queue.size());
    }
}
