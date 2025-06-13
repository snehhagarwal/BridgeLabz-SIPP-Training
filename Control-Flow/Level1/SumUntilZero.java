import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        System.out.print("Enter numbers (0 to stop): ");
        while (true) {
            double num = sc.nextDouble(); // Read input
            if (num == 0) break; // Exit loop if 0
            total += num; // Add to total
        }
        System.out.println("Total sum: " + total);
    }
}
