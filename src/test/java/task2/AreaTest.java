package task2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AreaTest {

    @ParameterizedTest(name = "Test {index}: x = {0} and y = {1}")
    @CsvSource({
            "0, 0, True",
            "-5, 0, True",
            "-5, 2, False",
            "0, 3, True",
            "5, 0, True",
            "5, 2, False",
            "-2, 0, True",
            "0, -5, False",
    })
    public void areaTest(double x, double y, boolean answer) {
        assertEquals(answer, Area.internalPoint(x, y));
    }
}
