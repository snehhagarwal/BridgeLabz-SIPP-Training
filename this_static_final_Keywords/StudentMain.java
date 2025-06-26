package this_static_final_Keywords;

// StudentMain.java
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input student details
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNumber = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Grade (A/B/C...): ");
        char grade = sc.next().charAt(0);

        // Create Student object
        Student student = new Student(name, rollNumber, grade);

        // Check with instanceof
        if (student instanceof Student) {
            System.out.println("\n--- Student Details ---");
            student.displayStudentDetails();

            // Optional grade update
            System.out.print("\nDo you want to update grade? (yes/no): ");
            sc.nextLine(); // consume newline
            String response = sc.nextLine();

            if (response.equalsIgnoreCase("yes")) {
                System.out.print("Enter new grade: ");
                char newGrade = sc.next().charAt(0);
                student.updateGrade(newGrade);
            }
        } else {
            System.out.println("Invalid student object.");
        }

        // Display total students
        Student.displayTotalStudents();

        sc.close();
    }
}
