import java.util.Scanner;

public class TwoDArrayToOneDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input for rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        // Create a 2D array (matrix)
        int[][] matrix = new int[rows][cols];

        // Take user input for matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Create a 1D array to store the elements of the matrix
        int[] array = new int[rows * cols];

        // Copy the elements of the matrix to the 1D array
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index++] = matrix[i][j];
            }
        }

        // Print the 1D array
        System.out.println("The 1D array is:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
