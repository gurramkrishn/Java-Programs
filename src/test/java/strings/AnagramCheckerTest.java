package strings;
import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnagramCheckerTest
{
    @Test
    public void testAnagrams() {
        assertTrue(AnagramChecker1.checkAnagrams("listen", "silent"));
    }



    @Test
    public void testNotAnagramsDifferentLength() {
        assertFalse(AnagramChecker1.checkAnagrams("listen", "silentt"));
    }

    @Test
    public void testNotAnagrams() {
        assertFalse(AnagramChecker1.checkAnagrams("hello", "world"));
    }



    @Test
    public void testAnagramsNumbers() {
        assertTrue(AnagramChecker1.checkAnagrams("12345", "54321"));
    }


}
