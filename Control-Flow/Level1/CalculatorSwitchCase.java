import java.util.Scanner;

// Simple calculator using switch-case in Java
public class CalculatorSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for the first number
        System.out.print("Enter first number: ");
        double first = sc.nextDouble();

        // Ask user for the second number
        System.out.print("Enter second number: ");
        double second = sc.nextDouble();

        // Ask user for the operator
        System.out.print("Enter operator (+, -, *, /): ");
        String op = sc.next();

        // Perform calculation based on the operator
        switch (op) {
            case "+":
                // Addition
                System.out.println("Result: " + (first + second));
                break;
            case "-":
                // Subtraction
                System.out.println("Result: " + (first - second));
                break;
            case "*":
                // Multiplication
                System.out.println("Result: " + (first * second));
                break;
            case "/":
                // Division, check for division by zero
                if (second != 0) {
                    System.out.println("Result: " + (first / second));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            default:
                // If operator is not valid
                System.out.println("Invalid Operator");
        }
    }
}
