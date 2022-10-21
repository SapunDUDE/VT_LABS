package JavaFundamentals;

import java.util.Arrays;

public class Task6 {
    public static void calculateMatrix(double[] arr) {
        double[][] matrix = new double[arr.length][arr.length];
        int offset = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = arr[(j + offset) % matrix.length];
            }
            offset++;
        }
        showMatrix(matrix);
    }

    private static void showMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("%.3f ",matrix[i][j]);
            }
            System.out.println();
        }
    }
}

