import java.util.Scanner;

public class LeapYearMultipleIf {
    public static void main(String[] args) {
        // Get the year from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hey! Please enter a year (>=1582): ");
        int year = scanner.nextInt();
        
        // First, let's check if the year is valid 
        if (year < 1582) {
            System.out.println("Oops! The year must be 1582 or later.");
        } else {
            // Now, let's apply the leap year rules
            if (year % 4 != 0) {
                System.out.println("Nope, not a leap year.");
            } else if (year % 100 != 0) {
                System.out.println("Yep, it's a leap year!");
            } else if (year % 400 == 0) {
                System.out.println("Yep, it's a leap year!");
            } else {
                System.out.println("Nope, not a leap year.");
            }
        }
    }
}
