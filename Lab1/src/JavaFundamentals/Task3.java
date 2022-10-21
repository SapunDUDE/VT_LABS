package JavaFundamentals;

public class Task3 {
    public static void calculateFunction(int a, int b, int h) {
        for (int x = a; x <= b; x += h) {
            showRowOfTable(x,Math.tan(x));
        }
    }

    private static void showRowOfTable(int x, double F) {
        System.out.printf("x = %d  F = %.3f",x,F);
        System.out.println();
    }
}
