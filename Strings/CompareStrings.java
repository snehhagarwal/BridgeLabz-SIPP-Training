import java.util.Scanner;

public class CompareStrings {
    public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        boolean customResult = compareStrings(str1, str2);
        boolean builtInResult = str1.equals(str2);

        System.out.println("Custom comparison: " + customResult);
        System.out.println("Built-in equals: " + builtInResult);
    }
}

