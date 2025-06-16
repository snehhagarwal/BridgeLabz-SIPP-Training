import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Declare a double array named heights of size 11
        double[] heights = new double[11];

        // Prompt the user to enter the heights of the players
        System.out.println("Enter the heights of 11 players:");

        // Read the heights of the players from the user and store them in the array
        for (int i = 0; i < heights.length; i++) {
            heights[i] = scanner.nextDouble();
        }

        // Calculate the sum of all the elements in the array
        double sum = 0;
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }

        // Calculate the mean height
        double mean = sum / heights.length;

        // Print the mean height of the football team
        System.out.println("The mean height of the football team is: " + mean);

        // Close the scanner
        scanner.close();
    }
}
