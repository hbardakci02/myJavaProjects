package Exception;

import java.util.Scanner;

public class ExceptionUsingThrow {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("You are in the elevator now. Which floor do you want: ");
        int floorNumber = scan.nextInt();

        if (floorNumber > 13) {
            throw new ArithmeticException("This floor is not exist.");
        } else {
            System.out.println("You are in the " + floorNumber + "th floor.");
            System.out.println("Don't worry about if the 'th' part is wrong because I was lazy");
        }

    }
}
