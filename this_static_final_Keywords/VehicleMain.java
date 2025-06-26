package this_static_final_Keywords;

// VehicleMain.java
import java.util.Scanner;

public class VehicleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Optional: Update registration fee
        System.out.print("Enter new registration fee (or press Enter to keep default): ");
        String feeInput = sc.nextLine();
        if (!feeInput.isEmpty()) {
            double newFee = Double.parseDouble(feeInput);
            Vehicle.updateRegistrationFee(newFee);
        }

        // Input vehicle details
        System.out.print("Enter Owner Name: ");
        String ownerName = sc.nextLine();

        System.out.print("Enter Vehicle Type (e.g., Car, Bike): ");
        String vehicleType = sc.nextLine();

        System.out.print("Enter Registration Number: ");
        String regNumber = sc.nextLine();

        // Create Vehicle object
        Vehicle vehicle = new Vehicle(ownerName, vehicleType, regNumber);

        // Use instanceof check
        if (vehicle instanceof Vehicle) {
            System.out.println("\n--- Vehicle Registration Details ---");
            vehicle.displayRegistrationDetails();
        } else {
            System.out.println("Invalid vehicle object.");
        }

        sc.close();
    }
}

