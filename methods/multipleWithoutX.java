import java.util.Scanner;

public class multipleWithoutX {
    public static void main(String[] args) {
        double firstNumber, second;
        Scanner scan = new Scanner(System.in);
        System.out.println("Type first number");
        firstNumber = scan.nextInt();
        System.out.println("Type second number");
        second = scan.nextInt();
        System.out.println(multipleWithOut(firstNumber, second));

        scan.close();
    }

    public static double multipleWithOut(double firstNumber, double second) {
        double result = 0;

        for (int i = 0; i < second; i++) {
            result += firstNumber;
        }
        return result;
    }

}
