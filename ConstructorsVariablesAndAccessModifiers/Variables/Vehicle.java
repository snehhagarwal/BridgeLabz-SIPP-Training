package ConstructorsVariablesAndAccessModifiers.Variables;

public class Vehicle {
    private String ownerName;
    private String vehicleType;

    // Class variable (common for all vehicles)
    private static double registrationFee = 5000.0;

    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name     : " + ownerName);
        System.out.println("Vehicle Type   : " + vehicleType);
        System.out.printf("Registration Fee: ₹%.2f\n", registrationFee);
    }

    // Class method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}
