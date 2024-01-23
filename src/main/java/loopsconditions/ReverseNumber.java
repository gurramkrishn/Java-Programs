package loopsconditions;


public class ReverseNumber
{
    public static void main(String[] args) {


        System.out.print("Enter a number: ");
        int number = 12345;

        // Reverse the digits of the number
        int reversedNumber = reverseDigits(number);

        // Display the reversed number
        System.out.println("Reversed number: " + reversedNumber);

    }
    private static int reverseDigits(int num) {
    int reversedNum = 0;

    while (num != 0) {
        int digit = num % 10;
        reversedNum = reversedNum * 10 + digit;
        num /= 10;
    }

    return reversedNum;
}
}


