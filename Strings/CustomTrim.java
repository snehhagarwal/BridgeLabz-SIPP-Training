import java.util.Scanner;

public class CustomTrim {
    public static int[] findTrimIndices(String s) {
        int start = 0, end = s.length() - 1;
        while (start <= end && s.charAt(start) == ' ') start++;
        while (end >= start && s.charAt(end) == ' ') end--;
        return new int[]{start, end};
    }

    public static String substring(String s, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) result += s.charAt(i);
        return result;
    }

    public static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int[] indices = findTrimIndices(text);
        String trimmed = substring(text, indices[0], indices[1]);
        String builtin = text.trim();
        System.out.println("Match: " + compare(trimmed, builtin));
    }
}

