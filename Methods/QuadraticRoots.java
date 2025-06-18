import java.util.*;

public class QuadraticRoots {
    public static double[] findRoots(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        if (delta < 0) return new double[0];
        else if (delta == 0) return new double[]{-b / (2 * a)};
        else return new double[]{
            (-b + Math.sqrt(delta)) / (2 * a),
            (-b - Math.sqrt(delta)) / (2 * a)
        };
    }

    public static void main(String[] args) {
        double[] roots = findRoots(1, -3, 2);
        if (roots.length == 0) System.out.println("No real roots");
        else System.out.println("Roots: " + Arrays.toString(roots));
    }
}

