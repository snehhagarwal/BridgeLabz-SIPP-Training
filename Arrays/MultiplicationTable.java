package Arrays;

public class MultiplicationTable {
        public static void main(String[] args) {
            // Get the number for which to print the multiplication table
            int number = 9;

            // Define an integer array to store the results of multiplication from 1 to 10
            int[] multiplicationTable = new int[10];

            // Run a loop from 1 to 10 and store the results in the multiplication table array
            for (int i = 1; i <= 10; i++) {
                multiplicationTable[i - 1] = number * i;
            }

            // Finally, display the result from the array in the format number * i = ___
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " * " + i + " = " + multiplicationTable[i - 1]);
            }
        }
}
