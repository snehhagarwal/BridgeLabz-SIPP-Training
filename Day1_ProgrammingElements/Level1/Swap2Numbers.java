import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Declare variables
        int number1, number2, temp;

        // Take input for number1 and number2
        System.out.print("Enter the first number: ");
        number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        number2 = input.nextInt();

        // Swap the numbers using a temporary variable
        temp = number1;
        number1 = number2;
        number2 = temp;

        // Output the swapped result
        System.out.println("The swapped numbers are " + number1 + " and " + number2);
    }
}
