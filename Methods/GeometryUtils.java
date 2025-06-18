public class GeometryUtils {
    public static double euclideanDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] lineEquation(int x1, int y1, int x2, int y2) {
        double m = (y2 - y1) / (double)(x2 - x1);
        double b = y1 - m * x1;
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        double dist = euclideanDistance(1, 2, 4, 6);
        double[] line = lineEquation(1, 2, 4, 6);
        System.out.println("Distance: " + dist);
        System.out.println("Line: y = " + line[0] + "x + " + line[1]);
    }
}

