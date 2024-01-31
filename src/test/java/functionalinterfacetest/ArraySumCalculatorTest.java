package functionalinterfacetest;

import functionalinterface.ArraySumCalculator;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraySumCalculatorTest {
    @Test
    public void testCalculateArraySum() {
        // Test case with positive numbers
        int[] array1 = {1, 2, 3, 4, 5};
        assertEquals(15, ArraySumCalculator.calculateArraySum(array1));

        // Test case with negative numbers
        int[] array2 = {-1, -2, -3, -4, -5};
        assertEquals(-15, ArraySumCalculator.calculateArraySum(array2));

        // Test case with mixed positive and negative numbers
        int[] array3 = {-1, 2, -3, 4, -5};
        assertEquals(-3, ArraySumCalculator.calculateArraySum(array3));

    }
}