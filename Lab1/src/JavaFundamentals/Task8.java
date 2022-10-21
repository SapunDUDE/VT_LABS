package JavaFundamentals;

public class Task8 {
    public static void combineSequences(double[] arr1, double[] arr2) {
        int offset = 0;
        boolean isAdded = false;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = offset; j < arr2.length; j++) {
                if (arr2[j] > arr1[i]) {
                    offset = j;
                    System.out.println(arr1[i] + " нужно вставить перед " + arr2[j] );
                    isAdded =true;
                    break;
                }
            }
            if(!isAdded){
                System.out.println(arr1[i] + " нужно вставить в конец");
            }
            isAdded = false;
        }
    }
}
