package ConstructorsVariablesAndAccessModifiers.Constructors;

import java.util.Scanner;

public class HotelBookingMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Default booking
        HotelBooking defaultBooking = new HotelBooking();
        System.out.println("\n--- Default Booking ---");
        defaultBooking.displayBooking();

        // User input for parameterized booking
        System.out.print("\nEnter Guest Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Room Type (Standard/Deluxe/Suite): ");
        String room = scanner.nextLine();

        System.out.print("Enter Number of Nights: ");
        int nights = scanner.nextInt();

        // Parameterized booking
        HotelBooking customBooking = new HotelBooking(name, room, nights);
        System.out.println("\n--- Custom Booking ---");
        customBooking.displayBooking();

        // Copy constructor
        HotelBooking copyBooking = new HotelBooking(customBooking);
        System.out.println("\n--- Copied Booking ---");
        copyBooking.displayBooking();

        scanner.close();
    }
}

