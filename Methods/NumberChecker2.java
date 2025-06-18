import java.util.*;
public class NumberChecker2 {
    public static int[] getDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) digits[i] = s.charAt(i) - '0';
        return digits;
    }

    public static int digitSum(int[] digits) {
        return Arrays.stream(digits).sum();
    }

    public static int digitSquareSum(int[] digits) {
        return Arrays.stream(digits).map(d -> d * d).sum();
    }

    public static boolean isHarshad(int num) {
        return num % digitSum(getDigits(num)) == 0;
    }

    public static void digitFrequency(int num) {
        int[] freq = new int[10];
        int[] digits = getDigits(num);
        for (int d : digits) freq[d]++;
        for (int i = 0; i < 10; i++)
            if (freq[i] > 0)
                System.out.println("Digit: " + i + " => " + freq[i]);
    }

    public static void main(String[] args) {
        int num = 120;
        System.out.println("Harshad: " + isHarshad(num));
        digitFrequency(num);
    }
}

