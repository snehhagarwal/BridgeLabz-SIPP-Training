public class WindChill {
    public static double calculateWindChill(double temp, double speed) {
        return 35.74 + 0.6215 * temp - 35.75 * Math.pow(speed, 0.16) + 0.4275 * temp * Math.pow(speed, 0.16);
    }

    public static void main(String[] args) {
        System.out.println(calculateWindChill(30, 10));
    }
}
