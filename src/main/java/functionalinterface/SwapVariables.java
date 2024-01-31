package functionalinterface;

public class SwapVariables
{
    // Method to swap the values of two integer variables without using a third variable
    public static void swap(int a, int b) {
        // Printing values before swapping
        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swapping values without using a third variable
        a = a + b;
        b = a - b;
        a = a - b;

        // Printing values after swapping
        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
