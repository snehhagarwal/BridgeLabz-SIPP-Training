package ConstructorsVariablesAndAccessModifiers.AccessModifiers;

public class EBook extends Book {
    private double fileSizeMB;

    // Constructor
    public EBook(String ISBN, String title, String author, double fileSizeMB) {
        super(ISBN, title, author);
        this.fileSizeMB = fileSizeMB;
    }

    // Display EBook-specific and inherited info
    public void displayEBookDetails() {
        System.out.println("E-Book ISBN     : " + ISBN);     // public: accessible
        System.out.println("E-Book Title    : " + title);    // protected: accessible in subclass
        System.out.println("File Size (MB)  : " + fileSizeMB);
    }
}

