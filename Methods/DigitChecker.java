public class DigitChecker {

    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    public static int[] getDigits(int n) {
        String s = String.valueOf(n);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) digits[i] = s.charAt(i) - '0';
        return digits;
    }

    public static boolean isDuck(int[] digits) {
        for (int d : digits) {
            if (d == 0) return true;
        }
        return false;
    }

    public static boolean isArmstrong(int n) {
        int[] digits = getDigits(n);
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, digits.length);
        return sum == n;
    }

    public static void findTwoLargest(int[] digits) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > max1) {
                max2 = max1;
                max1 = d;
            } else if (d > max2) {
                max2 = d;
            }
        }
        System.out.println("Largest: " + max1 + ", Second Largest: " + max2);
    }

    public static void findTwoSmallest(int[] digits) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < min1) {
                min2 = min1;
                min1 = d;
            } else if (d < min2) {
                min2 = d;
            }
        }
        System.out.println("Smallest: " + min1 + ", Second Smallest: " + min2);
    }

    public static void main(String[] args) {
        int n = 153;
        int[] digits = getDigits(n);
        System.out.println("Is Duck? " + isDuck(digits));
        System.out.println("Is Armstrong? " + isArmstrong(n));
        findTwoLargest(digits);
        findTwoSmallest(digits);
    }
}

