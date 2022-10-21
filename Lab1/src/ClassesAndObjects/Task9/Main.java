package ClassesAndObjects.Task9;


public class Main {
    public static void main(String[] args) {
        Ball ball1 = new Ball(4,"Blue");
        Ball ball2 = new Ball(7,"Red");
        Ball ball3 = new Ball(3,"Purple");
        Ball ball4 = new Ball(3,"Blue");
        Ball ball5 = new Ball(4,"Orange");
        Ball ball6 = new Ball(1,"Blue");
        Ball ball7 = new Ball(2,"Blue");

        Bascet.calculateTotalWeight();
        System.out.println();
        System.out.println("Количесвто синих мячиков:" + Bascet.calculateBlueBallsAmount());
    }


}
