package methods;

public class yılSonuNotu {

    public static void main(String[] args) {
        System.out.println(sonNot(0, 0, 30, 30, 84, 78, 46, 70));
    }

    public static int sonNot(int quiz1, int quiz2, int quiz3, int quiz4, int ödev, int katılım, int vize, int final1) {

        int quizler = (quiz1 + quiz2 + quiz3 + quiz4) / 40;
        int sonNot = (quizler) + (ödev / 5) + (katılım / 10) + (vize / 5) + ((final1 / 10) * 4);

        return sonNot;
    }

}
