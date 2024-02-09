package threads;

import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SingletonTest
{
    @Test
    public void testSingletonInstance() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        // Both instances should be the same
        assertEquals(instance1, instance2);
    }

    @Test
    public void testSingletonFunctionality() {
        Singleton instance = Singleton.getInstance();
        String result = instance.doSomething();

        // Ensure that the singleton functionality works as expected
        assertEquals("Singleton instance is doing something!", result);
    }
}

