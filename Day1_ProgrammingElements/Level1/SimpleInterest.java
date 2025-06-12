import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Declare variables
        double principal, rate, time;

        // Take input from user
        System.out.print("Enter the Principal amount: ");
        principal = input.nextDouble();

        System.out.print("Enter the Rate of interest (%): ");
        rate = input.nextDouble();

        System.out.print("Enter the Time (in years): ");
        time = input.nextDouble();

        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Display the result
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal +
                           ", Rate of Interest " + rate + " and Time " + time);
    }
}
