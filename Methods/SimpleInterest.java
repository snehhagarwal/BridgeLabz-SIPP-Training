public class SimpleInterest {
    public static double calcSI(double p, double r, double t) {
        return p * r * t / 100;
    }

    public static void main(String[] args) {
        double si = calcSI(1000, 5, 2);
        System.out.println("The Simple Interest is " + si);
    }
}

