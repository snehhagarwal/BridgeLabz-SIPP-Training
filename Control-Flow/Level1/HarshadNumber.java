import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int sumOfDigits = 0;
        
        // Calculate sum of digits
        while (number != 0) {
            int lastDigit = number % 10;
            sumOfDigits += lastDigit;
            number /= 10;
        }
        
        // Check if Harshad number
        if (originalNumber % sumOfDigits == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }
        scanner.close();
    }
}
