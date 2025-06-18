import java.util.*;

public class FootballTeamHeights {
    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();

        for (int i = 0; i < 11; i++) {
            heights[i] = 150 + rand.nextInt(101); // 150 to 250
        }

        int sum = Arrays.stream(heights).sum();
        double mean = sum / 11.0;
        int min = Arrays.stream(heights).min().getAsInt();
        int max = Arrays.stream(heights).max().getAsInt();

        System.out.println("Heights: " + Arrays.toString(heights));
        System.out.println("Shortest: " + min);
        System.out.println("Tallest: " + max);
        System.out.println("Mean: " + mean);
    }
}

