import java.util.Scanner;

public class NumberSignCheck {
    public static void main(String[] args) {
        // Read input from the user
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        // Check if the number is positive
        if (number > 0)
            System.out.println("positive");
        // Check if the number is negative
        else if (number < 0)
            System.out.println("negative");
        // If not positive or negative, it must be zero
        else
            System.out.println("zero");
    }
}
