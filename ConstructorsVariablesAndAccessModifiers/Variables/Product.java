package ConstructorsVariablesAndAccessModifiers.Variables;

public class Product {
    private String productName;
    private double price;

    // Class variable (shared by all instances)
    private static int totalProducts = 0;

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;  // Increment when new product is created
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.printf("Price       : ₹%.2f\n", price);
    }

    // Class method to display total products
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
}