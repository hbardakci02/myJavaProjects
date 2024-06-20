package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddEvenAlgorithm {
    public static void main(String[] args) {

        System.out.println("Enter a array size: ");
        Scanner scan = new Scanner(System.in);
        int sizeOrder = scan.nextInt();
        int[] array = new int[sizeOrder];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter array's elements: ");
            array[i] = scan.nextInt();
        }
        scan.close();

        List<Integer> listOdd = new ArrayList<>();
        List<Integer> listEven = new ArrayList<>();

        for (int nums : array) {
            if (nums % 2 == 0) {
                listEven.add(nums);
            } else {
                listOdd.add(nums);
            }
        }

        for (int num : listEven) {
            listEven.add(listEven.get(num) * listEven.get(num));
            listEven.remove(num);
        }
        for (int num : listOdd) {
            listOdd.add(listOdd.get(num) * listOdd.get(num));
            listOdd.remove(num);
        }
        System.out.println(listEven);
        System.out.println(listOdd);
    }

}
