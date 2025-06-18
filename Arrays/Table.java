import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner to take input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // Read input number

        int[] multiplicationResult = new int[4]; // Array to store multiplication results

        // Calculate multiplication table from 6 to 9
        for (int i = 0; i < 4; i++) {
            multiplicationResult[i] = number * (6 + i);
        }

        // Display the multiplication table
        for (int i = 0; i < 4; i++) {
            System.out.println(number + " * " + (6 + i) + " = " + multiplicationResult[i]);
        }
        scanner.close();
    }
}
