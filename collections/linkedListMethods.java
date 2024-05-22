package collections;

import java.util.*;

public class linkedListMethods {
    public static void main(String[] args) {
        LinkedList<String> listLinked = new LinkedList<String>();
        listLinked.add("Blue");
        listLinked.add("Yellow");
        listLinked.add("Green");
        listLinked.add(2, "Brown");
        System.out.println("Lenght: " + listLinked.size());
        System.out.println("List: " + listLinked);

        listLinked.addFirst("Red");
        listLinked.addLast("Purple");

        listLinked.sort(null);
        System.out.println("List: " + listLinked);

        ListIterator<String> isaret = listLinked.listIterator();

        System.out.println("Last from first: ");
        while (isaret.hasNext()) {
            System.out.println(isaret.next() + " -> ");
        }
    }
}
