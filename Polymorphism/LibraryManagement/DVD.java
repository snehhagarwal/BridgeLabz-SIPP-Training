package Polymorphism.LibraryManagement;

public class DVD extends LibraryItem implements Reservable {
    private boolean isReserved = false;
    private String borrower;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; // 3 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!isReserved) {
            isReserved = true;
            this.borrower = borrowerName;
            System.out.println("DVD reserved by: " + maskBorrower());
        } else {
            System.out.println("DVD is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }

    private String maskBorrower() {
        return borrower.charAt(0) + "**";
    }
}

