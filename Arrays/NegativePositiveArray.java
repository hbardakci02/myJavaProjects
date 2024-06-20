package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NegativePositiveArray {
    public static void main(String[] args) {

        System.out.println("Enter an array size: ");
        Scanner scan = new Scanner(System.in);
        int pnsize = scan.nextInt();
        int[] pnarray = new int[pnsize];
        List<Integer> listPositive = new ArrayList<Integer>();
        List<Integer> listNegative = new ArrayList<Integer>();

        for (int i = 0; i < pnarray.length; i++) {
            System.out.print("Enter elements: ");
            pnarray[i] = scan.nextInt();
        }
        scan.close();

        for (int number : pnarray) {
            if (number < 0) {
                listNegative.add(number);
            } else {
                listPositive.add(number);
            }
        }

        Collections.sort(listNegative);
        Collections.sort(listPositive);
        System.out.println(listNegative);
        System.out.println(listPositive);
    }
}
