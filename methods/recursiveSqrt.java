import java.util.Scanner;

public class recursiveSqrt {
    public static void main(String[] args) {
        int up, down;
        Scanner scan = new Scanner(System.in);
        System.out.println("Write the base number: ");
        down = scan.nextInt();
        System.out.println("Write the Upper number: ");
        up = scan.nextInt();
        System.out.println();
        System.out.println(sqrt(down, up));

    }

    public static int sqrt(int down, int up) {
        if (up == 0) {
            return 1;
        } else
            return down * sqrt(down, up - 1);
    }
}
