package lambdas;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class RemoveDuplicatesTest
{
    @Test
    public void testRemoveDuplicates() {
        List<Integer> input = Arrays.asList(1, 2, 3, 3, 4, 5, 5, 6);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6);
        assertEquals(expected, RemoveDuplicates.removeDuplicates(input));
    }

    @Test
    public void testRemoveDuplicatesWithEmptyList() {
        List<Integer> input = Arrays.asList();
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, RemoveDuplicates.removeDuplicates(input));
    }

    @Test
    public void testRemoveDuplicatesWithAllDuplicates() {
        List<Integer> input = Arrays.asList(1, 1, 1, 1, 1);
        List<Integer> expected = Arrays.asList(1);
        assertEquals(expected, RemoveDuplicates.removeDuplicates(input));
    }

    @Test
    public void testRemoveDuplicatesWithNoDuplicates() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(expected, RemoveDuplicates.removeDuplicates(input));
    }
}
