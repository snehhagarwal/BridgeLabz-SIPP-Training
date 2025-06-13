import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Declare variable for kilometers
        double km;

        // Take input from user
        System.out.print("Enter distance in kilometers: ");
        km = input.nextInt();

        // Convert km to miles using 1 mile = 1.6 km
        double miles = km / 1.6;

        // Output the result
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
    }
}
