package LinkedList;

import java.util.Scanner;

class Book {
    String title;
    String author;
    String genre;
    int bookId;
    boolean isAvailable;
    Book next, prev;

    public Book(String title, String author, String genre, int bookId, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.isAvailable = isAvailable;
        this.next = null;
        this.prev = null;
    }
}

public class LibraryManagement {
    private Book head = null;
    private Book tail = null;

    // Add at beginning
    public void addAtBeginning(Book newBook) {
        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
    }

    // Add at end
    public void addAtEnd(Book newBook) {
        if (tail == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
    }

    // Add at specific position (1-based)
    public void addAtPosition(Book newBook, int position) {
        if (position <= 1 || head == null) {
            addAtBeginning(newBook);
            return;
        }

        Book temp = head;
        for (int i = 1; i < position - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        if (temp.next == null) {
            addAtEnd(newBook);
        } else {
            newBook.next = temp.next;
            newBook.prev = temp;
            temp.next.prev = newBook;
            temp.next = newBook;
        }
    }

    // Delete by Book ID
    public void deleteById(int bookId) {
        if (head == null) {
            System.out.println("Library is empty.");
            return;
        }

        Book temp = head;

        if (temp.bookId == bookId) {
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            System.out.println("Book deleted.");
            return;
        }

        while (temp != null && temp.bookId != bookId) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Book not found.");
        } else {
            if (temp == tail) {
                tail = tail.prev;
                tail.next = null;
            } else {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }
            System.out.println("Book deleted.");
        }
    }

    // Search by Title or Author
    public void search(String query) {
        Book temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(query) || temp.author.equalsIgnoreCase(query)) {
                displayBook(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("No book found for: " + query);
    }

    // Update availability
    public void updateAvailability(int bookId, boolean status) {
        Book temp = head;
        while (temp != null) {
            if (temp.bookId == bookId) {
                temp.isAvailable = status;
                System.out.println("Availability updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found.");
    }

    // Display forward
    public void displayForward() {
        if (head == null) {
            System.out.println("Library is empty.");
            return;
        }

        System.out.println("\n--- Library Books (Forward) ---");
        Book temp = head;
        while (temp != null) {
            displayBook(temp);
            temp = temp.next;
        }
    }

    // Display reverse
    public void displayReverse() {
        if (tail == null) {
            System.out.println("Library is empty.");
            return;
        }

        System.out.println("\n--- Library Books (Reverse) ---");
        Book temp = tail;
        while (temp != null) {
            displayBook(temp);
            temp = temp.prev;
        }
    }

    // Count total books
    public void countBooks() {
        int count = 0;
        Book temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Total books in library: " + count);
    }

    // Display single book
    private void displayBook(Book b) {
        System.out.println("ID: " + b.bookId + " | Title: " + b.title + " | Author: " + b.author +
                " | Genre: " + b.genre + " | Available: " + (b.isAvailable ? "Yes" : "No"));
    }

    // Main menu
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibraryManagement lm = new LibraryManagement();

        while (true) {
            System.out.println("\n--- Library Management Menu ---");
            System.out.println("1. Add Book at Beginning");
            System.out.println("2. Add Book at End");
            System.out.println("3. Add Book at Specific Position");
            System.out.println("4. Remove Book by ID");
            System.out.println("5. Search Book by Title or Author");
            System.out.println("6. Update Availability Status");
            System.out.println("7. Display Books Forward");
            System.out.println("8. Display Books Reverse");
            System.out.println("9. Count Total Books");
            System.out.println("10. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1, 2, 3 -> {
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();
                    System.out.print("Enter Genre: ");
                    String genre = sc.nextLine();
                    System.out.print("Is Available (true/false): ");
                    boolean available = sc.nextBoolean();
                    Book book = new Book(title, author, genre, id, available);

                    if (choice == 1) lm.addAtBeginning(book);
                    else if (choice == 2) lm.addAtEnd(book);
                    else {
                        System.out.print("Enter Position: ");
                        int pos = sc.nextInt();
                        lm.addAtPosition(book, pos);
                    }
                }

                case 4 -> {
                    System.out.print("Enter Book ID to remove: ");
                    int id = sc.nextInt();
                    lm.deleteById(id);
                }

                case 5 -> {
                    System.out.print("Enter Title or Author to search: ");
                    String query = sc.nextLine();
                    lm.search(query);
                }

                case 6 -> {
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter new availability status (true/false): ");
                    boolean status = sc.nextBoolean();
                    lm.updateAvailability(id, status);
                }

                case 7 -> lm.displayForward();
                case 8 -> lm.displayReverse();
                case 9 -> lm.countBooks();
                case 10 -> {
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                }

                default -> System.out.println("Invalid choice.");
            }
        }
    }
}

