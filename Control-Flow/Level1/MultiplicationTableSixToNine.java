import java.util.Scanner;

public class MultiplicationTableSixToNine {
    public static void main(String[] args) {
        // Get input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Print multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
