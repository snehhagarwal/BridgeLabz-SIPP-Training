public class TrigFunctions {
    public static double[] calculateTrigonometricFunctions(double angle) {
        double rad = Math.toRadians(angle);
        return new double[]{Math.sin(rad), Math.cos(rad), Math.tan(rad)};
    }

    public static void main(String[] args) {
        double[] res = calculateTrigonometricFunctions(45);
        for (double d : res) System.out.println(d);
    }
}

