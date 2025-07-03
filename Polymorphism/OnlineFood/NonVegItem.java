package Polymorphism.OnlineFood;

public class NonVegItem extends FoodItem implements Discountable {
    private double discountPercent = 0;
    private static final double NONVEG_CHARGE = 25; // ₹25 flat extra charge

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double total = (getPrice() * getQuantity()) + NONVEG_CHARGE;
        return total - (total * discountPercent / 100);
    }

    @Override
    public void applyDiscount(double percent) {
        this.discountPercent = percent;
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg Item Discount: " + discountPercent + "% (includes ₹" + NONVEG_CHARGE + " non-veg charge)";
    }
}

