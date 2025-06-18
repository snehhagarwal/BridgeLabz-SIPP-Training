import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10]; // Array to store numbers
        double total = 0.0; // Variable to store the sum
        int index = 0; // Index for the array

        // Infinite loop to take user input
        while (true) {
            System.out.print("Enter a number (or 0 or negative to stop): ");
            double input = scanner.nextDouble();

            // Check if the user entered 0 or a negative number
            if (input <= 0) {
                break;
            }

            // Check if the array is full
            if (index == 10) {
                break;
            }

            // Add the number to the array and increment the index
            numbers[index] = input;
            index++;
        }

        // Calculate the sum of the numbers in the array
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display the numbers and the total
        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("Total: " + total);

        scanner.close();
    }
}