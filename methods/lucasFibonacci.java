package methods;

import java.util.Scanner;

public class lucasFibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int lucas[] = new int[n];
        int fibo[] = new int[n];
        lucas[0] = 2;
        lucas[1] = 1;
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i < n; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
            lucas[i] = lucas[i - 1] + lucas[i - 2];
        }
        System.out.println("Diziler");
        for (int j = 0; j < n; j++) {
            System.out.print(fibo[j] + " ");
        }
        System.out.println();
        for (int j = 0; j < n; j++) {
            System.out.print(lucas[j] + " ");
        }

        scan.close();

    }

}