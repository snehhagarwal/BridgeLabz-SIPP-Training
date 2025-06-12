import java.util.Scanner;

public class ChocolateDivision {
    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Declare variables
        int numberOfChocolates, numberOfChildren;

        // Take input from the user
        System.out.print("Enter the number of chocolates: ");
        numberOfChocolates = input.nextInt();

        System.out.print("Enter the number of children: ");
        numberOfChildren = input.nextInt();

        // Check to avoid division by zero
        if (numberOfChildren == 0) {
            System.out.println("Number of children cannot be zero.");
        } else {
            // Calculate chocolates per child and remaining chocolates
            int chocolatesPerChild = numberOfChocolates / numberOfChildren;
            int remainingChocolates = numberOfChocolates % numberOfChildren;

            // Display the results
            System.out.println("The number of chocolates each child gets is " + chocolatesPerChild +
                               " and the number of remaining chocolates is " + remainingChocolates);
        }
    }
}
