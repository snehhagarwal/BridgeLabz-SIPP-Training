import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input student details
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNumber = scanner.nextInt();

        System.out.print("Enter Marks (out of 100): ");
        double marks = scanner.nextDouble();

        // Create Student object
        Student student = new Student(name, rollNumber, marks);

        // Display student details and grade
        System.out.println();
        student.displayDetails();

        scanner.close();
    }
}