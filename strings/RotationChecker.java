package strings;

public class RotationChecker
{
    public static void main(String[] args) {
        String str1 = "JavaJ2eeStrutsHibernate";
        String str2 = "StrutsHibernateJavaJ2ee";

        boolean isRotation = isRotation(str1, str2);

        System.out.println("Is one string a rotation of another? " + isRotation);
    }

    // Function to check if one string is a rotation of another
    private static boolean isRotation(String str1, String str2) {
        // Check if lengths are equal and not empty
        if (str1.length() != str2.length() || str1.isEmpty() || str2.isEmpty()) {
            return false;
        }

        // Concatenate str1 with itself
        String concatenatedStr = str1 + str1;

        // Check if str2 is a substring of the concatenated string
        return concatenatedStr.contains(str2);
    }
}
