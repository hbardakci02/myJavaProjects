package RandomExample;

import java.util.*;

public class FinalExampleOnline {

    public static void addBirthMonthYear(Map<Integer, Map<String, ArrayList<String>>> hashmap, String name, int year,
            String month) {
        if (!hashmap.containsKey(year)) {
            hashmap.put(year, new HashMap<>());
        }
        Map<String, ArrayList<String>> hashMapSec = hashmap.get(year);

        if (!hashMapSec.containsKey(month)) {
            hashMapSec.put(month, new ArrayList<>());
        }
        hashMapSec.get(month).add(name);
    }

    public static void main(String[] args) {
        Map<Integer, Map<String, ArrayList<String>>> bdMap = new HashMap<>();

        addBirthMonthYear(bdMap, "Ken", 1979, "January");
        addBirthMonthYear(bdMap, "Joseph", 2000, "July");
        addBirthMonthYear(bdMap, "Elijah", 2000, "July");
        addBirthMonthYear(bdMap, "Grace", 2012, "July");
        addBirthMonthYear(bdMap, "Diana", 2012, "July");

        System.out.println(bdMap);
    }
}
