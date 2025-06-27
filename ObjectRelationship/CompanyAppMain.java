package ObjectRelationship;

import java.util.Scanner;

public class CompanyAppMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Company Name: ");
        String compName = scanner.nextLine();

        Company company = new Company(compName);

        System.out.print("How many departments? ");
        int deptCount = scanner.nextInt();
        scanner.nextLine(); // clear buffer

        for (int i = 0; i < deptCount; i++) {
            System.out.print("Enter Department " + (i + 1) + " name: ");
            String deptName = scanner.nextLine();
            Department dept = company.createDepartment(deptName);

            System.out.print("How many employees in " + deptName + "? ");
            int empCount = scanner.nextInt();
            scanner.nextLine();

            for (int j = 0; j < empCount; j++) {
                System.out.print("Enter name of employee " + (j + 1) + ": ");
                String empName = scanner.nextLine();
                dept.addEmployee(empName);
            }
        }

        // Show the company structure
        company.displayStructure();

        // Simulate deleting company
        System.out.print("\nDo you want to dissolve the company? (yes/no): ");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("yes")) {
            company.dissolveCompany();
        } else {
            System.out.println("Company continues to operate.");
        }

        scanner.close();
    }
}

