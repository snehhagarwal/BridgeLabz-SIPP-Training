package ConstructorsVariablesAndAccessModifiers.AccessModifiers;

public class PostgraduateStudent extends Student {
    private String specialization;

    // Constructor
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    // Display PG-specific details
    public void displayPGDetails() {
        System.out.println("Specialization: " + specialization);
    }
}
