import java.util.Random;

public class MatrixOperations {

    public static int[][] generateMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random rand = new Random();
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(10);
        return matrix;
    }

    public static int[][] add(int[][] a, int[][] b) {
        int[][] res = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                res[i][j] = a[i][j] + b[i][j];
        return res;
    }

    public static int[][] subtract(int[][] a, int[][] b) {
        int[][] res = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                res[i][j] = a[i][j] - b[i][j];
        return res;
    }

    public static int[][] multiply(int[][] a, int[][] b) {
        int[][] res = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < b[0].length; j++)
                for (int k = 0; k < b.length; k++)
                    res[i][j] += a[i][k] * b[k][j];
        return res;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int v : row) System.out.print(v + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] a = generateMatrix(2, 2);
        int[][] b = generateMatrix(2, 2);
        System.out.println("Matrix A:");
        printMatrix(a);
        System.out.println("Matrix B:");
        printMatrix(b);
        System.out.println("Addition:");
        printMatrix(add(a, b));
        System.out.println("Subtraction:");
        printMatrix(subtract(a, b));
        System.out.println("Multiplication:");
        printMatrix(multiply(a, b));
    }
}

