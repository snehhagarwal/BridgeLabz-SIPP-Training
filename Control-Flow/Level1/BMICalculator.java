import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter their weight in kilograms
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();

        // Ask the user to enter their height in centimeters
        System.out.print("Enter height in cm: ");
        double heightCm = sc.nextDouble();

        // Convert height from centimeters to meters
        double heightM = heightCm / 100.0;

        // Calculate BMI using the formula: weight (kg) / (height (m) * height (m))
        double bmi = weight / (heightM * heightM);

        String status = "";

        // Determine BMI category based on calculated value
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Display the calculated BMI and the corresponding status
        System.out.println("Your BMI is: " + bmi);
        System.out.println("You are classified as: " + status);
    }
}
