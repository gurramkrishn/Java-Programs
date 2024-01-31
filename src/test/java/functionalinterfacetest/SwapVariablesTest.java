package functionalinterfacetest;

import functionalinterface.SwapVariables;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SwapVariablesTest
{
    @Test
    public void testSwap() {
        int a = 5;
        int b = 10;

        SwapVariables.swap(a, b);

        // After swapping, a should be equal to 10 and b should be equal to 5
        assertEquals(10, a);
        assertEquals(5, b);
    }
}
