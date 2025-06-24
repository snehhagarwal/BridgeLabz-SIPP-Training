package ConstructorsVariablesAndAccessModifiers.Constructors;

import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input details
        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();

        System.out.print("Enter Author Name: ");
        String author = scanner.nextLine();

        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();

        // Create book object
        LibraryBook book = new LibraryBook(title, author, price, true);

        System.out.println("\n--- Book Details ---");
        book.displayDetails();

        System.out.println("\nAttempting to borrow the book...");
        book.borrowBook();

        System.out.println("\n--- Book Details After Borrowing ---");
        book.displayDetails();

        scanner.close();
    }
}
