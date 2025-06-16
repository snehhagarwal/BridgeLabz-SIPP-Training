import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input number of persons
        System.out.print("Enter the number of persons: ");
        int number = scanner.nextInt();

        // Step 2: Declare arrays
        double[][] personData = new double[number][3]; // [height, weight, BMI]
        String[] weightStatus = new String[number];

        // Step 3: Input height and weight
        for (int i = 0; i < number; i++) {
            System.out.println("Enter data for Person " + (i + 1));

            // Height input
            while (true) {
                System.out.print("Height (in meters): ");
                double height = scanner.nextDouble();
                if (height > 0) {
                    personData[i][0] = height;
                    break;
                } else {
                    System.out.println("Invalid input. Height must be positive.");
                }
            }

            // Weight input
            while (true) {
                System.out.print("Weight (in kg): ");
                double weight = scanner.nextDouble();
                if (weight > 0) {
                    personData[i][1] = weight;
                    break;
                } else {
                    System.out.println("Invalid input. Weight must be positive.");
                }
            }

            // Step 4: Calculate BMI
            double height = personData[i][0];
            double weight = personData[i][1];
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            // Step 5: Determine weight status
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Step 6: Display results
        System.out.println("\nBMI Results:");
        for (int i = 0; i < number; i++) {
            System.out.printf("Person %d:\n", (i + 1));
            System.out.printf("  Height: %.2f m\n", personData[i][0]);
            System.out.printf("  Weight: %.2f kg\n", personData[i][1]);
            System.out.printf("  BMI: %.2f\n", personData[i][2]);
            System.out.println("  Status: " + weightStatus[i]);
            System.out.println();
        }

        scanner.close();
    }
}

