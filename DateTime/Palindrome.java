import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // input
        String s = sc.nextLine(); // read
        System.out.println(isPalindrome(s) ? "Yes" : "No"); // output
    }
    static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1; // pointers
        while (i < j)
            if (s.charAt(i++) != s.charAt(j--)) return false; // check
        return true; // palindrome
    }
}
