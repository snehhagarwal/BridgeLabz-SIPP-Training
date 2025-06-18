import java.util.Scanner;

public class BonusCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define arrays to store salary, years of service, new salary, and bonus amount
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] newSalary = new double[10];
        double[] bonusAmount = new double[10];

        // Variables to store total bonus, total old salary, and total new salary
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Loop to take input from the user
        for (int i = 0; i < 10; i++) {
            boolean isValidInput = false;
            while (!isValidInput) {
                System.out.print("Enter salary for employee " + (i + 1) + ": ");
                if (scanner.hasNextDouble()) {
                    salary[i] = scanner.nextDouble();
                    if (salary[i] > 0) {
                        System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                        if (scanner.hasNextDouble()) {
                            yearsOfService[i] = scanner.nextDouble();
                            if (yearsOfService[i] >= 0) {
                                isValidInput = true;
                            } else {
                                System.out.println("Invalid input. Years of service must be a non-negative number.");
                            }
                        } else {
                            System.out.println("Invalid input. Please enter a valid number for years of service.");
                            scanner.next(); // discard non-double input
                        }
                    } else {
                        System.out.println("Invalid input. Salary must be a positive number.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid number for salary.");
                    scanner.next(); // discard non-double input
                }
            }
        }

        // Loop to calculate the bonus of 10 employees based on their years of service
        for (int i = 0; i < 10; i++) {
            // Calculate bonus based on years of service
            if (yearsOfService[i] > 5) {
                bonusAmount[i] = 0.05 * salary[i]; // 5% bonus
            } else {
                bonusAmount[i] = 0.02 * salary[i]; // 2% bonus
            }

            // Compute the new salary
            newSalary[i] = salary[i] + bonusAmount[i];

            // Calculate total bonus, total old salary, and total new salary
            totalBonus += bonusAmount[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Print the total bonus payout as well as the total old and new salary of all the employees
        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        scanner.close();
    }
}
