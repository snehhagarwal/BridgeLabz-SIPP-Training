import java.util.Random;

public class StudentGradeCalculator {

    // Method 1: Generate random marks
    public static int[][] generateScores(int studentCount) {
        Random rand = new Random();
        int[][] scores = new int[studentCount][3]; // Columns: Physics, Chemistry, Math
        for (int i = 0; i < studentCount; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = rand.nextInt(61) + 40; // 40 to 100
            }
        }
        return scores;
    }

    // Method 2: Calculate total, average, percentage (rounded to 2 decimal places)
    public static double[][] calculateStats(int[][] scores) {
        int n = scores.length;
        double[][] result = new double[n][3]; // total, average, percentage
        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return result;
    }

    // Method 3: Calculate grade based on percentage
    public static char[] calculateGrades(double[][] stats) {
        char[] grades = new char[stats.length];
        for (int i = 0; i < stats.length; i++) {
            double percentage = stats[i][2];
            if (percentage >= 80) grades[i] = 'A';
            else if (percentage >= 70) grades[i] = 'B';
            else if (percentage >= 60) grades[i] = 'C';
            else if (percentage >= 50) grades[i] = 'D';
            else if (percentage >= 40) grades[i] = 'E';
            else grades[i] = 'R';
        }
        return grades;
    }

    // Method 4: Display the scorecard
    public static void displayScorecard(int[][] scores, double[][] stats, char[] grades) {
        System.out.printf("%-5s %-8s %-10s %-6s %-7s %-9s %-12s %-7s\n",
                "ID", "Physics", "Chemistry", "Math", "Total", "Average", "Percentage", "Grade");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-5d %-8d %-10d %-6d %-7.0f %-9.2f %-12.2f %-7c\n",
                    (i + 1),
                    scores[i][0],
                    scores[i][1],
                    scores[i][2],
                    stats[i][0],
                    stats[i][1],
                    stats[i][2],
                    grades[i]);
        }
    }

    // Main method
    public static void main(String[] args) {
        int studentCount = 10; // You can change this
        int[][] scores = generateScores(studentCount);
        double[][] stats = calculateStats(scores);
        char[] grades = calculateGrades(stats);
        displayScorecard(scores, stats, grades);
    }
}

