import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        // Get ready to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a natural number
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();

        // Check if the number is a natural number
        if (number <= 0) {
            System.out.println("Not a natural number");
            return; // Exit the program if it's not a natural number
        }

        // Loop through numbers from 1 to the entered number
        for (int i = 1; i <= number; i++) {
            // Check if the number is even or odd and print the result
            System.out.println(i + " is " + (i % 2 == 0 ? "even" : "odd"));
        }
        
        //scanner.close();
    }
}
