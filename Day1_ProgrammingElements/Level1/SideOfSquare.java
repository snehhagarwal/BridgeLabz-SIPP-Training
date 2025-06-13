import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Declare variable for perimeter
        double perimeter;

        // Take perimeter input from the user
        System.out.print("Enter the perimeter of the square: ");
        perimeter = input.nextDouble();

        // Calculate the side length (Perimeter = 4 × side)
        double side = perimeter / 4;

        // Output the result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}
