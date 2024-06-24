import java.util.Arrays;

public class practice {
    public static void main(String[] args) {

        int[] numbers = { 1, 2, 5, 4, 3 };
        int[] copiedNumbers = Arrays.copyOf(numbers, 3);
        System.out.println(Arrays.toString(copiedNumbers)); // [1, 2, 3]

    }
}
