package ConstructorsVariablesAndAccessModifiers.Variables;

public class ProductMain {
    public static void main(String[] args) {
        // Create products
        Product p1 = new Product("Laptop", 65000);
        Product p2 = new Product("Smartphone", 25000);

        // Display product details
        System.out.println("--- Product 1 ---");
        p1.displayProductDetails();

        System.out.println("\n--- Product 2 ---");
        p2.displayProductDetails();

        // Display total number of products
        System.out.println();
        Product.displayTotalProducts();
    }
}