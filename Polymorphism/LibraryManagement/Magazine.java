package Polymorphism.LibraryManagement;

public class Magazine extends LibraryItem implements Reservable {
    private boolean isReserved = false;
    private String borrower;

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // 1 week
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!isReserved) {
            isReserved = true;
            this.borrower = borrowerName;
            System.out.println("Magazine reserved by: " + maskBorrower());
        } else {
            System.out.println("Magazine is already reserved.");
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

