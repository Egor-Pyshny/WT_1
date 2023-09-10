package task7;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SortTest {

    @Test
    public void sortTest(){
        double[] arr = {9,5,4,2,67,89,1,87,0,5,4,-1};
        double[] result = Sort.sort(arr);
        Arrays.sort(arr);
        assertArrayEquals(arr,result);
    }

}
