import java.util.Scanner;

public class FizzBuzzWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hey there! Enter a positive integer: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Oops! Invalid input. Please enter a positive number.");
            return;
        }

        int i = 1; // Let's start counting from 1
        while (i <= n) {
            if (i % 15 == 0) System.out.println("FizzBuzz"); // Multiples of both 3 and 5
            else if (i % 3 == 0) System.out.println("Fizz"); // Multiples of 3
            else if (i % 5 == 0) System.out.println("Buzz"); // Multiples of 5
            else System.out.println(i); // Just print the number
            i++; // Increment the counter
        }
        sc.close();
    }
}
