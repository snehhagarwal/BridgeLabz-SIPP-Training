import java.util.*; // import Scanner

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // input
        int n = sc.nextInt(); // read number
        System.out.println(isPrime(n) ? "Prime" : "Not Prime"); // output
    }
    static boolean isPrime(int n) {
        if (n < 2) return false; // check <2
        for (int i = 2; i <= Math.sqrt(n); i++) // loop
            if (n % i == 0) return false; // not prime
        return true; // prime
    }
}
