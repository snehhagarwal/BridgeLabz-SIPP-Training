import java.util.Scanner;

public class PowerOfNumberWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int number = sc.nextInt(); // Reads the base number from the user
        System.out.print("Enter power: ");
        int power = sc.nextInt(); // Reads the power from the user
        long result = 1;
        int counter = 0;
        while (counter < power) { // Loop until the counter is less than the power
            result *= number; // Multiply the result by the base number
            counter++; // Increment the counter
        }
        System.out.println(number + "^" + power + " = " + result); // Prints the result
    }
}
