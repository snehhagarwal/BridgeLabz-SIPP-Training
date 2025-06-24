package ConstructorsVariablesAndAccessModifiers.Constructors;

public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;

    // Default constructor
    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Standard";
        this.rentalDays = 1;
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate total cost based on car model
    public double calculateTotalCost() {
        double dailyRate;

        // Assign daily rate based on car model
        switch (carModel.toLowerCase()) {
            case "sedan":
                dailyRate = 2000;
                break;
            case "suv":
                dailyRate = 3000;
                break;
            case "hatchback":
                dailyRate = 1500;
                break;
            default:
                dailyRate = 1800; // for standard or unknown models
        }

        return dailyRate * rentalDays;
    }

    // Method to display rental details
    public void displayDetails() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model     : " + carModel);
        System.out.println("Rental Days   : " + rentalDays);
        System.out.printf("Total Cost    : ₹%.2f\n", calculateTotalCost());
    }
}
