package functionalinterface;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListReverser
{
    // Method to reverse an ArrayList
    public static <T> void reverseArrayList(ArrayList<T> list) {
        Collections.reverse(list);
    }
}
