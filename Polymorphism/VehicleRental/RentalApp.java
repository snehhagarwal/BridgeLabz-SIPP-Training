package Polymorphism.VehicleRental;

import java.util.ArrayList;

public class RentalApp {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("MH12AB1234", 1000, "CAR12345678"));
        vehicles.add(new Bike("MH14XY7890", 400, "BIK87654321"));
        vehicles.add(new Truck("MH10TR0009", 2500, "TRK11223344"));

        int days = 5;

        for (Vehicle v : vehicles) {
            v.displayInfo();
            double rental = v.calculateRentalCost(days);
            System.out.println("Rental Cost for " + days + " days: ₹" + rental);

            if (v instanceof Insurable) {
                Insurable insured = (Insurable) v;
                System.out.println("Insurance Cost: ₹" + insured.calculateInsurance());
                System.out.println(insured.getInsuranceDetails());
            }

            System.out.println("-----------------------------------");
        }
    }
}

