package functionalinterfacetest;

import functionalinterface.CharacterCaseConverter;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacterCaseConverterTest
{
    @Test
    public void testConvertCase() {
        assertEquals("hELLO wORLD", CharacterCaseConverter.convertCase("Hello World"));
    }

    @Test
    public void testConvertCaseWithSpecialCharacters() {
        assertEquals("1234aBCDefg!@#", CharacterCaseConverter.convertCase("1234AbcdEFG!@#"));
    }

    @Test
    public void testConvertCaseWithEmptyString() {
        assertEquals("", CharacterCaseConverter.convertCase(""));
    }

    @Test
    public void testConvertCaseWithNullString() {
        assertEquals(null, CharacterCaseConverter.convertCase(null));
    }

    @Test
    public void testConvertCaseWithNumbers() {
        assertEquals("1234", CharacterCaseConverter.convertCase("1234"));
    }

    @Test
    public void testConvertCaseWithOnlyUpperCase() {
        assertEquals("hello world", CharacterCaseConverter.convertCase("HELLO WORLD"));
    }

    @Test
    public void testConvertCaseWithOnlyLowerCase() {
        assertEquals("HELLO WORLD", CharacterCaseConverter.convertCase("hello world"));
    }
}
