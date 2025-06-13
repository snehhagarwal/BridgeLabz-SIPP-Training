import java.util.Scanner;

public class DiscountedAmountAndPercentage {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take fee input
        System.out.print("Enter the student fee (INR): ");
        double fee = scanner.nextDouble();

        // Take discount percentage input
        System.out.print("Enter the university discount percentage: ");
        double discountPercent = scanner.nextDouble();

        // Calculate discount amount
        double discount = (fee * discountPercent) / 100;

        // Calculate final fee
        double finalFee = fee - discount;

        // Output the result
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}
