import java.util.Scanner;

// This program checks if a given number is divisible by 5
public class DivisibleByFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input
        System.out.print("Enter a number: "); // Prompt the user to enter a number
        int num = sc.nextInt(); // Read the integer input from the user

        // Check if the number is divisible by 5 and display the result
        System.out.println("Is the number " + num + " divisible by 5? " + (num % 5 == 0));
    }
}
