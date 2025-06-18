import java.util.Scanner;

public class RocketCountdownForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter countdown start: ");
        int counter = sc.nextInt(); // Reads the start value
        for (int i = counter; i >= 1; i--) { // Loop from start to 1
            System.out.println(i); // Prints the current value
        }
        System.out.println("Liftoff!"); // Prints liftoff
    }
}
