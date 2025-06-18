public class MatrixOperations2 {

    // Method to display a matrix
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%6.2f", value);
            }
            System.out.println();
        }
        System.out.println();
    }

    // Method to find the transpose of a matrix
    public static double[][] transpose(double[][] matrix) {
        double[][] transposed = new double[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                transposed[j][i] = matrix[i][j];
        return transposed;
    }

    // Method to find the determinant of a 3x3 matrix
    public static double determinant(double[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1]) -
               m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0]) +
               m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    // Method to get cofactor of a 3x3 matrix
    public static double[][] cofactor(double[][] m) {
        double[][] cof = new double[3][3];

        cof[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1]);
        cof[0][1] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]);
        cof[0][2] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0]);

        cof[1][0] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]);
        cof[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0]);
        cof[1][2] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]);

        cof[2][0] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1]);
        cof[2][1] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]);
        cof[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0]);

        return cof;
    }

    // Method to find the inverse of a 3x3 matrix
    public static double[][] inverse(double[][] m) {
        double det = determinant(m);
        if (det == 0) {
            throw new ArithmeticException("Matrix is not invertible (det = 0)");
        }

        double[][] cof = cofactor(m);
        double[][] adj = transpose(cof);
        double[][] inv = new double[3][3];

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                inv[i][j] = adj[i][j] / det;

        return inv;
    }

    public static void main(String[] args) {
        double[][] matrix = {
            {1, 2, 3},
            {0, 1, 4},
            {5, 6, 0}
        };

        System.out.println("Original Matrix:");
        displayMatrix(matrix);

        System.out.println("Transpose of Matrix:");
        displayMatrix(transpose(matrix));

        double det = determinant(matrix);
        System.out.println("Determinant: " + det);

        System.out.println("Cofactor Matrix:");
        displayMatrix(cofactor(matrix));

        System.out.println("Inverse Matrix:");
        displayMatrix(inverse(matrix));
    }
}

