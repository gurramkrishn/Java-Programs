package strings;
import org.testng.annotations.Test;
import static junit.framework.Assert.assertEquals;

public class CountVowelsTest
{

    @Test
    public void testCountVowelsAllVowels() {
        assertEquals(5, CountVowels.countVowels("aeiou"));
    }

    @Test
    public void testCountVowelsEmptyInput() {
        assertEquals(0, CountVowels.countVowels(""));
    }

    @Test
    public void testCountVowelsMixedCase() {
        assertEquals(3, CountVowels.countVowels("Hello World"));
    }

    @Test
    public void testCountVowelsRepeatVowels() {
        assertEquals(3, CountVowels.countVowels("Success"));
    }


}
