import java.util.Scanner;

public class PoundsToKg {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Declare variable for weight in pounds
        double weightInPounds;

        // Take input from user
        System.out.print("Enter the weight in pounds: ");
        weightInPounds = input.nextDouble();

        // Convert pounds to kilograms (1 pound = 2.2 kg)
        double weightInKg = weightInPounds / 2.2;

        // Output the result
        System.out.println("The weight of the person in pounds is " + weightInPounds +
                           " and in kg is " + weightInKg);
    }
}
