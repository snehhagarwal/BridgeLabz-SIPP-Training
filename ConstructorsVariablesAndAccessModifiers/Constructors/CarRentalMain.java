package ConstructorsVariablesAndAccessModifiers.Constructors;

import java.util.Scanner;

public class CarRentalMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter Customer Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Car Model (Sedan/SUV/Hatchback): ");
        String model = scanner.nextLine();

        System.out.print("Enter Rental Days: ");
        int days = scanner.nextInt();

        // Create rental object
        CarRental rental = new CarRental(name, model, days);

        System.out.println("\n--- Rental Details ---");
        rental.displayDetails();

        scanner.close();
    }
}

