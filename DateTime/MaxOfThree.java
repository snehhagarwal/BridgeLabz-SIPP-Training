import java.util.*; // Import utility classes

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for input
        int a = input(sc), b = input(sc), c = input(sc); // Read three numbers
        System.out.println("Max is " + max(a, b, c)); // Print max
    }
    static int input(Scanner sc) {
        return sc.nextInt(); // Read int
    }
    static int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c)); // Find max
    }
}
