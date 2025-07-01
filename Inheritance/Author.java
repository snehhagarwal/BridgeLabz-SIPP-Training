package Inheritance;

public class Author extends Book {
    private String name;
    private String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear); // Call Book constructor
        this.name = name;
        this.bio = bio;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Call Book's displayInfo
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}

