package functionalinterfacetest;

import functionalinterface.HashMapSorter;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HashMapSorterTest
{

    @Test
    public void testSortHashMapByKey() {
        // Creating a HashMap with unsorted elements
        HashMap<Integer, String> unsortedHashMap = new HashMap<>();
        unsortedHashMap.put(3, "apple");
        unsortedHashMap.put(1, "banana");
        unsortedHashMap.put(2, "cherry");

        // Sorting the HashMap by keys
        Map<Integer, String> sortedMap = HashMapSorter.sortHashMapByKey(unsortedHashMap);

        // Asserting the correctness of the sorted map
        assertEquals("{1=banana, 2=cherry, 3=apple}", sortedMap.toString());
    }
}
