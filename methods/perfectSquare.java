import java.util.Scanner;

public class perfectSquare {
    public static void main(String[] args) {
        int A, B, C;
        System.out.println("What is your number for check square? ");
        A = new Scanner(System.in).nextInt();
        B = (int) Math.sqrt(A);
        C = B * B;
        if (A == C) {
            System.out.println("The number is perfect square.");
        } else {
            System.out.println("The number is not perfect square. ");
        }

    }

}