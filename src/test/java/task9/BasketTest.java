package task9;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class BasketTest {

    @Test
    public void basketTest(){
        ArrayList<Ball> balls = new ArrayList<>();
        balls.add(new Ball(2.5,"red"));
        balls.add(new Ball(5,"blue"));
        balls.add(new Ball(1,"green"));
        balls.add(new Ball(0.1,"blue"));
        balls.add(new Ball(25));
        boolean exception = false;
        try{
            balls.add(new Ball(-2));
        } catch (IllegalArgumentException e){
            exception = true;
        }
        Basket basket = new Basket(balls);
        double weight = basket.getBallsWeight();
        int count = basket.getColoredBalls("blue");
        assertTrue(exception);
        assertEquals(33.6,weight);
        assertEquals(2,count);
    }
}
