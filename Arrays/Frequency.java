import java.util.Scanner;

public class Frequency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Take the input for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Convert number to string to find the count of digits
        String numberStr = Integer.toString(number);
        int digitCount = numberStr.length();

        // 3. Find the digits in the number and save them in an array
        int[] digits = new int[digitCount];
        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }

        // 4. Find the frequency of each digit in the number
        int[] frequency = new int[10]; // Frequency array of size 10 (0 to 9)
        for (int digit : digits) {
            frequency[digit]++; // Increase the frequency of each digit
        }

        // 5. Display the frequency of each digit in the number
        System.out.println("Frequency of each digit:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }

        scanner.close();
    }
}