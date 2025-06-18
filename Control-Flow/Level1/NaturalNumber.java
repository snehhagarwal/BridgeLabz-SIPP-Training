import java.util.Scanner;

// Program to check if a number is a natural number and calculate the sum of n natural numbers
public class NaturalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a natural number (positive integer)
        if (number > 0) {
            // Calculate the sum of n natural numbers using the formula
            int sum = number * (number + 1) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            // If not a natural number, display an appropriate message
            System.out.println("The number " + number + " is not a natural number");
        }

        scanner.close();
    }
}