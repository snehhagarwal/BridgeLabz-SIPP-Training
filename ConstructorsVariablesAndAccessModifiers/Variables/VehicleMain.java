package ConstructorsVariablesAndAccessModifiers.Variables;

import java.util.Scanner;

public class VehicleMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Optional: Update registration fee
        System.out.print("Enter updated Registration Fee (or 0 to keep default ₹5000): ");
        double newFee = scanner.nextDouble();
        scanner.nextLine(); // consume newline
        if (newFee > 0) {
            Vehicle.updateRegistrationFee(newFee);
        }

        // Take number of vehicles
        System.out.print("Enter number of vehicles to register: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        Vehicle[] vehicles = new Vehicle[n];

        // Input details for each vehicle
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Vehicle " + (i + 1));

            System.out.print("Owner Name: ");
            String owner = scanner.nextLine();

            System.out.print("Vehicle Type (Car/Bike/Truck/etc.): ");
            String type = scanner.nextLine();

            vehicles[i] = new Vehicle(owner, type);
        }

        // Display all vehicle details
        System.out.println("\n--- Vehicle Details ---");
        for (Vehicle v : vehicles) {
            v.displayVehicleDetails();
            System.out.println();
        }

        scanner.close();
    }
}
