import java.util.Scanner;

public class RocketCountdownWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter countdown start:");
        int counter = sc.nextInt(); // Reads the input
        while (counter >= 1) { // Loop until counter is 1
            System.out.println(counter); // Prints the counter
            counter--; // Decrements the counter
        }
        System.out.println("Liftoff!"); // Prints Liftoff!
    }
}
