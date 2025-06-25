package ConstructorsVariablesAndAccessModifiers.AccessModifiers;

import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for regular Book
        System.out.println("Enter Book Details:");
        System.out.print("ISBN: ");
        String isbn = scanner.nextLine();

        System.out.print("Title: ");
        String title = scanner.nextLine();

        System.out.print("Author: ");
        String author = scanner.nextLine();

        Book book = new Book(isbn, title, author);

        System.out.println("\n--- Book Details ---");
        book.displayBookDetails();

        // Input for EBook
        System.out.println("\nEnter EBook Details:");
        System.out.print("ISBN: ");
        String eIsbn = scanner.nextLine();

        System.out.print("Title: ");
        String eTitle = scanner.nextLine();

        System.out.print("Author: ");
        String eAuthor = scanner.nextLine();

        System.out.print("File Size (MB): ");
        double fileSize = scanner.nextDouble();

        EBook ebook = new EBook(eIsbn, eTitle, eAuthor, fileSize);

        System.out.println("\n--- EBook Details ---");
        ebook.displayEBookDetails();

        // Access author from parent using getter
        System.out.println("Author          : " + ebook.getAuthor());

        scanner.close();
    }
}