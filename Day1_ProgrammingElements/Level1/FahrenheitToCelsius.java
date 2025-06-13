import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Declare variable for Fahrenheit temperature
        double fahrenheit;

        // Take input from user
        System.out.print("Enter temperature in Fahrenheit: ");
        fahrenheit = input.nextDouble();

        // Convert Fahrenheit to Celsius
        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        // Output the result
        System.out.println("The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius");
    }
}
