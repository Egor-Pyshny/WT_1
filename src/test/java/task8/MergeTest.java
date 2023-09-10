package task8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeTest {

    @Test
    public void mergeTest(){
        double[] a = new double[]{1,1,5,9,80,100};
        double[] b = new double[]{0,2,6,90,110,120};
        int[] indexes = Merge.indexes(a, b, true);
        assertArrayEquals(new int[]{0,3,5,8,10,11}, indexes);
        indexes = Merge.indexes(a, b, false);
        assertArrayEquals(new int[]{0,2,3,5,6,6}, indexes);
    }
}
