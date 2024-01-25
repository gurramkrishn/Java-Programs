package strings;

import java.util.Arrays;

public class RotationChecker
{

   public static boolean isRotation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        String concatenatedStr = str1 + str1;

        return concatenatedStr.contains(str2);
    }

    public static void main(String[] args) {
        String inputStr1 = "JavaJ2eeStrutsHibernate";
        String inputStr2 = "StrutsHibernateJavaJ2ee";

        boolean result = isRotation(inputStr1, inputStr2);

        System.out.println(result);
    }


}
