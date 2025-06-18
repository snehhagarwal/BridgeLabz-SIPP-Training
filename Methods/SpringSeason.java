public class SpringSeason {
    public static boolean isSpring(int month, int day) {
        return (month == 3 && day >= 20) || (month == 6 && day <= 20) || (month > 3 && month < 6);
    }

    public static void main(String[] args) {
        System.out.println(isSpring(4, 10) ? "It's a Spring Season" : "Not a Spring Season");
    }
}
