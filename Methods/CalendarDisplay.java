import java.util.Scanner;

public class CalendarDisplay {
    // Array of month names
    static final String[] months = {
        "", "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    // Array of days in each month
    static final int[] daysInMonth = {
        0, 31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Month and Year
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        printCalendar(month, year);
    }

    // Print calendar for given month and year
    public static void printCalendar(int month, int year) {
        int startDay = getStartDay(month, year);
        int days = getNumberOfDays(month, year);

        // Print calendar header
        System.out.println("\n  " + months[month] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // First loop: spacing for first day
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        // Second loop: print days of the month
        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d ", day);

            if ((day + startDay) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }

    // Get the number of days in a month (check for leap year in Feb)
    public static int getNumberOfDays(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month];
    }

    // Check if the year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Gregorian calendar algorithm to get start day of the month
    public static int getStartDay(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + (31 * m0) / 12) % 7;
        return d0; // 0 = Sunday, ..., 6 = Saturday
    }
}

