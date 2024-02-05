package lambdas;

import java.util.Arrays;

public class AverageOfOddNumbers
{
    public static double averageOfSquaresOfOddNumbers(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(n -> n % 2 != 0)
                .map(n -> n * n)
                .average()
                .orElse(0);
    }
}
