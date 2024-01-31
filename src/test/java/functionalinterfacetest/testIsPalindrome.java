package functionalinterfacetest;

import functionalinterface.PalindromeChecker;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class testIsPalindrome
{

    @Test
    public void testIsPalindrome() {
        // Test palindrome numbers
        assertTrue(PalindromeChecker.isPalindrome(12321));
        assertTrue(PalindromeChecker.isPalindrome(1221));
        assertTrue(PalindromeChecker.isPalindrome(123454321));

        // Test non-palindrome numbers
        assertFalse(PalindromeChecker.isPalindrome(12345));
        assertFalse(PalindromeChecker.isPalindrome(123456));
        assertFalse(PalindromeChecker.isPalindrome(123456789));
    }
}
