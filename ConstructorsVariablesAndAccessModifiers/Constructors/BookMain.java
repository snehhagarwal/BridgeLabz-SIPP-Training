package ConstructorsVariablesAndAccessModifiers.Constructors;

public class BookMain {
    public static void main(String[] args) {
        // Using default constructor
        Book defaultBook = new Book();
        System.out.println("--- Default Book ---");
        defaultBook.displayBookDetails();

        System.out.println();

        // Using parameterized constructor
        Book paramBook = new Book("The Alchemist", "Paulo Coelho", 399.99);
        System.out.println("--- Parameterized Book ---");
        paramBook.displayBookDetails();
    }
}

