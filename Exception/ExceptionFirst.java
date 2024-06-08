package Exception;

import java.util.Scanner;

public class ExceptionFirst {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int b = 10;

        try {
            System.out.println("Enter a number: ");
            int number = scan.nextInt();
            System.out.println(b / number);
        } catch (Exception myMessage) {
            System.out.println("Exception:" + myMessage.getMessage());
            System.out.print("Exception: ");
            myMessage.printStackTrace();
        } finally {
            System.out.println();
            System.out.println("I am finnaly. I will always write this.");
        }

    }
}
