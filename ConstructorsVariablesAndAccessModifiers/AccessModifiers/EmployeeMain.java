import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Employee
        System.out.println("Enter Employee Details:");
        System.out.print("Employee ID: ");
        int empID = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Department: ");
        String dept = scanner.nextLine();

        System.out.print("Salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        Employee emp = new Employee(empID, dept, salary);

        System.out.println("\n--- Employee Details ---");
        emp.displayEmployeeDetails();

        // Modify salary
        System.out.print("\nEnter new salary to update: ");
        double newSalary = scanner.nextDouble();
        emp.setSalary(newSalary);

        System.out.println("\n--- Updated Employee Details ---");
        emp.displayEmployeeDetails();

        // Input for Manager
        scanner.nextLine(); // consume newline
        System.out.println("\nEnter Manager Details:");
        System.out.print("Manager ID: ");
        int mgrID = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Department: ");
        String mgrDept = scanner.nextLine();

        System.out.print("Salary: ");
        double mgrSalary = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Team Name: ");
        String team = scanner.nextLine();

        Manager mgr = new Manager(mgrID, mgrDept, mgrSalary, team);

        System.out.println("\n--- Manager Details ---");
        mgr.displayEmployeeDetails();  // inherited
        mgr.displayManagerDetails();   // specific

        scanner.close();
    }
}
