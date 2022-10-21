package ClassesAndObjects.Task9;

import java.util.ArrayList;

public class Bascet {
    public static ArrayList<Ball> balls = new ArrayList<Ball>();
    private static int totalWeight;

    public int getTotalWeight() {
        return totalWeight;
    }

    public static void calculateTotalWeight() {
        for (Ball curBall : balls) {
            totalWeight += curBall.getWeight();
        }
        System.out.println("Общий вес всех мячиков = " + totalWeight);
    }

    static public int calculateBlueBallsAmount() {
        int blueBallsCounter = 0;
        for (Ball curBall : balls) {
            if(curBall.getColor() == "Blue")
                blueBallsCounter++;
        }
        return blueBallsCounter;
    }


}
