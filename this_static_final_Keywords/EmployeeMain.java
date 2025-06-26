package this_static_final_Keywords;

// EmployeeMain.java
import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input details
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Designation: ");
        String designation = sc.nextLine();

        // Create Employee object
        Employee emp = new Employee(name, id, designation);

        // Use instanceof to check
        if (emp instanceof Employee) {
            System.out.println("\n--- Employee Details ---");
            emp.displayEmployeeDetails();
        } else {
            System.out.println("Invalid employee object.");
        }

        // Display total employees
        Employee.displayTotalEmployees();

        sc.close();
    }
}

