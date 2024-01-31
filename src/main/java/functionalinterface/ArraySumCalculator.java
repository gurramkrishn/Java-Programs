package functionalinterface;

public class ArraySumCalculator
{
    // Method to calculate the sum of all elements in an array of integers
    public static int calculateArraySum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}
