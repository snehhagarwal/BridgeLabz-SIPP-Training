import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<CartItem> items;

    // Constructor
    public ShoppingCart() {
        items = new ArrayList<>();
    }

    // Method to add an item
    public void addItem(String name, double price, int quantity) {
        CartItem item = new CartItem(name, price, quantity);
        items.add(item);
        System.out.println("Item added to cart.\n");
    }

    // Method to remove an item by name
    public void removeItem(String name) {
        boolean removed = items.removeIf(item -> item.getItemName().equalsIgnoreCase(name));
        if (removed) {
            System.out.println("Item removed from cart.\n");
        } else {
            System.out.println("Item not found in cart.\n");
        }
    }

    // Method to display all items and total cost
    public void displayCart() {
        if (items.isEmpty()) {
            System.out.println("Cart is empty.\n");
            return;
        }

        double total = 0;
        System.out.println("---- Shopping Cart ----");
        for (CartItem item : items) {
            item.displayItem();
            total += item.getItemTotal();
        }
        System.out.printf("Total Cost: ₹%.2f\n\n", total);
    }
}
