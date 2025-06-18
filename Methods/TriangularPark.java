public class TriangularPark {
    public static double computeRounds(double a, double b, double c) {
        double peri = a + b + c;
        return 5000 / peri;
    }

    public static void main(String[] args) {
        System.out.println(computeRounds(100, 200, 150));
    }
}

