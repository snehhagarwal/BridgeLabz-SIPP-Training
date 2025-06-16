import java.util.Scanner;

public class LargestAndSecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner to take input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // Read input number

        int maxDigit = 10; // Initial array size
        int[] digits = new int[maxDigit]; // Array to store individual digits
        int index = 0; // Index to track number of digits

        // Extract digits from the number
        while (number != 0) {
            int lastDigit = number % 10; // Get last digit
            digits[index] = lastDigit; // Store digit in array
            number /= 10; // Remove last digit
            index++; // Move to next position

            // If array is full, double its size
            if (index == maxDigit) {
                maxDigit *= 2; // Double the size
                int[] tempDigits = new int[maxDigit]; // New array
                System.arraycopy(digits, 0, tempDigits, 0, digits.length); // Copy old to new
                digits = tempDigits; // Replace with new array
            }
        }

        int largest = 0; // Store largest digit
        int secondLargest = 0; // Store second largest digit

        // Find largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest; // Update second largest
                largest = digits[i]; // Update largest
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i]; // Update second largest
            }
        }

        // Display results
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        scanner.close(); // Close scanner
    }
}
