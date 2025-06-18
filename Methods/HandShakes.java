public class HandShakes {
    public static int maxHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        System.out.println(maxHandshakes(10));
    }
}

