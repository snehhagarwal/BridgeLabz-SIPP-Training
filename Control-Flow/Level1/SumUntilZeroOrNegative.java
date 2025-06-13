import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0; // Initialize total
        System.out.print("Enter numbers (0 or negative to stop): ");
        while (true) {
            double num = sc.nextDouble(); // Read input
            if (num <= 0) break; // Exit loop if 0 or negative
            total += num; // Add to total
        }
        System.out.println("Total sum: " + total); // Print total
    }
}
