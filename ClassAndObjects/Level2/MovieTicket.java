public class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;

    // Constructor (starts with uninitialized values)
    public MovieTicket() {
        this.movieName = "";
        this.seatNumber = "";
        this.price = 0.0;
    }

    // Method to book a ticket
    public void bookTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!\n");
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        System.out.println("----- Ticket Details -----");
        System.out.println("Movie Name : " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.printf("Price      : ₹%.2f\n", price);
    }
}
