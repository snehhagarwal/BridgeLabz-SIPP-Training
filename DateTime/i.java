import java.util.*; // import Scanner

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // input
        int n = sc.nextInt(); // read n
        System.out.println(fact(n)); // print result
    }
    static int fact(int n) {
        if (n == 0) return 1; // base case
        return n * fact(n - 1); // recursion
    }
}
