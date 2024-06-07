package methods;

public class armstrongNumber {
    public static void main(String[] args) {
        double a, b, c = 0;
        double cube, number;

        for (a = 1; a <= 9; a++) {
            for (b = 0; b <= 9; b++) {
                for (c = 0; c <= 9; c++) {
                    number = 100 * a + 10 * b + c;
                    cube = Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3);
                    if (number == cube) {
                        System.out.println(number);
                    }

                }
            }
        }
    }
}
