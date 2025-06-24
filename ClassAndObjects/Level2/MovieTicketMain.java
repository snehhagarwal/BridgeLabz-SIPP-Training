import java.util.Scanner;

public class MovieTicketMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input ticket booking details
        System.out.print("Enter Movie Name: ");
        String movieName = scanner.nextLine();

        System.out.print("Enter Seat Number: ");
        String seatNumber = scanner.nextLine();

        System.out.print("Enter Ticket Price: ");
        double price = scanner.nextDouble();

        // Create MovieTicket object and book the ticket
        MovieTicket ticket = new MovieTicket();
        ticket.bookTicket(movieName, seatNumber, price);

        // Display the ticket details
        ticket.displayTicketDetails();

        scanner.close();
    }
}

