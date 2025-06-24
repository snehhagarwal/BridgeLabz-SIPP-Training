import java.util.Scanner;

public class ItemMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input item details
        System.out.print("Enter Item Code: ");
        int code = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Item Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Item Price: ");
        double price = scanner.nextDouble();

        // Create Item object
        Item item = new Item(code, name, price);

        // Input quantity
        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();

        System.out.println("\n--- Item Details ---");
        item.displayDetails();

        double totalCost = item.calculateTotalCost(quantity);
        System.out.printf("Total Cost for %d units: ₹%.2f\n", quantity, totalCost);

        scanner.close();
    }
}
