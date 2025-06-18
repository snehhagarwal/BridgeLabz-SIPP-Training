import java.util.*;

public class ToUpperCaseCompare {
    public static String toUpperCase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result += (char)(ch - 32);
            } else {
                result += ch;
            }
        }
        return result;
    }

    public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String user = toUpperCase(input);
        String builtIn = input.toUpperCase();

        System.out.println("Are they same? " + compareStrings(user, builtIn));
        System.out.println("User: " + user);
        System.out.println("Built-in: " + builtIn);
    }
}

