package ConstructorsVariablesAndAccessModifiers.Constructors;

public class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Constructor
    public LibraryBook(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Method to borrow the book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("The book \"" + title + "\" has been borrowed successfully.");
        } else {
            System.out.println("Sorry, the book \"" + title + "\" is currently unavailable.");
        }
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title      : " + title);
        System.out.println("Author     : " + author);
        System.out.printf("Price      : ₹%.2f\n", price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }
}
