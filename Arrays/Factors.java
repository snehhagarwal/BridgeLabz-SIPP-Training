import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Take the input for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // 2. Find the factors of the number and save them in an array.
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // 3. To find factors, loop through the numbers from 1 to the number
        for (int i = 1; i <= number; i++) {
            // find the factors
            if (number % i == 0) {
                // and add them to the array element by incrementing the index
                factors[index] = i;
                index++;

                // If the index is equal to maxIndex, then the need factors array to store more elements
                if (index == maxFactor) {
                    // 4. To store more elements, reset the maxIndex to twice its size
                    maxFactor *= 2;
                    // use the temp array to store the elements from the factors array
                    int[] temp = new int[maxFactor];
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }
                    // and eventually assign the factors array to the temp array
                    factors = temp;
                }
            }
        }

        // 5. Finally, display the factors of the number
        System.out.print("Factors of " + number + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
