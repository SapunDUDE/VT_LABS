package JavaFundamentals;

import java.util.ArrayList;
import java.util.Arrays;

public class Task7 {
    public static void shellSort(double[] arr) {
        double tmp;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                tmp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = tmp;
                if (i != 0) {
                    i -= 2;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
