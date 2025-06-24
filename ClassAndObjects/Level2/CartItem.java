public class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getItemName() {
        return itemName;
    }

    public double getItemTotal() {
        return price * quantity;
    }

    public void displayItem() {
        System.out.printf("%s - ₹%.2f x %d = ₹%.2f\n", itemName, price, quantity, getItemTotal());
    }
}
