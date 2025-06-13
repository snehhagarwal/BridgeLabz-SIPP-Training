import java.util.Scanner;

public class TotalIncome {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Declare variables for salary and bonus
        double salary, bonus;

        // Take input from the user
        System.out.print("Enter your salary (INR): ");
        salary = input.nextDouble();

        System.out.print("Enter your bonus (INR): ");
        bonus = input.nextDouble();

        // Calculate total income
        double totalIncome = salary + bonus;

        // Output the result
        System.out.println("The salary is INR " + salary + " and the bonus is INR " + bonus +
                           ". Hence Total Income is INR " + totalIncome);
    }
}
