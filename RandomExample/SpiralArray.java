package RandomExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpiralArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter row number: ");
        int rowNumber = scan.nextInt();
        System.out.println("Enter column number:  ");
        int columnNumber = scan.nextInt();

        int[][] matrix = new int[rowNumber][columnNumber];

        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < columnNumber; j++) {
                System.out.println("Enter Matris elements: ");
                matrix[i][j] = scan.nextInt();
            }
        }

        List<Integer> spiralOrder = getSpiralOrder(matrix);
        System.out.println("Spiral Order: " + spiralOrder);

    }

    public static List<Integer> getSpiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return result;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0;
        int right = cols - 1;
        int top = 0;
        int bottom = rows - 1;

        while (left <= right && top <= bottom) {
            // Sol -> Sağ
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            // Yukarı -> Aşağı
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            // Sağ -> Sol
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // Aşağı -> Yukarı
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;

    }

}
