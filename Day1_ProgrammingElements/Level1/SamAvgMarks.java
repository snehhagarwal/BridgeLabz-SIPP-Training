public class SamAvgMarks {
    public static void main(String[] args) {
        // As per the problem statement, marks are out of 100.
        int mathsMark = 94;     // Sam's mark in Maths
        int physicsMark = 95;   // Sam's mark in Physics
        int chemistryMark = 96; // Sam's mark in Chemistry

        // Calculate the total marks obtained by Sam.
        int totalMarks = mathsMark + physicsMark + chemistryMark;

        // Calculate the number of subjects to find the average.
        int numberOfSubjects = 3; 

        // Calculate the average mark.
        double averageMark = (double) totalMarks / numberOfSubjects;
        System.out.printf("Sam's average mark in PCM is %.2f%n", averageMark);
    }
}
