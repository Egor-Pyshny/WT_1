package task9;

public class Ball {

    public double weight;
    public String color;

    public Ball(double weight) {
        if(weight>0) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("negative or zero weight");
        }
        this.color = "";
    }

    public Ball(double weight, String color) {
        this.weight = weight;
        this.color = color;
    }
}
