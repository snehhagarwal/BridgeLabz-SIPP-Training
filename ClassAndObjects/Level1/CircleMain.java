import java.util.Scanner;

public class CircleMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take radius as input
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Create Circle object
        Circle circle = new Circle(radius);

        // Display area and circumference
        circle.displayDetails();

        scanner.close();
    }
}
