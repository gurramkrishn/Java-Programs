package arrays;

public class MoveZeros
{
    public static void main(String[] args) {
        int[] numbers = {0, 3, 0, 2, 8, 4, 0, 1};

        // Call the method to move zeros to the end
        moveZeros(numbers);

        System.out.print("Modified Array: ");
        printArray(numbers);
    }

    public static void moveZeros(int[] nums) {
        int nonZeroIndex = 0;

        // Traverse the array and move non-zero elements to the front
        for (int num : nums) {
            if (num != 0) {
                nums[nonZeroIndex++] = num;
            }
        }

        // Fill the remaining elements with zeros
        while (nonZeroIndex < nums.length) {
            nums[nonZeroIndex++] = 0;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
