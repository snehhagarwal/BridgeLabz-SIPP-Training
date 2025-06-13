import java.util.Scanner; // Import Scanner class

public class MultiplesBelow100Backward {
    public static void main(String[] args) {
        // Init scanner
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a positive integer below 100: ");
        int inputNumber = scanner.nextInt();

        // Validate input
        if (inputNumber <= 0 || inputNumber >= 100) {
            System.out.println("Hey! Invalid input. Please enter a number between 1 and 99.");
            return; // Exit if invalid
        }

        // Find and print multiples
        System.out.println("Okay, here are the multiples of " + inputNumber + " below 100, in descending order:");
        for (int i = 100; i >= 1; i--) {
            if (i % inputNumber == 0) {
                System.out.println(i); // Print multiple
            }
        }

        // Close scanner
        scanner.close();
    }
}
