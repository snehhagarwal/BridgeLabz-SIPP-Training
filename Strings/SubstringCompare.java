import java.util.Scanner;

public class SubstringCompare {
    public static String customSubstring(String text, int start, int end) {
        String sub = "";
        for (int i = start; i < end && i < text.length(); i++) {
            sub += text.charAt(i);
        }
        return sub;
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
        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String custom = customSubstring(text, start, end);
        String builtIn = text.substring(start, end);

        System.out.println("Are they same? " + compareStrings(custom, builtIn));
        System.out.println("Custom: " + custom);
        System.out.println("Built-in: " + builtIn);
    }
}

