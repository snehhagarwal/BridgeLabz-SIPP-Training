package ConstructorsVariablesAndAccessModifiers.Variables;

public class Course {
    private String courseName;
    private int duration; // in weeks
    private double fee;

    // Class variable (shared by all instances)
    private static String instituteName = "Default Institute";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Institute   : " + instituteName);
        System.out.println("Course Name : " + courseName);
        System.out.println("Duration    : " + duration + " weeks");
        System.out.printf("Fee         : ₹%.2f\n", fee);
    }

    // Class method to update institute name
    public static void updateInstituteName(String name) {
        instituteName = name;
    }
}
