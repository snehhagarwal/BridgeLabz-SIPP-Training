import java.util.Scanner;

public class DayOfWeekCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user for month, day, and year
        System.out.print("Enter month (1-12): ");
        int m = sc.nextInt();

        System.out.print("Enter day (1-31): ");
        int d = sc.nextInt();

        System.out.print("Enter year: ");
        int y = sc.nextInt();

        // Zeller's Congruence algorithm to calculate day of week
        int y0 = y - (14 - m) / 12; // Adjust year if month is Jan or Feb
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400; // Leap year correction
        int m0 = m + 12 * ((14 - m) / 12) - 2; // Adjust month
        int d0 = (d + x + (31 * m0) / 12) % 7; // Calculate day of week (0=Sunday, ..., 6=Saturday)

        // Print the numeric day of the week
        System.out.println("Day of the week is: " + d0);

        // Map the numeric day to the actual day name
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("That is: " + days[d0]);
    }
}
