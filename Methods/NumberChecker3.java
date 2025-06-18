public class NumberChecker3 {
    public static int sumOfDivisors(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++)
            if (num % i == 0)
                sum += i;
        return sum;
    }

    public static boolean isPerfect(int num) {
        return sumOfDivisors(num) == num;
    }

    public static boolean isAbundant(int num) {
        return sumOfDivisors(num) > num;
    }

    public static boolean isDeficient(int num) {
        return sumOfDivisors(num) < num;
    }

    public static boolean isStrong(int num) {
        int sum = 0, original = num;
        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }
        return sum == original;
    }

    private static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }

    public static void main(String[] args) {
        int num = 145;
        System.out.println("Perfect: " + isPerfect(num));
        System.out.println("Abundant: " + isAbundant(num));
        System.out.println("Deficient: " + isDeficient(num));
        System.out.println("Strong: " + isStrong(num));
    }
}

