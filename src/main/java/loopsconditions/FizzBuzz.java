package loopsconditions;

public class FizzBuzz
{
    public static void main(String[] args) {
        // Loop from 1 to 100
        for (int i = 1; i <= 100; i++) {
            // Check if the number is divisible by both 3 and 5 first
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                // Check if the number is divisible by 3
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                // Check if the number is divisible by 5
                System.out.println("Buzz");
            } else {
                // If not divisible by 3 or 5, print the number
                System.out.println(i);
            }
        }
    }
}
