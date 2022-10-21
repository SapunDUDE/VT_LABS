package ClassesAndObjects.Task9;

public class Ball {
    private int weight;
    private String color;

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public Ball(int weight, String color) {
        this.weight = weight;
        this.color = color;
        Bascet.balls.add(this);
    }
}
