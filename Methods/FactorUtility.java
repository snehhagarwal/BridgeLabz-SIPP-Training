import java.util.*;

public class FactorUtility {

    public static int[] getFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) count++;
        int[] factors = new int[count];
        int idx = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) factors[idx++] = i;
        return factors;
    }

    public static int getGreatestFactor(int[] factors) {
        return factors[factors.length - 2]; // exclude the number itself
    }

    public static int getSum(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    public static long getProduct(int[] factors) {
        long prod = 1;
        for (int f : factors) prod *= f;
        return prod;
    }

    public static double getCubeProduct(int[] factors) {
        double prod = 1;
        for (int f : factors) prod *= Math.pow(f, 3);
        return prod;
    }

    public static void main(String[] args) {
        int num = 12;
        int[] factors = getFactors(num);
        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Greatest Factor: " + getGreatestFactor(factors));
        System.out.println("Sum: " + getSum(factors));
        System.out.println("Product: " + getProduct(factors));
        System.out.println("Cube Product: " + getCubeProduct(factors));
    }
}

