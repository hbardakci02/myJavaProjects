import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionUUR {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir SAYI Giriniz !!!!");

        try {
            double number = scan.nextInt();
            System.out.println(number);

        } catch (InputMismatchException message) {
            throw new BizSendenSayiIstedikYarram("SAYI girsene!!!!");

        } finally {
            scan.close();

        }
    }
}

class BizSendenSayiIstedikYarram extends RuntimeException {
    public BizSendenSayiIstedikYarram(String message) {
        super(message);
    }

    public String toString() {
        return "BizSendenSayiIstedikYarram: " + getMessage();
    }
}