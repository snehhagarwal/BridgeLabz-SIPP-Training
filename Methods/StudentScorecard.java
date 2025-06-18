import java.util.Scanner;
import java.util.Random;

public class StudentScorecard {

    // Method to generate random PCM marks for students
    public static int[][] generateScores(int numberOfStudents) {
        Random rand = new Random();
        int[][] scores = new int[numberOfStudents][3]; // 3 subjects: Physics, Chemistry, Math

        for (int i = 0; i < numberOfStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = rand.nextInt(41) + 60; // generates score from 60 to 100
            }
        }
        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        int numberOfStudents = scores.length;
        double[][] result = new double[numberOfStudents][3]; // [total, average, percentage]

        for (int i = 0; i < numberOfStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Rounding to 2 decimal places
            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return result;
    }

    // Method to get grade based on percentage
    public static String getGrade(double percentage) {
        if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else if (percentage >= 40) return "E";
        else return "R";
    }

    // Method to display scorecard
    public static void printScorecard(int[][] scores, double[][] results) {
        System.out.println("S.No\tPhysics\tChemistry\tMath\tTotal\tAverage\t\tPercentage\tGrade");
        for (int i = 0; i < scores.length; i++) {
            String grade = getGrade(results[i][2]);
            System.out.println((i + 1) + "\t" +
                    scores[i][0] + "\t" +
                    scores[i][1] + "\t\t" +
                    scores[i][2] + "\t" +
                    (int) results[i][0] + "\t" +
                    results[i][1] + "\t\t" +
                    results[i][2] + "%\t\t" +
                    grade);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] scores = generateScores(n);
        double[][] results = calculateResults(scores);
        printScorecard(scores, results);
    }
}

