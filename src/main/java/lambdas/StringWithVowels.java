package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringWithVowels
{
    public static List<String> stringsWithVowels(String[] strings) {
        return Arrays.stream(strings)
                .filter(s -> s.toLowerCase().matches(".*[aeiou].*"))
                .map(s -> s + " (Vowels: " + countVowels(s) + ")")
                .collect(Collectors.toList());
    }

    private static long countVowels(String s) {
        return s.toLowerCase().chars().filter(c -> "aeiou".indexOf(c) != -1).count();
    }
}

