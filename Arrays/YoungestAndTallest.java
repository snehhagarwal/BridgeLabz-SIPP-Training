import java.util.Scanner;

public class YoungestAndTallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Input ages and heights for each friend
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age for " + names[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter height for " + names[i] + " (in meters): ");
            heights[i] = scanner.nextDouble();
        }

        // Find the youngest friend
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        // Find the tallest friend
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display the youngest and tallest friends
        System.out.println("The youngest friend is: " + names[youngestIndex]);
        System.out.println("The tallest friend is: " + names[tallestIndex]);

        scanner.close();
    }
}
