package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionSqrt {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter a number: ");
        int mumber = takeNumber();
        System.out.println("Square Root: " + mumber * mumber);
    }

    public static int takeNumber() {

        while (true) {

            try {
                return scan.nextInt();
            } catch (IllegalArgumentException illegalArg) {
                System.out.println(illegalArg.getMessage());
                System.out.println(illegalArg.toString());
                illegalArg.printStackTrace();
            } catch (InputMismatchException inputMatch) {
                System.out.println(inputMatch.getMessage());
                System.out.println(inputMatch.toString());
                inputMatch.printStackTrace();
                System.out.println();
                System.out.println("TRY AGAIN");
                scan.next();
            }
        }

    }

}
