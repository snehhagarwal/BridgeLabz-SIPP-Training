package ObjectRelationship;

import java.util.ArrayList;

public class Company {
    private String companyName;
    private ArrayList<Department> departments;

    public Company(String name) {
        this.companyName = name;
        departments = new ArrayList<>();
    }

    public Department createDepartment(String deptName) {
        Department department = new Department(deptName);
        departments.add(department);
        return department;
    }

    public void displayStructure() {
        System.out.println("\nCompany: " + companyName);
        for (Department dept : departments) {
            dept.displayEmployees();
        }
    }

    public void dissolveCompany() {
        for (Department dept : departments) {
            dept.clearEmployees();
        }
        departments.clear(); // Simulate deleting all departments
        System.out.println("\nCompany '" + companyName + "' has been dissolved.");
    }
}

