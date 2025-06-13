import java.util.Scanner;

public class FirstNumberSmallestCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter three numbers
        System.out.print("Enter three numbers: ");
        int num1 = sc.nextInt(); // Read the first number
        int num2 = sc.nextInt(); // Read the second number
        int num3 = sc.nextInt(); // Read the third number

        // Check if the first number is the smallest among the three
        boolean isFirstSmallest = (num1 <= num2 && num1 <= num3);

        // Display the result to the user
        System.out.println("Is the first number the smallest? " + isFirstSmallest);
    }
}
