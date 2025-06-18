import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        boolean isPrime = true; // Flag to check prime

        if (number <= 1) {
            isPrime = false; // Numbers <= 1 are not prime
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false; // Not a prime
                    break;
                }
            }
        }

        System.out.println(isPrime ? "Prime Number" : "Not a Prime Number");
    }
}
