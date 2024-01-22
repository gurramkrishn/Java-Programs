package strings;

import java.util.Scanner;

public class CountVowels
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string from the user
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        // Count the number of vowels
        int vowelCount = countVowels(inputString);

        // Display the result
        System.out.println("Number of vowels in the string: " + vowelCount);
    }

    // Function to count vowels in a string
    private static int countVowels(String str) {
        int count = 0;
        // Convert the string to lowercase to handle both upper and lower case vowels
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }
}
