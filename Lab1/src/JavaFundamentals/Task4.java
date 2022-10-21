package JavaFundamentals;

import java.time.chrono.IsoChronology;

public class Task4 {
    public static void countPrimeNumbers(int[] arr) {
        int primeCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!isPrime(arr[i])) {
                System.out.println("Число с индексом " + i + " = " + arr[i] + " не является простым;");
                primeCounter++;
            }
        }
        System.out.println((primeCounter == 0) ? "в массиве нет простых чисел" : "в массиве " + primeCounter + " простых чисел");
    }

    private static boolean isPrime(int num) {
        if (num == 2) {
            return true;
        } else if (num == 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if ((num % i) == 0) {
                return false;
            }
        }
        return true;
    }

}
