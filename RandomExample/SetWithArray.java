package RandomExample;

import java.util.Arrays;

public class SetWithArray {
    public static void main(String[] args) {
        int[] set = new int[1];
        set = addItem(set, 1);
        set = addItem(set, 2);
        set = addItem(set, 3);
        set = addItem(set, 4);
        System.out.println(countItems(set));
        System.out.println(listItems(set));
        set = addItem(set, 5);
        set = addItem(set, 3);
        set = addItem(set, 1);
        System.out.println(countItems(set));
        System.out.println(listItems(set));
    }

    public static int[] addItem(int[] itemArray, int item) {

        for (int i = 0; i < itemArray.length; i++) {
            if (itemArray[i] == item) {
                return itemArray;
            }
        }
        int[] newArray = new int[itemArray.length + 1];
        for (int i = 0; i < itemArray.length; i++) {
            newArray[i] = itemArray[i];
        }
        newArray[newArray.length - 1] = item;
        return newArray;

    }

    public static int countItems(int[] itemArray) {
        return itemArray.length;
    }

    public static String listItems(int[] itemArray) {
        return Arrays.toString(itemArray);
    }
}
