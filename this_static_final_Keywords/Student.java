package this_static_final_Keywords;

// Student.java
public class Student {
    // Static members
    public static String universityName = "Global Tech University";
    private static int totalStudents = 0;

    // Instance members
    private String name;
    private final int rollNumber; // Immutable
    private char grade;

    // Constructor using 'this'
    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    // Static method
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("University: " + universityName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }

    // Method to update grade
    public void updateGrade(char newGrade) {
        this.grade = newGrade;
        System.out.println("Grade updated to: " + grade);
    }
}
