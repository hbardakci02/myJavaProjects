package Arrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UnifiedArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Kullanıcıdan dizileri alma
        System.out.println("Birinci dizinin eleman sayısını girin:");
        int size1 = scan.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Birinci dizinin elemanlarını girin:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scan.nextInt();
        }

        System.out.println("İkinci dizinin eleman sayısını girin:");
        int size2 = scan.nextInt();
        int[] array2 = new int[size2];
        System.out.println("İkinci dizinin elemanlarını girin:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scan.nextInt();
        }

        Set<Integer> arraySet = new HashSet<Integer>();

        for (int numbers : array1) {
            arraySet.add(numbers);
        }
        for (int number : array2) {
            arraySet.add(number);
        }

        Set<Integer> duplicateElements = new HashSet<Integer>();
        for (int number1 : array1) {
            for (int number2 : array2) {
                if (number2 == number1) {
                    duplicateElements.add(number2);
                }
            }
        }

        System.out.println(arraySet);
        System.out.println(duplicateElements);

    }
}