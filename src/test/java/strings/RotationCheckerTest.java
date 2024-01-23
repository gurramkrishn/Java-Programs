package strings;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class RotationCheckerTest
{

    @Test
    public void testIsRotation() {
        // Test case with two valid rotations
        assertTrue(RotationChecker.isRotation("JavaJ2eeStrutsHibernate", "StrutsHibernateJavaJ2ee"));
        assertTrue(RotationChecker.isRotation("abcde", "eabcd"));

        // Test case with two strings of different lengths
        assertFalse(RotationChecker.isRotation("abcd", "abc"));

        // Test case with one empty string
        assertFalse(RotationChecker.isRotation("", "abc"));


        // Test case with non-rotation strings
        assertFalse(RotationChecker.isRotation("hello", "world"));
        assertFalse(RotationChecker.isRotation("abcd", "dcba"));
    }
}
