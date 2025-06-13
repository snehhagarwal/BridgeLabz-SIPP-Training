import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Declare variables for the three sides
        double side1, side2, side3;

        // Take user input for the sides in meters
        System.out.print("Enter side 1 of the triangle (in meters): ");
        side1 = input.nextDouble();

        System.out.print("Enter side 2 of the triangle (in meters): ");
        side2 = input.nextDouble();

        System.out.print("Enter side 3 of the triangle (in meters): ");
        side3 = input.nextDouble();

        // Calculate perimeter
        double perimeter = side1 + side2 + side3;

        // Total distance to run (in meters) = 5 km = 5000 meters
        double totalDistance = 5000;

        // Calculate number of rounds
        double rounds = totalDistance / perimeter;

        // Output the result
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");
    }
}
