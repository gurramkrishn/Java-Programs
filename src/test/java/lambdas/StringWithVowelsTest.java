package lambdas;

import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringWithVowelsTest
{

    @Test
    public void testStringsWithVowels() {
        String[] input = {"apple", "banana", "grape", "sky", "orange"};
        List<String> expected = List.of("apple (Vowels: 2)", "banana (Vowels: 3)", "grape (Vowels: 2)", "orange (Vowels: 3)");
        assertEquals(expected, StringWithVowels.stringsWithVowels(input));
    }

    @Test
    public void testStringsWithVowelsNoVowels() {
        String[] input = {"sky", "fly", "dry"};
        List<String> expected = List.of();
        assertEquals(expected, StringWithVowels.stringsWithVowels(input));
    }

    @Test
    public void testStringsWithVowelsEmptyArray() {
        String[] input = {};
        List<String> expected = List.of();
        assertEquals(expected, StringWithVowels.stringsWithVowels(input));
    }
}
