package arraylist;

import java.util.ArrayList;

public class RemoveLastObject
{
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();

        // Add some elements to the ArrayList
        stringList.add("Element 1");
        stringList.add("Element 2");
        stringList.add("Element 3");
        stringList.add("Element 4");

        System.out.println("Original ArrayList: " + stringList);

        // Check if the ArrayList is not empty before removing the last object
        if (!stringList.isEmpty()) {
            // Remove the last object
            stringList.remove(stringList.size() - 1);
            System.out.println("After removing the last object: " + stringList);
        } else {
            System.out.println("ArrayList is empty, nothing to remove.");
        }
    }
}
