import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt(); // Read the integer input
        int count = 0; // Initialize digit count
        
        // Loop to count the number of digits
        while (number != 0) {
            number /= 10; // Remove the last digit
            count++; // Increment the digit count
        }
        
        System.out.println("Number of digits: " + count); // Display the result
        sc.close(); // Close the scanner to free resources
    }
}
