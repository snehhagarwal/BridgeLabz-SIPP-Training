import java.util.Scanner;

public class PalindromeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input text from user
        System.out.print("Enter a string to check for palindrome: ");
        String inputText = scanner.nextLine();

        // Create PalindromeChecker object
        PalindromeChecker checker = new PalindromeChecker(inputText);

        // Display result
        System.out.println();
        checker.displayResult();

        scanner.close();
    }
}
