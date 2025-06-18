import java.util.Scanner;

public class PowerOfNumberForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base number: ");
        int base = scanner.nextInt(); // Reads the base number from the user

        System.out.print("Enter power: ");
        int exponent = scanner.nextInt(); // Reads the exponent from the user

        long result = 1; // Initialize result to 1

        // Loop to calculate power
        for (int i = 1; i <= exponent; i++) {
            result *= base; // Multiply base 'exponent' times
        }

        System.out.println(base + "^" + exponent + " = " + result); // Print the result

        scanner.close(); // Close the scanner
    }
}
