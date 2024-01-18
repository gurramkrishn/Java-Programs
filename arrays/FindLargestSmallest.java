package arrays;

public class FindLargestSmallest
{
    public static void main(String[] args) {
        int[] integerArray = {5, 2, 8, 1, 7};

        // Call the method to find largest and smallest numbers
        int[] result = findLargestSmallest(integerArray);

        System.out.println("Largest number: " + result[0]);
        System.out.println("Smallest number: " + result[1]);
    }

    public static int[] findLargestSmallest(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return new int[]{0, 0};  // Return {0, 0} for both if the array is empty
        }

        int largest = numbers[0];
        int smallest = numbers[0];

        for (int num : numbers) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }

        return new int[]{largest, smallest};
    }

    }
