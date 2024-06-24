package LastPracticeForFinal;

public class FindRepeat {
    public static void main(String[] args) {

        int[] array = { 1, 1, 1, 2, 3, 5, 5, 6, 6, 6, 6, 43, 34 };

        int maxCount = 0;
        int count = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                count++;
            } else {
                if (count >= maxCount) {
                    maxCount = count;
                    count = 0;
                }
            }
        }

        System.out.println(maxCount);

    }

}
