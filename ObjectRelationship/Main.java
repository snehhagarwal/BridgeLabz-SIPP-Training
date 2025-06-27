package ObjectRelationship;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create books independently
        System.out.print("How many books do you want to create? ");
        int numBooks = scanner.nextInt();
        scanner.nextLine(); // consume newline

        Book[] allBooks = new Book[numBooks];

        for (int i = 0; i < numBooks; i++) {
            System.out.println("\nEnter details for Book " + (i + 1) + ":");
            System.out.print("Title: ");
            String title = scanner.nextLine();

            System.out.print("Author: ");
            String author = scanner.nextLine();

            allBooks[i] = new Book(title, author);
        }

        // Create two libraries
        Library centralLibrary = new Library("Central");
        Library communityLibrary = new Library("Community");

        // Add books to libraries
        System.out.println("\nAssign books to libraries:");
        for (int i = 0; i < allBooks.length; i++) {
            System.out.println("Book " + (i + 1) + ": " + allBooks[i]);
            System.out.print("Add to which library? (1 for Central, 2 for Community): ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                centralLibrary.addBook(allBooks[i]);
            } else if (choice == 2) {
                communityLibrary.addBook(allBooks[i]);
            } else {
                System.out.println("Invalid choice. Book not added.");
            }
        }

        // Display books in each library
        centralLibrary.displayBooks();
        communityLibrary.displayBooks();

        scanner.close();
    }
}
