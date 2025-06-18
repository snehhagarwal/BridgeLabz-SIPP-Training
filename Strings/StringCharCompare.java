import java.util.Arrays;
import java.util.Scanner;

public class StringCharCompare {
    public static char[] getChars(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }

    public static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        char[] userDefined = getChars(input);
        char[] builtIn = input.toCharArray();

        System.out.println("Are arrays same? " + compareArrays(userDefined, builtIn));
        System.out.println("User Defined: " + Arrays.toString(userDefined));
        System.out.println("Built In: " + Arrays.toString(builtIn));
    }
}

