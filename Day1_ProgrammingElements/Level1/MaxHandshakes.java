import java.util.Scanner;

public class MaxHandshake {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Declare variable for number of students
        int numberOfStudents;

        // Take input from user
        System.out.print("Enter the number of students: ");
        numberOfStudents = input.nextInt();

        // Calculate maximum number of handshakes
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display result
        System.out.println("The maximum number of possible handshakes is " + handshakes);
    }
}
