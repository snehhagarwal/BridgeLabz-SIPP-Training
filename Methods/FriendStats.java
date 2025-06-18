import java.util.Scanner;

public class FriendStats {
    
    // Method to find index of youngest friend
    public static int findYoungest(int[] ages) {
        int minIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minIndex]) minIndex = i;
        }
        return minIndex;
    }

    // Method to find index of tallest friend
    public static int findTallest(float[] heights) {
        int maxIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxIndex]) maxIndex = i;
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        float[] heights = new float[3];

        // Input ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + " in cm: ");
            heights[i] = sc.nextFloat();
        }

        int youngestIndex = findYoungest(ages);
        int tallestIndex = findTallest(heights);

        // Output results
        System.out.println("Youngest: " + names[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("Tallest: " + names[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm)");

        sc.close();
    }
}

