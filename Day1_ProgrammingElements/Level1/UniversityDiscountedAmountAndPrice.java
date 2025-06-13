public class UniversityDiscountedAmountAndPrice {
    public static void main(String[] args) {
        // Initial course fee
        int fee = 125000;

        // Discount percentage
        int discountPercent = 10;

        // Calculate discount amount
        int discount = (fee * discountPercent) / 100;

        // Calculate final fee after discount
        int finalFee = fee - discount;

        // Output the results
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}
