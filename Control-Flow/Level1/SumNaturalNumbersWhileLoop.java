import java.util.Scanner;

public class SumNaturalNumbersWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Not a natural number");
            return;
        }
        int sum = 0, i = 1; // Initialize sum and counter
        while (i <= n) { // Loop until i > n
            sum += i; // Add i to sum
            i++; // Increment i
        }
        int formulaSum = n * (n + 1) / 2; // Calculate sum using formula
        System.out.println("Sum using while loop: " + sum);
        System.out.println("Sum using formula: " + formulaSum);
        System.out.println("Both results are " + (sum == formulaSum ? "equal" : "not equal"));
    }
}
