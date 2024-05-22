import java.util.Random;
import java.util.Scanner;

public class diceNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        int counter5 = 0;
        int counter6 = 0;

        System.out.print("How many time you want to roll dice ? ");

        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int a = rand.nextInt(1, 7);
            if (a == 1) {
                counter1++;
            } else if (a == 2) {
                counter2++;
            } else if (a == 3) {
                counter3++;
            } else if (a == 4) {
                counter4++;
            } else if (a == 5) {
                counter5++;
            } else if (a == 6) {
                counter6++;
            }
        }
        System.out.println("You rolled 1 " + counter1 + " times ");
        System.out.println("You rolled 2 " + counter2 + " times ");
        System.out.println("You rolled 3 " + counter3 + " times ");
        System.out.println("You rolled 4 " + counter4 + " times ");
        System.out.println("You rolled 5 " + counter5 + " times ");
        System.out.println("You rolled 6 " + counter6 + " times ");
    }
}
