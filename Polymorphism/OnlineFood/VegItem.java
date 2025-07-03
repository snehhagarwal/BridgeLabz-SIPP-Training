package Polymorphism.OnlineFood;

public class VegItem extends FoodItem implements Discountable {
    private double discountPercent = 0;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double total = getPrice() * getQuantity();
        return total - (total * discountPercent / 100);
    }

    @Override
    public void applyDiscount(double percent) {
        this.discountPercent = percent;
    }

    @Override
    public String getDiscountDetails() {
        return "Veg Item Discount: " + discountPercent + "%";
    }
}

