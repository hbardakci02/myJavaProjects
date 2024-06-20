package Arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class OrderArrays {
    public static void main(String[] args) {
        System.out.println("Enter a array size: ");
        Scanner scan = new Scanner(System.in);
        int sizeOrder = scan.nextInt();
        int[] arrayOrder = new int[sizeOrder];
        for (int i = 0; i < arrayOrder.length; i++) {
            System.out.println("Enter array's elements: ");
            arrayOrder[i] = scan.nextInt();
        }

        Set<Integer> TreeSetOrder = new TreeSet<Integer>();
        for (int numberOrder : arrayOrder) {
            TreeSetOrder.add(numberOrder);
        }

        int[] arrayOrderResult = new int[TreeSetOrder.size()];
        int index = 0;

        for (int num : TreeSetOrder) {
            arrayOrderResult[index++] = num;
        }

        System.out.println(Arrays.toString(arrayOrderResult));

        scan.close();
    }

}
