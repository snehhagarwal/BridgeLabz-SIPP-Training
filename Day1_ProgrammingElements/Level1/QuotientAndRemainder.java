import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Declare variables for the two numbers
        int number1, number2;

        // Take input from user
        System.out.print("Enter the first number: ");
        number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        number2 = input.nextInt();

        // Calculate quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Output the result
        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder +
                           " of two number " + number1 + " and " + number2);
    }
}
