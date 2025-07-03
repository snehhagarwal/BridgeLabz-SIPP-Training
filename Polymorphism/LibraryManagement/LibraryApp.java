package Polymorphism.LibraryManagement;

public class LibraryApp {
    public static void processLibraryItem(LibraryItem item, String borrower) {
        item.getItemDetails();
        System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

        if (item instanceof Reservable) {
            Reservable r = (Reservable) item;
            if (r.checkAvailability()) {
                r.reserveItem(borrower);
            } else {
                System.out.println("Item is currently not available for reservation.");
            }
        }

        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {
        LibraryItem book = new Book("B101", "The Alchemist", "Paulo Coelho");
        LibraryItem magazine = new Magazine("M202", "National Geographic", "NatGeo Team");
        LibraryItem dvd = new DVD("D303", "Inception", "Christopher Nolan");

        processLibraryItem(book, "Sneha");
        processLibraryItem(magazine, "Rahul");
        processLibraryItem(dvd, "Ananya");
    }
}

