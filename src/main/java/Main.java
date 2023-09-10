import task9.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Ball> balls = new ArrayList<>();
        balls.add(new Ball(2.5,"red"));
        balls.add(new Ball(5,"blue"));
        balls.add(new Ball(1,"green"));
        balls.add(new Ball(0.1,"blue"));
        balls.add(new Ball(2.849,"blue"));
        Basket basket = new Basket(balls);
        System.out.format("Blue balls: %d\n", basket.getColoredBalls("blue"));
        System.out.format("Weight: %.3f", basket.getBallsWeight());
    }

}