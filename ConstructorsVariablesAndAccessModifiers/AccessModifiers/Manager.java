package ConstructorsVariablesAndAccessModifiers.AccessModifiers;

public class Manager extends Employee {
    private String teamName;

    // Constructor
    public Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }

    // Display manager details
    public void displayManagerDetails() {
        System.out.println("Manager ID    : " + employeeID);    // public access
        System.out.println("Department    : " + department);    // protected access
        System.out.println("Team Managed  : " + teamName);
    }
}

