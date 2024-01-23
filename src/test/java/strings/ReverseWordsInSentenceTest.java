package strings;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ReverseWordsInSentenceTest
{

    @Test
    public void testReverseWords() {
        // Test case with multiple words
        assertEquals("avaJ EE2J esreveR eM", ReverseWordsInSentence.reverseWords("Java J2EE Reverse Me"));

        // Test case with a single word
        assertEquals("me", ReverseWordsInSentence.reverseWords("em"));

        // Test case with an empty string
        assertEquals("", ReverseWordsInSentence.reverseWords(""));

        // Test case with multiple spaces between words
        assertEquals("World Hello", ReverseWordsInSentence.reverseWords(" dlroW olleH "));
    }

    @Test
    public void testReverseWord() {
        // Test case with a regular word
        assertEquals("avaJ", ReverseWordsInSentence.reverseWord("Java"));

        // Test case with a single character word
        assertEquals("a", ReverseWordsInSentence.reverseWord("a"));

        // Test case with an empty word
        assertEquals("", ReverseWordsInSentence.reverseWord(""));

        // Test case with a palindrome word
        assertEquals("level", ReverseWordsInSentence.reverseWord("level"));

        assertEquals(" aviS ", ReverseWordsInSentence.reverseWord(" Siva "));
    }
}
