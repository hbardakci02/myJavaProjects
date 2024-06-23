package Exception;

import java.util.Scanner;

public class ExceptionNumberNegative {
    public static void main(String[] args) throws NegativeNumberException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive integer.");

        int number = scan.nextInt();
        if (number < 0) {
            throw new NegativeNumberException("Number can not be negative.");
        }

    }

}

class NegativeNumberException extends RuntimeException {
    public NegativeNumberException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "NegativeNumberException: " + getMessage();
    }
}
