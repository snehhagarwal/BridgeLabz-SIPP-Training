public class SumNatural {
    public static int sumNatural(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumNatural(10));
    }
}

