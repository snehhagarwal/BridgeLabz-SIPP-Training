import java.util.Scanner;

public class GreatestFactorForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt(); // Read input
        if (number <= 1) { // Check input
            System.out.println("Invalid input");
            return;
        }
        int greatestFactor = 1; // Initialize greatest factor
        for (int i = number - 1; i >= 1; i--) { // Loop to find factor
            if (number % i == 0) { // Check if factor
                greatestFactor = i; // Update greatest factor
                break; // Exit loop
            }
        }
        System.out.println("Greatest factor: " + greatestFactor); // Print result
    }
}
