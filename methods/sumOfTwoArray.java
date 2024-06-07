package methods;

public class sumOfTwoArray {
    public static void main(String[] args) {
        int array1[][] = { { 1, 2, 3 }, { 4, 5, 6, }, { 7, 8, 9, } };
        int array2[][] = { { 1, 2, 3 }, { 4, 5, 6, }, { 7, 8, 9, } };
        int array3[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array3[i][j] = array1[i][j] + array2[i][j];
                System.out.println(array3[i][j]);

            }
        }

    }
}
