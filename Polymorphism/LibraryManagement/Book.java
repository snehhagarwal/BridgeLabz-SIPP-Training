package Polymorphism.LibraryManagement;

public class Book extends LibraryItem implements Reservable {
    private boolean isReserved = false;
    private String borrower;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // 2 weeks
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!isReserved) {
            isReserved = true;
            this.borrower = borrowerName;
            System.out.println("Book reserved by: " + maskBorrower());
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }

    private String maskBorrower() {
        if (borrower.length() < 2) return "**";
        return borrower.charAt(0) + "**";
    }
}

