package Polymorphism.ECommerce;

import java.util.ArrayList;

public class ECommerceApp {
    public static void printFinalPrice(Product product) {
        product.displayInfo();
        double tax = 0;
        if (product instanceof Taxable) {
            tax = ((Taxable) product).calculateTax();
            System.out.println(((Taxable) product).getTaxDetails());
        }
        double discount = product.calculateDiscount();
        double finalPrice = product.getPrice() + tax - discount;

        System.out.printf("Discount: ₹%.2f\n", discount);
        System.out.printf("Tax: ₹%.2f\n", tax);
        System.out.printf("Final Price: ₹%.2f\n", finalPrice);
        System.out.println("--------------------------------------");
    }

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Electronics(101, "Smartphone", 30000));
        products.add(new Clothing(102, "T-Shirt", 1000));
        products.add(new Groceries(103, "Wheat Flour", 500));

        for (Product p : products) {
            printFinalPrice(p);
        }
    }
}

