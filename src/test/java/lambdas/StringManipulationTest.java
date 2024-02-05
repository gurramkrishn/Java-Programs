package lambdas;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class StringManipulationTest
{
    @Test
    public void testCapitalizeAndSortStrings() {
        String[] input = {"apple", "banana", "orange", "grape"};
        String[] expected = {"Apple", "Banana", "Grape", "Orange"};
        assertArrayEquals(expected, StringManipulation.capitalizeAndSortStrings(input));
    }

    @Test
    public void testCapitalizeAndSortStringsEmptyArray() {
        String[] input = {};
        String[] expected = {};
        assertArrayEquals(expected, StringManipulation.capitalizeAndSortStrings(input));
    }

    @Test
    public void testCapitalizeAndSortStringsSingleElementArray() {
        String[] input = {"apple"};
        String[] expected = {"Apple"};
        assertArrayEquals(expected, StringManipulation.capitalizeAndSortStrings(input));
    }
}
