package JavaFundamentals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Task1\nВведите x  и y");
        System.out.println();
        Task1.calculateTask1(scanner.nextDouble(),scanner.nextDouble());

        System.out.printf("Task2\nВведите x  и y");
        System.out.println();
        Task2.checkDot(scanner.nextDouble(),scanner.nextDouble());

        System.out.printf("Task3\nВведите начало и конец отрезка, шаг");
        System.out.println();
        Task3.calculateFunction(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());

        System.out.printf("Task4\nВведите количество элементов массива");
        System.out.println();
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n;i++){
            System.out.println("Введите " + i + " элемент массива ");
            array[i] = scanner.nextInt();
        }
        Task4.countPrimeNumbers(array);

        System.out.printf("Task5\nВведите количество элементов последовательности");
        System.out.println();
        int n1 = scanner.nextInt();
        int[] array1 = new int[n1];
        for (int i = 0; i < n1;i++){
            System.out.println("Введите " + i + " элемент последовательности ");
            array1[i] = scanner.nextInt();
        }
        Task5.makeIncreasingSequence(array1);


        System.out.printf("Task6\nВведите количество элементов последовательности");
        System.out.println();
        int n2 = scanner.nextInt();
        double[] array2 = new double[n2];
        for (int i = 0; i < n2;i++) {
            System.out.println("Введите " + i + " элемент последовательности ");
            array2[i] = scanner.nextDouble();
        }
        Task6.calculateMatrix(array2);

        System.out.printf("Task7\nВведите количество элементов массива");
        System.out.println();
        int n3 = scanner.nextInt();
        double[] array3 = new double[n3];
        for (int i = 0; i < n3;i++) {
            System.out.println("Введите " + i + " элемент массива ");
            array3[i] = scanner.nextDouble();
        }
        Task7.shellSort(array3);

        System.out.printf("Task8\nВведите количество элементов  1 массива");
        System.out.println();
        int n4 = scanner.nextInt();
        double[] array4 = new double[n4];
        for (int i = 0; i < n4;i++) {
            System.out.println("Введите " + i + " элемент массива ");
            array4[i] = scanner.nextDouble();
        }
        System.out.printf("Введите количество элементов  2 массива");
        System.out.println();
        int n5 = scanner.nextInt();
        double[] array5 = new double[n5];
        for (int i = 0; i < n5;i++) {
            System.out.println("Введите " + i + " элемент массива ");
            array5[i] = scanner.nextDouble();
        }
        Task8.combineSequences(array4,array5);
    }
}
