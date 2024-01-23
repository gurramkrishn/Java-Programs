package arrays;

public class BubbleSort
{
    public static void main(String[] args) {
    int[] numbers = {5, 2, 8, 1, 7};

    // Call the method to sort the array using Bubble Sort
    bubbleSort(numbers);

    System.out.print("Sorted Array: ");
    printArray(numbers);
}

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (array[i - 1] > array[i]) {
                    // Swap array[i-1] and array[i]
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
