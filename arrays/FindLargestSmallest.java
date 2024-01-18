package arrays;

public class FindLargestSmallest
{
    public static void main(String[] args) {
        int[] numbers = {10, 5, 8, 2, 7, 1, 15};

        // Initialize variables to store the min and max values
        int min = numbers[0];
        int max = numbers[0];

        // Iterate through the array to find min and max
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Print the results
        System.out.println("Smallest number: " + min);
        System.out.println("Largest number: " + max);
    };
    }


