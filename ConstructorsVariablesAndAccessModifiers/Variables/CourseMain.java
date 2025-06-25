package ConstructorsVariablesAndAccessModifiers.Variables;

import java.util.Scanner;

public class CourseMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get and update institute name
        System.out.print("Enter Institute Name: ");
        String institute = scanner.nextLine();
        Course.updateInstituteName(institute);

        // Ask number of courses
        System.out.print("Enter number of courses: ");
        int count = scanner.nextInt();
        scanner.nextLine(); // consume newline

        Course[] courses = new Course[count];

        // Input course details
        for (int i = 0; i < count; i++) {
            System.out.println("\nEnter details for Course " + (i + 1));

            System.out.print("Course Name: ");
            String name = scanner.nextLine();

            System.out.print("Duration (in weeks): ");
            int duration = scanner.nextInt();

            System.out.print("Fee: ");
            double fee = scanner.nextDouble();
            scanner.nextLine(); // consume newline

            courses[i] = new Course(name, duration, fee);
        }

        // Display course details
        System.out.println("\n--- Course Details ---");
        for (Course course : courses) {
            course.displayCourseDetails();
            System.out.println();
        }

        scanner.close();
    }
}
