public class PenEquallyDivided {
    public static void main(String[] args) {
        // Total number of pens
        int totalPens = 14;

        // Total number of students
        int students = 3;

        // Calculate pens per student using division
        int pensPerStudent = totalPens / students;

        // Calculate remaining pens using modulus
        int remainingPens = totalPens % students;

        // Output the result
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}
