package collections;

import java.util.*;

public class arrayListMethods {
    public static void main(String[] args) {
        List<String> name = new ArrayList<String>();
        name.add("hüseyin");
        name.add("ecot");
        name.add("moti cocuk");
        name.add(1, "bish");

        System.out.println("Size: " + name.size());
        System.out.println("List: " + name);
        System.out.println("First index: " + name.get(0));

        name.remove(0);
        System.out.println("New list after remove first index: " + name);

        boolean isIn = name.contains("hüseyin");
        System.out.println(isIn);

        name.clear();
        System.out.println("After clear list: ");
    }
}