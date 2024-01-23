package loopsconditions;

public class FibonacciSeries
{
    public static void main(String[] args) {

        System.out.print("Enter the value of N: ");
        int n=10;

        // Display the Fibonacci series up to N
        System.out.println("Fibonacci Series up to " + n + " terms:");
        printFibonacci(n);

    }

    // Function to print Fibonacci series up to N terms
    private static void printFibonacci(int n) {
        int firstTerm = 0, secondTerm = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
