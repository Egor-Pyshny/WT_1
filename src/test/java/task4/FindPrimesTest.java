package task4;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class FindPrimesTest {

    @Test
    public void findPrimesTest(){
        int[] arr = {0, 1, 853, 2, 997, -5, 5465, 456, 5449, 8};
        ArrayList<Integer> indexes = FindPrimes.findPrimes(arr);
        assertEquals(5,indexes.size());
        assertTrue(indexes.contains(2));
        assertTrue(indexes.contains(4));
        assertTrue(indexes.contains(8));
        assertFalse(indexes.contains(1));
        assertTrue(indexes.contains(3));
        assertFalse(indexes.contains(9));
    }
}
