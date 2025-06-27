package ObjectRelationship;

public class Employee {
    private String name;
    private int employeeId;
    private static int idCounter = 100;

    public Employee(String name) {
        this.name = name;
        this.employeeId = idCounter++;
    }

    public String getDetails() {
        return "Employee ID: " + employeeId + ", Name: " + name;
    }
}

