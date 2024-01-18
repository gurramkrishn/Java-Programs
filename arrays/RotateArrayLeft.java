package arrays;

public class RotateArrayLeft
{
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int positions = 2;

        // Call the method to rotate the array left
        int[] rotatedArray = rotateLeft(array, positions);

        System.out.print("Original Array: ");
        printArray(array);

        System.out.print("Rotated Array (left by " + positions + " positions): ");
        printArray(rotatedArray);
    }

    public static int[] rotateLeft(int[] array, int positions) {
        int length = array.length;
        int[] rotatedArray = new int[length];

        for (int i = 0; i < length; i++) {
            int newPosition = (i + positions) % length;
            rotatedArray[i] = array[newPosition];
        }

        return rotatedArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
