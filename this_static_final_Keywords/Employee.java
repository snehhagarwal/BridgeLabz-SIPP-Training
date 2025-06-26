package this_static_final_Keywords;

// Employee.java
public class Employee {
    // Static variable shared across all instances
    public static String companyName = "TechNova Pvt. Ltd.";
    private static int totalEmployees = 0;

    // Instance variables
    private String name;
    private final int id; // Final ID (immutable)
    private String designation;

    // Constructor using 'this'
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++; // increment on each object creation
    }

    // Static method to show total employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Display employee details
    public void displayEmployeeDetails() {
        System.out.println("Company: " + companyName);
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
    }
}

