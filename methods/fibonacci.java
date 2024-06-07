package methods;

public class fibonacci {
    public static void main(String[] args) {
        double start = 0;
        double counter = 0;
        double firstNum = 1;
        double secondNum = 1;

        do {
            System.out.println(" " + secondNum);
            secondNum = firstNum + start;
            start = firstNum;
            firstNum = secondNum;
            counter++;
        } while (counter <= 15);
        double fi = (float) firstNum / start;
        System.out.println(fi);
    }
}
