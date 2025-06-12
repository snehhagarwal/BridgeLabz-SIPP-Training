import java.util.Scanner;

public class TravelData {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Input personal and city details
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter the starting city: ");
        String fromCity = input.nextLine();

        System.out.print("Enter the via city: ");
        String viaCity = input.nextLine();

        System.out.print("Enter the final destination city: ");
        String toCity = input.nextLine();

        // Input distance values
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in miles: ");
        double fromToVia = input.nextDouble();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in miles: ");
        double viaToFinalCity = input.nextDouble();

        // Input time values
        System.out.print("Enter the time from " + fromCity + " to " + viaCity + " in minutes: ");
        int timeFromToVia = input.nextInt();

        System.out.print("Enter the time from " + viaCity + " to " + toCity + " in minutes: ");
        int timeViaToFinalCity = input.nextInt();

        // Calculate total distance in kilometers (1 mile = 1.6 km)
        double totalDistanceKm = (fromToVia + viaToFinalCity) * 1.6;

        // Calculate total time
        int totalTimeMinutes = timeFromToVia + timeViaToFinalCity;

        // Output the result
        System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity +
                           " via " + viaCity + " is " + totalDistanceKm + " km and the Total Time taken is " +
                           totalTimeMinutes + " minutes");
    }
}
