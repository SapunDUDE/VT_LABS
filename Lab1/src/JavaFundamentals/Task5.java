package JavaFundamentals;

import java.util.ArrayList;
import java.util.Arrays;

public class Task5 {
    public static void makeIncreasingSequence(int[] arr) {
        ArrayList<Integer> resultSequence = new ArrayList<Integer>();
        int prevNumber = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= prevNumber) {
                resultSequence.add(arr[i]);
                prevNumber = arr[i];
            }
        }
        int k = arr.length - resultSequence.size() - 1 ;
        System.out.println("Для того, чтобы последовательность стала возрастающей, необходимо удалить " + k + " элементов");
    }
}
