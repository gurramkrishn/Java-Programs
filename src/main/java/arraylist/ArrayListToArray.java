package arraylist;

import java.util.ArrayList;

public class ArrayListToArray
{
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();

        // Add some elements to the ArrayList
        stringList.add("Element 1");
        stringList.add("Element 2");
        stringList.add("Element 3");
        stringList.add("Element 4");

        // Convert ArrayList to an array
        String[] stringArray = new String[stringList.size()];
        stringArray = stringList.toArray(stringArray);

        // Print the elements of the array
        System.out.println("Converted Array:");
        for (String element : stringArray) {
            System.out.println(element);
        }
    }
}
