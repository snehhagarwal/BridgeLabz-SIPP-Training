package this_static_final_Keywords;

// ProductMain.java
import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Optional: update discount
        System.out.print("Enter new discount percentage (or press enter to keep default): ");
        String input = sc.nextLine();
        if (!input.isEmpty()) {
            double newDiscount = Double.parseDouble(input);
            Product.updateDiscount(newDiscount);
        }

        // User input for product
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        // Create Product object
        Product product = new Product(id, name, price, quantity);

        // Validate with instanceof
        if (product instanceof Product) {
            System.out.println("\n--- Product Details ---");
            product.displayProductDetails();
        } else {
            System.out.println("Invalid product object.");
        }

        sc.close();
    }
}
