import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Declare variables for base and height
        double base, height;

        // Take input from user
        System.out.print("Enter the base of the triangle in cm: ");
        base = input.nextDouble();

        System.out.print("Enter the height of the triangle in cm: ");
        height = input.nextDouble();

        // Calculate area in square centimeters
        double areaSqCm = 0.5 * base * height;

        // Convert cm² to inches² (1 inch = 2.54 cm => 1 in² = 6.4516 cm²)
        double areaSqIn = areaSqCm / 6.4516;

        // Output the result
        System.out.println("The Area of the triangle in sq in is " + areaSqIn + " and sq cm is " + areaSqCm);
    }
}
