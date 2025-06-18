import java.util.Scanner;

public class GreatestFactorWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hey User, enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println("Oops! Invalid input. Please enter a number greater than 1.");
            return;
        }

        int greatestFactor = 1; // greatest factor

        int counter = number - 1; //  counter
        while (counter >= 1) { // Loop to find factor
            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--; // Decrement
        }

        System.out.println("The greatest factor of " + number + " is: " + greatestFactor);
    }
}
