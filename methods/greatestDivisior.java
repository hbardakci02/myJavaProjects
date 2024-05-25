import java.util.Scanner;

public class greatestDivisior {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("First Number: ");
        int number1 = scan.nextInt();
        System.out.println("Second Number: ");
        int number2 = scan.nextInt();
        int controller = greatestDiv(number1, number2);

        if (controller == 1) {
            System.out.println("Prime numbers among them");
        } else {
            System.out.println("The Greatest divisior: " + controller);
        }

        scan.close();
    }

    public static int greatestDiv(int number1, int number2) {
        int smallest = 0;

        if (number1 > number2) {
            smallest = number2;
        } else {
            smallest = number1;
        }
        while ((number1 % smallest != 0) || (number2 % smallest != 0)) {
            smallest--;
        }
        return smallest;
    }

}
