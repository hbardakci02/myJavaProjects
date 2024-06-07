package methods;

import java.util.Scanner;

public class divisorsNumbers {
    public static void main(String[] args) {
        int number;
        Scanner tara = new Scanner(System.in);
        System.out.print("Type the number whose exact divisors you want to find: ");
        number = tara.nextInt();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i + " ");
            }
        }
        tara.close();
    }
}
