import java.util.*; // Import Scanner

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Input scanner
        int low = 1, high = 100; // Range
        while (true) { // Loop until guessed
            int guess = getGuess(low, high); // Get middle guess
            System.out.println("Is it " + guess + "? (high/low/correct)"); // Ask user
            String response = sc.nextLine(); // Read response
            if (response.equals("correct")) break; // Guessed
            else if (response.equals("high")) high = guess - 1; // Too high
            else if (response.equals("low")) low = guess + 1; // Too low
        }
    }
    static int getGuess(int low, int high) {
        return (low + high) / 2; // Middle value
    }
}
