package LinkedList;

import java.util.Scanner;

class Movie {
    String title;
    String director;
    int year;
    double rating;
    Movie next;
    Movie prev;

    public Movie(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}

public class MovieManagement {
    private Movie head = null;
    private Movie tail = null;

    // Add at beginning
    public void addAtBeginning(Movie newMovie) {
        if (head == null) {
            head = tail = newMovie;
        } else {
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
    }

    // Add at end
    public void addAtEnd(Movie newMovie) {
        if (tail == null) {
            head = tail = newMovie;
        } else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
    }

    // Add at specific position (1-based index)
    public void addAtPosition(Movie newMovie, int position) {
        if (position <= 1 || head == null) {
            addAtBeginning(newMovie);
            return;
        }

        Movie temp = head;
        for (int i = 1; i < position - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        if (temp.next == null) {
            addAtEnd(newMovie);
        } else {
            newMovie.next = temp.next;
            newMovie.prev = temp;
            temp.next.prev = newMovie;
            temp.next = newMovie;
        }
    }

    // Delete by title
    public void deleteByTitle(String title) {
        Movie temp = head;

        while (temp != null && !temp.title.equalsIgnoreCase(title)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Movie not found.");
            return;
        }

        if (temp == head) {
            head = temp.next;
            if (head != null) head.prev = null;
            else tail = null;
        } else if (temp == tail) {
            tail = temp.prev;
            tail.next = null;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }

        System.out.println("Movie \"" + title + "\" deleted.");
    }

    // Search by Director
    public void searchByDirector(String director) {
        Movie temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) {
                displayMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) System.out.println("No movies found for director: " + director);
    }

    // Search by Rating
    public void searchByRating(double rating) {
        Movie temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.rating == rating) {
                displayMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) System.out.println("No movies found with rating: " + rating);
    }

    // Update Rating by Title
    public void updateRating(String title, double newRating) {
        Movie temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println("Rating updated.");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Movie not found.");
    }

    // Display forward
    public void displayForward() {
        if (head == null) {
            System.out.println("No movies in the list.");
            return;
        }

        System.out.println("\n--- Movie List (Forward) ---");
        Movie temp = head;
        while (temp != null) {
            displayMovie(temp);
            temp = temp.next;
        }
    }

    // Display reverse
    public void displayReverse() {
        if (tail == null) {
            System.out.println("No movies in the list.");
            return;
        }

        System.out.println("\n--- Movie List (Reverse) ---");
        Movie temp = tail;
        while (temp != null) {
            displayMovie(temp);
            temp = temp.prev;
        }
    }

    // Display one movie
    private void displayMovie(Movie m) {
        System.out.println("Title: " + m.title + " | Director: " + m.director + " | Year: " + m.year + " | Rating: " + m.rating);
    }

    // Main method with menu
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieManagement mm = new MovieManagement();

        while (true) {
            System.out.println("\n--- Movie Management System ---");
            System.out.println("1. Add Movie at Beginning");
            System.out.println("2. Add Movie at End");
            System.out.println("3. Add Movie at Specific Position");
            System.out.println("4. Delete Movie by Title");
            System.out.println("5. Search Movie by Director");
            System.out.println("6. Search Movie by Rating");
            System.out.println("7. Update Movie Rating by Title");
            System.out.println("8. Display Movies Forward");
            System.out.println("9. Display Movies Reverse");
            System.out.println("10. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1, 2, 3 -> {
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Director: ");
                    String director = sc.nextLine();
                    System.out.print("Enter Year: ");
                    int year = sc.nextInt();
                    System.out.print("Enter Rating (0.0 - 10.0): ");
                    double rating = sc.nextDouble();
                    Movie movie = new Movie(title, director, year, rating);

                    if (choice == 1) mm.addAtBeginning(movie);
                    else if (choice == 2) mm.addAtEnd(movie);
                    else {
                        System.out.print("Enter Position: ");
                        int pos = sc.nextInt();
                        mm.addAtPosition(movie, pos);
                    }
                }

                case 4 -> {
                    System.out.print("Enter Movie Title to Delete: ");
                    String title = sc.nextLine();
                    mm.deleteByTitle(title);
                }

                case 5 -> {
                    System.out.print("Enter Director to Search: ");
                    String director = sc.nextLine();
                    mm.searchByDirector(director);
                }

                case 6 -> {
                    System.out.print("Enter Rating to Search: ");
                    double rating = sc.nextDouble();
                    mm.searchByRating(rating);
                }

                case 7 -> {
                    System.out.print("Enter Title to Update Rating: ");
                    String title = sc.nextLine();
                    System.out.print("Enter New Rating: ");
                    double rating = sc.nextDouble();
                    mm.updateRating(title, rating);
                }

                case 8 -> mm.displayForward();

                case 9 -> mm.displayReverse();

                case 10 -> {
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                }

                default -> System.out.println("Invalid option.");
            }
        }
    }
}

