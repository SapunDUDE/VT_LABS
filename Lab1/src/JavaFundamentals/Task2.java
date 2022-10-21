package JavaFundamentals;

public class Task2 {
    private static boolean isDotInZone(double x, double y) {

        if ((y >= 0) && (y <= 5)) {
            return (((x >= -4) && (x <= 4)) ? true : false);
        } else if ((y <= 0) && (y >= -3)) {
            return (((x >= -6) && (x <= 6)) ? true : false);
        }
        return false;
    }

    public static void checkDot(double x, double y) {
        System.out.println((isDotInZone(x,y)?"Точка попадает в зону":"Точка не входит в зону"));
    }
}
