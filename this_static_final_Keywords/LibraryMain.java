package this_static_final_Keywords;

import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        System.out.print("Enter ISBN: ");
        String isbn = sc.nextLine();

        Book book = new Book(title, author, isbn);

        if (book instanceof Book) {
            System.out.println("\n--- Book Details ---");
            Book.displayLibraryName();
            book.displayBookDetails();
        } else {
            System.out.println("Invalid book object.");
        }

        sc.close();
    }
}