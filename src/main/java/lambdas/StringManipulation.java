package lambdas;

import java.util.Arrays;

public class StringManipulation
{
    public static String[] capitalizeAndSortStrings(String[] strings) {
        // Capitalize the first letter of each string using lambda expression
        Arrays.setAll(strings, i -> strings[i].substring(0, 1).toUpperCase() + strings[i].substring(1));

        // Sort the strings in alphabetical order
        Arrays.sort(strings);

        return strings;
    }
}
