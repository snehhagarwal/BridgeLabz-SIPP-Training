package ConstructorsVariablesAndAccessModifiers.AccessModifiers;

import java.util.Scanner;

public class UniversityMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for regular student
        System.out.println("Enter details for Student:");
        System.out.print("Roll Number: ");
        int roll = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("CGPA: ");
        double cgpa = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        Student student = new Student(roll, name, cgpa);
        System.out.println("\n--- Student Details ---");
        student.displayDetails();

        // Input for postgraduate student
        System.out.println("\nEnter details for Postgraduate Student:");
        System.out.print("Roll Number: ");
        int pgRoll = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Name: ");
        String pgName = scanner.nextLine();

        System.out.print("CGPA: ");
        double pgCgpa = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Specialization: ");
        String specialization = scanner.nextLine();

        PostgraduateStudent pgStudent = new PostgraduateStudent(pgRoll, pgName, pgCgpa, specialization);
        System.out.println("\n--- Postgraduate Student Details ---");
        pgStudent.displayDetails();
        pgStudent.displayPGDetails();

        scanner.close();
    }
}
