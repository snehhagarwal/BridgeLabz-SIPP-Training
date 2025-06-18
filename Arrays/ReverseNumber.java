import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Find the count of digits in the number
        int temp = number;
        int digitCount = 0;
        while (temp > 0) {
            temp /= 10;
            digitCount++;
        }

        // Find the digits in the number and save them in an array
        int[] digits = new int[digitCount];
        temp = number;
        for (int i = 0; i < digitCount; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Display the array in reverse order
        System.out.print("Reversed number: ");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();

        scanner.close();
    }
}
