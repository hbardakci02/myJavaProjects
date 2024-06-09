
import java.util.Scanner;

public class ExceptionCheckAGe {
    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner scan = new Scanner(System.in);

        try {
            int age = scan.nextInt();
            if (age < 18) {
                throw new ExceptionAge("Age can not be less than eighteen");
            }
        } catch (ExceptionAge e) {
            System.out.println(e);

        } finally {
            scan.close();
        }
    }

}

class ExceptionAge extends RuntimeException {
    public ExceptionAge(String message) {
        super(message);
    }

    public String toString() {
        return "ExceptionAge: " + getMessage();
    }
}