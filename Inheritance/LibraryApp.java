package Inheritance;

public class LibraryApp {
    public static void main(String[] args) {
        Author authorBook = new Author(
            "To Kill a Mockingbird",
            1960,
            "Harper Lee",
            "Harper Lee was an American novelist known for her 1960 novel about racial injustice."
        );

        authorBook.displayInfo();
    }
}
