import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        String[] fizzBuzzArray = new String[number + 1]; // Create a String Array to save the results

        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzzArray[i] = "FizzBuzz"; // For multiples of both 3 and 5 save "FizzBuzz"
            } else if (i % 3 == 0) {
                fizzBuzzArray[i] = "Fizz"; // For multiples of 3 save "Fizz"
            } else if (i % 5 == 0) {
                fizzBuzzArray[i] = "Buzz"; // For multiples of 5 save "Buzz"
            } else {
                fizzBuzzArray[i] = String.valueOf(i); // Save the number
            }
        }
        for (int i = 1; i <= number; i++) {
            System.out.println("Position " + i + " = " + fizzBuzzArray[i]);
        }
    }
}
