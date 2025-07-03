package Polymorphism;

import java.util.ArrayList;

public class EMSApp {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        FullTimeEmployee fte = new FullTimeEmployee(1, "Rohit Sharma", 50000, 10000);
        fte.assignDepartment("Engineering");

        PartTimeEmployee pte = new PartTimeEmployee(2, "Priya Mehta", 500, 80);
        pte.assignDepartment("Support");

        employees.add(fte);
        employees.add(pte);

        for (Employee emp : employees) {
            emp.displayDetails();
            if (emp instanceof Department) {
                System.out.println(((Department) emp).getDepartmentDetails());
            }
            System.out.println("---------------------------------");
        }
    }
}

