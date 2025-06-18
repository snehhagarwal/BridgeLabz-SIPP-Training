import java.util.Scanner;

public class OddEvenArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        // Check if the input is a natural number
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number.");
            sc.close();
            return;
        }

        // Create arrays for even and odd numbers
        int[] evenArray = new int[number / 2 + 1];
        int[] oddArray = new int[number / 2 + 1];

        // Initialize index variables for odd and even arrays
        int evenIndex = 0;
        int oddIndex = 0;

        // Iterate from 1 to the number and save odd/even numbers into arrays
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenArray[evenIndex] = i;
                evenIndex++;
            } else {
                oddArray[oddIndex] = i;
                oddIndex++;
            }
        }

        // Print the even numbers array
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenArray[i] + " ");
        }
        System.out.println();

        // Print the odd numbers array
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddArray[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
