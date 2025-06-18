import java.util.Scanner;

public class FactorialWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object for user input
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt(); // Read the input number

        if (number < 0) {
            System.out.println("Invalid input"); // Handle negative input
            return;
        }

        long factorial = 1;
        int counter = 1; // Start counter from 1

        // Calculate factorial using while loop
        while (counter <= number) {
            factorial *= counter; // Multiply factorial by current counter
            counter++; // Move to the next number
        }

        System.out.println("Factorial of " + number + " is " + factorial); // Display result
    }
}
