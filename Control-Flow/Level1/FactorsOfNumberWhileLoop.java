import java.util.Scanner;

public class FactorsOfNumberWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check if the input is valid
        if (number <= 0) {
            System.out.println("Invalid input");
            return;
        }

        int counter = 1;

        // Loop to find and print all factors of the number
        while (counter < number) {
            // If counter divides number exactly, it's a factor
            if (number % counter == 0) {
                System.out.println(counter);
            }
            counter++;
        }
    }
}
