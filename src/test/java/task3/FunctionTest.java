package task3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;


public class FunctionTest {

    @Test
    public void functionTest(){
        ArrayList<Data> dataPoints = TangensFunction.calculateFunction(-Math.PI / 2,Math.PI / 2,0.1);
        assertEquals(32, dataPoints.size());
        assertEquals(-1.633123935319537E16, dataPoints.get(0).value, 0.000_000_000_000_001);
        assertEquals(-0.0709148443026521, dataPoints.get(15).value, 0.000_000_000_000_001);
        assertEquals(24.02884157692892, dataPoints.get(31).value, 0.000_000_000_000_001);
    }

}
