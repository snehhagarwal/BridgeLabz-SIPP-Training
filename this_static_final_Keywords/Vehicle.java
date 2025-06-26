package this_static_final_Keywords;

// Vehicle.java
public class Vehicle {
    // Static members
    public static double registrationFee = 2500.0; // default fee in INR

    // Instance variables
    private String ownerName;
    private String vehicleType;
    private final String registrationNumber; // final for uniqueness

    // Constructor using 'this'
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to ₹" + registrationFee);
    }

    // Display vehicle details
    public void displayRegistrationDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: ₹" + registrationFee);
    }
}
