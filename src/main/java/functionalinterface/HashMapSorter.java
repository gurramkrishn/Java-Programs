package functionalinterface;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapSorter {

    // Method to sort elements in a HashMap by keys
    public static <K extends Comparable<K>, V> Map<K, V> sortHashMapByKey(HashMap<K, V> hashMap) {
        TreeMap<K, V> sortedMap = new TreeMap<>(hashMap);
        return sortedMap;
    }
}