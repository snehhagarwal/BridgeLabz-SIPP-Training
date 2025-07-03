package Inheritance;

public class CompanyApp {
    public static void main(String[] args) {
        Manager mgr = new Manager("Ravi Sharma", 101, 95000, 10);
        Developer dev = new Developer("Sneha Agarwal", 102, 85000, "Java");
        Intern intern = new Intern("Ankit Verma", 103, 15000, "IIT Delhi");

        System.out.println("--- Manager Details ---");
        mgr.displayDetails();

        System.out.println("\n--- Developer Details ---");
        dev.displayDetails();

        System.out.println("\n--- Intern Details ---");
        intern.displayDetails();
    }
}

