import java.util.Scanner;

public class leastCommonMultiple {
    public static void main(String[] args) {

        int okek = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("First Number: ");
        int number1 = scan.nextInt();
        System.out.println("Second Number: ");
        int number2 = scan.nextInt();

        okek = (number1 * number2) / (greatestDiv(number1, number2));
        System.out.println("Least Common Multiple: " + okek);
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
