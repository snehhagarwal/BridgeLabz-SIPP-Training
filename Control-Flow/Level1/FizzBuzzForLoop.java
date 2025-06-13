import java.util.Scanner; // Import the Scanner class


public class FizzBuzzForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input
        System.out.print("Enter a positive integer: "); // Ask the user for input
        int n = sc.nextInt(); // Read the integer from the user

        if (n <= 0) { // Check if the input is valid
            System.out.println("Invalid input"); // Print an error message if the input is invalid
            return; // Exit the program
        }

        for (int i = 1; i <= n; i++) { // Loop from 1 to n
            if (i % 15 == 0) System.out.println("FizzBuzz"); // If i is divisible by 15, print "FizzBuzz"
            else if (i % 3 == 0) System.out.println("Fizz"); // If i is divisible by 3, print "Fizz"
            else if (i % 5 == 0) System.out.println("Buzz"); // If i is divisible by 5, print "Buzz"
            else System.out.println(i); // Otherwise, print the number
        }
    }
}