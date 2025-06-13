import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Declare variables for unit price and quantity
        double unitPrice;
        int quantity;

        // Take inputs from the user
        System.out.print("Enter the unit price of the item (INR): ");
        unitPrice = input.nextDouble();

        System.out.print("Enter the quantity to be bought: ");
        quantity = input.nextInt();

        // Calculate total purchase price
        double totalPrice = unitPrice * quantity;

        // Output the result
        System.out.println("The total purchase price is INR " + totalPrice +
                " if the quantity " + quantity + " and the unit price is INR " + unitPrice);
    }
}
