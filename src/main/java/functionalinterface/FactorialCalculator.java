package functionalinterface;

public class FactorialCalculator
{
    // Method to calculate factorial of a given number
    public static int factorial(int number) {
        int factorialNumber = 1;
        for(int i = number; i >= 1; i--) {
            factorialNumber *= i;
        }
        if(number < 0)
            return -1;
        return factorialNumber;
    }
}
