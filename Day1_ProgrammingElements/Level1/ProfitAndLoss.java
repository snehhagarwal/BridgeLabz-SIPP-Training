public class Main {
    public static void main(String[] args) {
        // Cost price and selling price
        int costPrice = 129;
        int sellingPrice = 191;

        // Calculate profit and profit percentage
        int profit = sellingPrice - costPrice;
        double profitPercent = (profit * 100.0) / costPrice;

        // Print all values in a single multiline statement
        System.out.println(
            "The Cost Price is INR " + costPrice + " and the Selling Price is INR " + sellingPrice + "\n" +
            "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercent
        );
    }
}
