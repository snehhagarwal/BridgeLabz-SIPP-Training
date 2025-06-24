import java.util.Scanner;

public class CartMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();
        int choice;

        do {
            System.out.println("----- Shopping Cart Menu -----");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display Cart");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Item Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter Quantity: ");
                    int qty = scanner.nextInt();
                    cart.addItem(name, price, qty);
                    break;
                case 2:
                    System.out.print("Enter Item Name to Remove: ");
                    String removeName = scanner.nextLine();
                    cart.removeItem(removeName);
                    break;
                case 3:
                    cart.displayCart();
                    break;
                case 4:
                    System.out.println("Thank you for shopping!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.\n");
            }
        } while (choice != 4);

        scanner.close();
    }
}
