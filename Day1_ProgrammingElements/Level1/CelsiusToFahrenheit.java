import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Declare variable for Celsius temperature
        double celsius;

        // Take input from user
        System.out.print("Enter temperature in Celsius: ");
        celsius = input.nextDouble();

        // Convert Celsius to Fahrenheit
        double fahrenheitResult = (celsius * 9 / 5) + 32;

        // Output the result
        System.out.println("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit");
    }
}
