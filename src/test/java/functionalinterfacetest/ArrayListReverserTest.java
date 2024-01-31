package functionalinterfacetest;

import functionalinterface.ArrayListReverser;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayListReverserTest
{
    @Test
    public void testReverseArrayList() {
        // Test case with Integer ArrayList
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);

        ArrayListReverser.reverseArrayList(intList);
        assertEquals("[5, 4, 3, 2, 1]", intList.toString());

        // Test case with String ArrayList
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("cherry");

        ArrayListReverser.reverseArrayList(stringList);
        assertEquals("[cherry, banana, apple]", stringList.toString());
}}
