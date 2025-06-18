public class SumNaturalRecursive {
    public static int sumRecursive(int n) {
        if (n <= 1) return n;
        return n + sumRecursive(n - 1);
    }

    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Recursive: " + sumRecursive(n));
        System.out.println("Formula: " + sumFormula(n));
    }
}

