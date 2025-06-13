import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input
        System.out.print("Enter a number to check if it's Armstrong: ");
        int number = sc.nextInt(); // Read the number from user
        int originalNumber = number; // Store the original number for comparison
        int sum = 0;

        // Calculate the sum of cubes of each digit
        while (originalNumber != 0) {
            int digit = originalNumber % 10; // Get the last digit
            sum += digit * digit * digit;    // Add its cube to sum
            originalNumber /= 10;            // Remove the last digit
        }

        // Check if the original number is equal to the sum of cubes of its digits
        if (number == sum) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }
    }
}
