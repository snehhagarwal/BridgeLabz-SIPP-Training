package ObjectRelationship;

import java.util.ArrayList;

public class Department {
    private String deptName;
    private ArrayList<Employee> employees;

    public Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String empName) {
        Employee employee = new Employee(empName);
        employees.add(employee);
    }

    public void displayEmployees() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            System.out.println("  - " + e.getDetails());
        }
    }

    public void clearEmployees() {
        employees.clear(); // Simulate deletion
    }
}

