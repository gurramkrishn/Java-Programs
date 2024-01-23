package strings;

import java.util.Arrays;

public class AnagramChecker
{
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        boolean areAnagrams = checkAnagrams(str1, str2);
        if (areAnagrams) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }

    // Function to check if two strings are anagrams
    private static boolean checkAnagrams(String str1, String str2) {
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}
