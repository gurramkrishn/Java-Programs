package strings;

import java.util.StringTokenizer;

public class ReverseWordsInSentence
{
    public static void main(String[] args) {
        String inputSentence = "Java J2EE Reverse Me";
        String reversedSentence = reverseWords(inputSentence);
        System.out.println("Input: " + inputSentence);
        System.out.println("Output: " + reversedSentence);
    }

    // Function to reverse each word in a sentence
    private static String reverseWords(String sentence) {
        String[] words = sentence.split("\\s+");
        StringBuilder reversedSentence = new StringBuilder();

        for (String word : words) {
            String reversedWord = reverseWord(word);
            reversedSentence.append(reversedWord).append(" ");
        }

        return reversedSentence.toString().trim();
    }

    // Function to reverse a word
    private static String reverseWord(String word) {
        StringBuilder reversedWord = new StringBuilder(word);
        return reversedWord.reverse().toString();
    }
}
