package methods;

import java.util.Scanner;

public class fibonacciRecursive {
    public static void main(String[] args) {
        System.out.println("Which Fibonacci element do you want to know?");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(fibonacciRecursivE(n));

    }

    public static int fibonacciRecursivE(int n) {
        int fibonacci;
        if (n == 0 || n == 1) {
            fibonacci = n;
        } else {
            fibonacci = fibonacciRecursivE(n - 1) + fibonacciRecursivE(n - 2);
        }
        return fibonacci;
    }
}
