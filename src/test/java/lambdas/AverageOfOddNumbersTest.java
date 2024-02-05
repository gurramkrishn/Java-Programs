package lambdas;

import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class AverageOfOddNumbersTest {
    @Test
    public void testAverageOfSquaresOfOddNumbers() {
        int[] input = {1, 2, 3, 4, 5};
        double expected = (1 * 1 + 3 * 3 + 5 * 5) / 3.0;
        assertEquals(expected, AverageOfOddNumbers.averageOfSquaresOfOddNumbers(input), 0.001);
    }

    @Test
    public void testAverageOfSquaresOfOddNumbersNoOddNumbers() {
        int[] input = {2, 4, 6};
        assertEquals(0, AverageOfOddNumbers.averageOfSquaresOfOddNumbers(input), 0.001);
    }

    @Test
    public void testAverageOfSquaresOfOddNumbersEmptyArray() {
        int[] input = {};
        assertEquals(0, AverageOfOddNumbers.averageOfSquaresOfOddNumbers(input), 0.001);
    }
}
