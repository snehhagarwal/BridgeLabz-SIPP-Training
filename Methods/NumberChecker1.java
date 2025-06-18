import java.util.Arrays;

public class NumberChecker1 {
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static int[] getDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) digits[i] = s.charAt(i) - '0';
        return digits;
    }

    public static boolean isPalindrome(int num) {
        int[] digits = getDigits(num);
        int[] reversed = Arrays.copyOf(digits, digits.length);
        for (int i = 0; i < digits.length / 2; i++) {
            int temp = reversed[i];
            reversed[i] = reversed[digits.length - 1 - i];
            reversed[digits.length - 1 - i] = temp;
        }
        return Arrays.equals(digits, reversed);
    }

    public static boolean isDuckNumber(int num) {
        String s = String.valueOf(num);
        return s.contains("0") && s.charAt(0) != '0';
    }

    public static void main(String[] args) {
        int number = 12321;
        System.out.println("Palindrome: " + isPalindrome(number));
        System.out.println("Duck Number: " + isDuckNumber(number));
    }
}

