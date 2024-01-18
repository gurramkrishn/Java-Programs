package arrays;

public class ReverseArray
{
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};

        // Call the method to reverse the array
        int[] reversedArray = reverse(originalArray);

        System.out.print("Original Array: ");
        printArray(originalArray);

        System.out.print("Reversed Array: ");
        printArray(reversedArray);
    }

    public static int[] reverse(int[] array) {
        int length = array.length;
        int[] reversedArray = new int[length];

        for (int i = 0; i < length; i++) {
            reversedArray[i] = array[length - i - 1];
        }

        return reversedArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
