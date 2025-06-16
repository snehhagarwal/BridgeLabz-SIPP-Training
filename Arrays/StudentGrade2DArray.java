import java.util.Scanner;

public class StudentGrade2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input number of students
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        // Step 2: Create 2D array for marks [n][3] and arrays for percentage and grade
        int[][] marks = new int[n][3]; 
        double[] percentage = new double[n];
        char[] grade = new char[n];

        // Step 3: Take input of marks and validate
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";

                while (true) {
                    System.out.print(subject + ": ");
                    int mark = scanner.nextInt();

                    if (mark >= 0 && mark <= 100) {
                        marks[i][j] = mark;
                        break;
                    } else {
                        System.out.println("Invalid input. Please enter a value between 0 and 100.");
                    }
                }
            }
        }

        // Step 4: Calculate percentage and assign grade
        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;
            grade[i] = getGrade(percentage[i]);
        }

        // Step 5: Display results
        System.out.println("\nResults:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("  Physics: " + marks[i][0]);
            System.out.println("  Chemistry: " + marks[i][1]);
            System.out.println("  Maths: " + marks[i][2]);
            System.out.printf("  Percentage: %.2f%%\n", percentage[i]);
            System.out.println("  Grade: " + grade[i]);
            System.out.println();
        }

        scanner.close();
    }

    // Method to determine grade
    public static char getGrade(double percentage) {
        if (percentage >= 80) return 'A';
        else if (percentage >= 70) return 'B';
        else if (percentage >= 60) return 'C';
        else if (percentage >= 50) return 'D';
        else if (percentage >= 40) return 'E';
        else return 'R';
    }
}

