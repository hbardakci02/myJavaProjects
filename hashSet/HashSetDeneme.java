package hashSet;

import java.util.Set;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.HashMap;

public class HashSetDeneme {
    public static void main(String[] args) {
        // HashSet nesnesi oluştur
        Set<String> hashSet = new LinkedHashSet<>();

        // HashSet'e 10 adet eleman ekle
        hashSet.add("Elma");
        hashSet.add("Armut");
        hashSet.add("Muz");
        hashSet.add("Portakal");
        hashSet.add("Kiraz");
        hashSet.add("Üzüm");
        hashSet.add("Karpuz");
        hashSet.add("Erik");
        hashSet.add("Kivi");
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put(null, null);
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        System.out.println(hashSet);

        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}