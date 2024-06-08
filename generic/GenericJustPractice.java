package generic;

import java.util.*;

public class GenericJustPractice {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("ArrayList 1");
        arrayList.add("ArrayList 2");
        arrayList.add("ArrayList 3");
        printList(arrayList);

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "HashMap 1");
        hashMap.put(2, "HashMap 2");
        hashMap.put(3, "Hashmap 3");
        printMap(hashMap);

        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("HashSet 1");
        hashSet.add("HashSet 2");
        hashSet.add("HashSet 3");
        printSet(hashSet);

        LinkedList<String> list = new LinkedList<>();
        list.add("Li");

    }

    public static <T> void printList(List<T> list) {
        for (T element : list) {
            System.out.println(element);
        }
    }

    public static <T> void printSet(Set<T> set) {
        for (T element : set) {
            System.out.println(set);
        }
    }

    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> element : map.entrySet()) {
            System.out.println("Key: " + element.getKey() + " Value: " + element.getValue());
        }
    }
}
