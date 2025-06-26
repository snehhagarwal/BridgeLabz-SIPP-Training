package this_static_final_Keywords;

public class Product {
    // Static members
    public static double discount = 5.0; // default discount in percent

    // Instance members
    private final int productID; // cannot change once assigned
    private String productName;
    private double price;
    private int quantity;

    // Constructor using 'this'
    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method to update discount
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Updated discount: " + discount + "%");
    }

    // Display product details
    public void displayProductDetails() {
        double discountedPrice = price - (price * discount / 100);
        System.out.println("Product ID: " + productID);
        System.out.println("Name: " + productName);
        System.out.println("Price (before discount): ₹" + price);
        System.out.println("Price (after " + discount + "% discount): ₹" + discountedPrice);
        System.out.println("Quantity: " + quantity);
    }
}
