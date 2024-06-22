package RandomExample;

import java.util.Arrays;

public class ShopArray {
    public static void main(String[] args) {
        double totalPr = 0;
        double max = 0;
        double min = 0;
        double[] price = { 1200, 3000, 4500, 2000, 999, 123 };

        for (int i = 0; i < price.length; i++) {
            if (price[i] > max) {
                max = price[i];
            }
            if (price[i] < min) {
                min = price[i];
            }
            totalPr += price[i];

            if (price[i] < (totalPr / price.length)) {

                System.out.println("Ortalamadan düşük: " + price[i]);
            }
        }
        Arrays.sort(price);
        System.out.println("Artan sirada: " + Arrays.toString(price));

    }
}
