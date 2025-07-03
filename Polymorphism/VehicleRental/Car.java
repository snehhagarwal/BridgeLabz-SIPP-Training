package Polymorphism.VehicleRental;

public class Car extends Vehicle implements Insurable {
    private String policyNumber;

    public Car(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.policyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 1500.0;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy #: " + maskPolicyNumber();
    }

    private String maskPolicyNumber() {
        return "****" + policyNumber.substring(policyNumber.length() - 4);
    }
}

