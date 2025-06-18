import java.util.Scanner;

public class CompareTheNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // Take user input

        int[] digits = new int[10]; // Array to store digits, max size 10
        int index = 0; // Array index

        // Extract digits and store in array
        while (number != 0 && index < 10) {
            digits[index] = number % 10; // Get last digit
            number /= 10; // Remove last digit
            index++; // Increment index
        }

        int largest = 0;
        int secondLargest = 0;

        // Find largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
        scanner.close();
    }
}
