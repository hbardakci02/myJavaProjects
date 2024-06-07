package methods;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int firstNumber, second;
        String operator;
        Scanner scan = new Scanner(System.in);
        System.out.println("Type first number");
        firstNumber = scan.nextInt();
        System.out.println("Type second number");
        second = scan.nextInt();
        System.out.println("Operator(-,+,*,/)");
        operator = scan.next();
        System.out.println(calculate(firstNumber, second, operator));
        scan.close();
    }

    public static double calculate(int firstNumber, int second, String operator) {
        double result;
        switch (operator) {
            case "+":
                result = firstNumber + second;
                break;

            case "*":

                result = firstNumber * second;
                break;

            case "-":
                result = firstNumber - second;
                break;

            case "/":
                result = firstNumber / second;
                break;
            default:
                result = 0;
                break;
        }
        return result;
    }

}