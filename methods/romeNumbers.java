package methods;

import java.util.Scanner;

public class romeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(romenNum(number));
        scan.close();
    }

    public static String romenNum(int number) {
        int numbers[] = { 1000, 500, 100, 50, 10, 5, 1 };
        String romenChars[] = { "N", "D", "C", "L", "X", "V", "I" };
        String roma = "";

        for (int i = 0; i < romenChars.length; i++) {
            while (number >= numbers[i]) {
                roma = roma + romenChars[i];
                number = number - numbers[i];
            }
        }

        return roma;

    }
}
