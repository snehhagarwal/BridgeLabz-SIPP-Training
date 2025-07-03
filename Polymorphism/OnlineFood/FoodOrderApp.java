package Polymorphism.OnlineFood;

public class FoodOrderApp {

    public static void processOrder(FoodItem item) {
        item.getItemDetails();

        if (item instanceof Discountable) {
            ((Discountable) item).applyDiscount(10); // Apply 10% discount
            System.out.println(((Discountable) item).getDiscountDetails());
        }

        double finalPrice = item.calculateTotalPrice();
        System.out.printf("Final Total Price: ₹%.2f\n", finalPrice);
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {
        FoodItem veg = new VegItem("Paneer Butter Masala", 200, 2);
        FoodItem nonVeg = new NonVegItem("Chicken Biryani", 250, 1);

        processOrder(veg);
        processOrder(nonVeg);
    }
}

