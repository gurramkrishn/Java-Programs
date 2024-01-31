package functionalinterfacetest;

import functionalinterface.FactorialCalculator;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialCalculatorTest
{

    @Test
    public void testFactorial() {
        // Test factorial of positive numbers
        assertEquals(1, FactorialCalculator.factorial(0));
        assertNotEquals(1, FactorialCalculator.factorial(5));

    }
}
