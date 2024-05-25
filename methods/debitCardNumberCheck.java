import java.util.Scanner;

public class debitCardNumberCheck {
    public static void main(String[] args) {
        int total = 0;
        int cardNumberArray[] = new int[16];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your card number: ");
        String cardNumber = scan.nextLine();

        for (int i = 0; i < cardNumberArray.length; i++) {
            char cardChar = cardNumber.charAt(i);
            if (cardChar < 0 || cardChar > 9) {
                cardNumberArray[i] = cardChar;
            } else {
                System.out.println("Invalid card number: ");
            }
        }
        for (int j = 0; j < cardNumberArray.length; j += 2) {
            cardNumberArray[j] = cardNumberArray[j] * 2;
            if (cardNumberArray[j] > 9) {
                cardNumberArray[j] = cardNumberArray[j] % 10 + cardNumberArray[j] / 10;
            }
        }

        for (int i = 0; i < cardNumberArray.length; i++) {
            total += cardNumberArray[i];
        }
        if (total % 10 == 0) {
            System.out.println("Card number is valid: ");
        } else {
            System.out.println("Card number is Invalid: ");

        }

    }

}
