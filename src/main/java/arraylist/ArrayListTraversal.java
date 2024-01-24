package arraylist;

import java.util.ArrayList;

public class ArrayListTraversal
{
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();

        // Add some elements to the ArrayList
        stringList.add("Element 1");
        stringList.add("Element 2");
        stringList.add("Element 3");
        stringList.add("Element 4");

        // Traverse using a for loop
        System.out.println("Traversing using a for loop:");
        for (int i = 0; i < stringList.size(); i++) {
            String element = stringList.get(i);
            System.out.println("Index " + i + ": " + element);
        }

        // Traverse using an enhanced for loop
        System.out.println("\nTraversing using an enhanced for loop:");
        for (String element : stringList) {
            System.out.println(element);
        }
    }
}
