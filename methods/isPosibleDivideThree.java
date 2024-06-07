package methods;

import java.util.Scanner;

//A problem about array.Null indexs will be delete....
//Now this program unusable and false.
public class isPosibleDivideThree {
    public static void main(String[] args) {
        int total = 0;
        int counter = 0;
        int i = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number you want to be separated: ");
        int input = scan.nextInt();

        int[] dividedByThree = new int[input];
        for (i = 0; i <= input * input; i++) {

            if (input % 3 == 0) {
                dividedByThree[i] = input;
                counter += 1;
            } else {

            }
            input = input - 1;
        }

        for (int j = 0; j < i; j++) {
            System.out.println(dividedByThree[j]);
            total = total + dividedByThree[j];
        }
        System.out.println("Avarage: " + (total / counter));

    }

}