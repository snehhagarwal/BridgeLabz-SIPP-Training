import java.util.Scanner;

// This program calculates the bonus for an employee based on years of service
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter their salary
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        // Ask the user to enter their years of service
        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        // Check if the employee has worked for more than 5 years
        if (years > 5) {
            // Calculate 5% bonus on salary
            double bonus = salary * 0.05;
            System.out.println("Congratulations! Your bonus amount is: " + bonus);
        } else {
            // No bonus if years of service is 5 or less
            System.out.println("Sorry, no bonus awarded.");
        }
    }
}
