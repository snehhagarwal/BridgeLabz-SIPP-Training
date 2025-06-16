import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            int physics = getValidMark(scanner, "Physics");
            int chemistry = getValidMark(scanner, "Chemistry");
            int maths = getValidMark(scanner, "Maths");

            double percentage = (physics + chemistry + maths) / 3.0;
            char grade = getGrade(percentage);

            System.out.println("Student " + (i + 1) + " - Percentage: " + percentage + "%, Grade: " + grade);
        }
        scanner.close();
    }

    public static int getValidMark(Scanner scanner, String subject) {
        int mark;
        while (true) {
            System.out.print(subject + " marks (0-100): ");
            mark = scanner.nextInt();
            if (mark >= 0 && mark <= 100) break;
            System.out.println("Invalid input. Try again.");
        }
        return mark;
    }

    public static char getGrade(double percentage) {
        if (percentage >= 80) return 'A';
        if (percentage >= 70) return 'B';
        if (percentage >= 60) return 'C';
        if (percentage >= 50) return 'D';
        if (percentage >= 40) return 'E';
        return 'R';
    }
}
