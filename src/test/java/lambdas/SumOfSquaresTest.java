package lambdas;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class SumOfSquaresTest
{

    @Test
    public void testSumOfSquares() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(55, SumOfSquares.sumOfSquares(input));
    }

    @Test
    public void testSumOfSquaresWithNegativeNumbers() {
        List<Integer> input = Arrays.asList(-1, 2, -3, 4, -5);
        assertEquals(30, SumOfSquares.sumOfSquares(input));
    }

    @Test
    public void testSumOfSquaresWithAllNegativeNumbers() {
        List<Integer> input = Arrays.asList(-1, -2, -3, -4, -5);
        assertEquals(0, SumOfSquares.sumOfSquares(input));
    }

    @Test
    public void testSumOfSquaresWithEmptyList() {
        List<Integer> input = Arrays.asList();
        assertEquals(0, SumOfSquares.sumOfSquares(input));
    }
}
