package task9;

import java.util.ArrayList;
import java.util.Collection;

public class Basket {

    private ArrayList<Ball> basket;

    public Basket() {
        basket = new ArrayList<>();
    }

    public Basket(Collection<Ball> collection) {
        basket = new ArrayList<>(collection);
    }

    public void addBall(Ball ball) {
        basket.add(ball);
    }

    public double getBallsWeight() {
        double weight = 0;
        for(var ball: basket) {
            weight += ball.weight;
        }
        return weight;
    }

    public int getColoredBalls(String color) {
        int count = 0;
        for(var ball: basket) {
            if(ball.color.equals(color))
                count++;
        }
        return count;
    }

}
