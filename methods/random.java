import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        int tahmin, sayac = 0, puan = 100;
        Scanner tara = new Scanner(System.in);

        int tut = (1 + (int) (Math.random() * 100));

        System.out.println("İlk tahmininiz?");
        do {
            tahmin = tara.nextInt();
            sayac++;
            if (tut == tahmin) {
                System.out.println(tut + " sayısını " + sayac + " tahminde bildiniz. Puanınız: " + puan);
            } else if (tahmin < tut) {
                System.out.println("Tuttuğum sayı daha büyük bir sayı!!");

            } else if (tahmin > tut) {
                System.out.println("Tuttuğum sayı daha küçük bir sayı");
            }
            puan -= 10;
        } while (tahmin != tut);
        tara.close();
    }

}