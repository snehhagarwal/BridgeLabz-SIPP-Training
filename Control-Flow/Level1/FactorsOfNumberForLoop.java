import java.util.Scanner;

// This program finds and prints all the factors of a given positive integer using a for loop
public class FactorsOfNumberForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check if the input is valid
        if (number <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
            return;
        }

        // Loop through all numbers from 1 to number - 1
        System.out.println("The factors of " + number + " are:");
        for (int i = 1; i < number; i++) {
            // If 'i' divides 'number' exactly, then 'i' is a factor
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}
