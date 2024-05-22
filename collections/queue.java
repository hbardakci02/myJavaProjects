package collections;

import java.util.*;

public class queue {
    public static void main(String[] args) {
        List<String> myList = List.of("Hüsi", "Ecot", "Moti");
        Queue<String> myQueue = new LinkedList<>(myList);
        myQueue.offer("Bish");
        myQueue.add("Bibi");
        System.out.println(myQueue);

        myQueue.poll();
        System.out.println(myQueue);

        while (!myQueue.isEmpty()) {
            myQueue.remove();
        }
        System.out.println(myQueue);

    }
}
