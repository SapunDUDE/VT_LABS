package JavaFundamentals;

public class Task1 {
    private static double calculateNumerator(double x, double y) {
        return 1 + Math.pow(Math.sin(x + y), 2);
    }

    private static double calculateDenominator(double x, double y) {
        return 2 + Math.abs(x - ((2 * x) / (1 + Math.pow(x, 2) * Math.pow(y, 2))));
    }

    public static void calculateTask1(double x, double y) {
        double result = calculateNumerator(x, y) / calculateDenominator(x, y) + x;
        System.out.printf("Ответ: %.3f ",result);
    }




}
