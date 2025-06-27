package ObjectRelationship;

import java.util.ArrayList;

public class Library {
    private String name;
    private ArrayList<Book> books;

    public Library(String name) {
        this.name = name;
        books = new ArrayList<>();
    }

    // Method to add a book
    public void addBook(Book book) {
        books.add(book);
    }

    // Display all books
    public void displayBooks() {
        System.out.println("\nBooks in " + name + " Library:");
        for (Book book : books) {
            System.out.println("- " + book);
        }
    }
}

