package Loopsconditions;

public class AgeClassifier
{
    public static void main(String[] args) {
        // Example usage
        int age = 16;
        classifyAge(age);
    }

    // Function to classify age into kid, teen, or adult
    private static void classifyAge(int age) {
        if (age < 13) {
            System.out.println("Kid");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teen");
        } else {
            System.out.println("Adult");
        }
    }
}
