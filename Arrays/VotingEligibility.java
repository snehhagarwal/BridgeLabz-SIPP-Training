import java.util.Scanner;

public class VotingEligibility {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define an array to store the ages of 10 students
        int[] ages = new int[10];

        // Take user input for the age of each student
        for (int i = 0; i < ages.length; i++) {
            ages[i] = scanner.nextInt();
        }

        // Check voting eligibility for each student
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                System.out.println("Invalid age for student "); // Handle negative age
            } else if (ages[i] >= 18) {
                System.out.println("The student with the age " + ages[i] + " can vote."); // Eligible to vote
            } else {
                System.out.println("The student with the age " + ages[i] + " cannot vote."); // Not eligible to vote
            }
        }

        scanner.close();
    }
}
