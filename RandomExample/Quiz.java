package RandomExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Quiz {
    public static void main(String[] args) {
        HashMap<String, Integer> myThing1 = new HashMap<>();
        HashMap<String, Integer> myThing2 = new HashMap<>();

        String[] myMonths = { "May", "June", "May", "July", "May", "May", "May" };
        int[] myDays = { 20, 20, 20, 20, 19, 19, 19 };
        for (int i = 0; i < myMonths.length; i++) {
            System.out.println("Adding " + myMonths[i] + " - " + myDays[i]);
            System.out.println(isDuplicate(myThing1, myMonths[i], myDays[i]));
            // System.out.println(countSoFar(myThing2, myMonths[i], myDays[i]));

        }

    }

    public static boolean isDuplicate(Map<String, Integer> hashmap, String month, int date) {

        if (hashmap.containsKey(month)) {
            if (hashmap.get(month) == date) {
                return true;
            } else {
                hashmap.put(month, date);
                return false;
            }
        } else {
            hashmap.put(month, date);
            return false;
        }
    }

    // public static int countSoFar(Map<String, Integer> hashMap, String month, int
    // day) {

    // }
}