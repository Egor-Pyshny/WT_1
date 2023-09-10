package task6;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class CreateMatrixTest {

    @Test
    public void createMatrixTest(){
        double[] arr = {1,2,3,4,5};
        double[][] matrix = CreateMatrix.createMatrix(arr,arr.length);
        double[][] expected = {
                {1,2,3,4,5},
                {2,3,4,5,1},
                {3,4,5,1,2},
                {4,5,1,2,3},
                {5,1,2,3,4},
        };
        assertArrayEquals(expected, matrix);
    }
}
