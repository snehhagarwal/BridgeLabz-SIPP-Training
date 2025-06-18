public class NumberClassifier {
    public static String classifyNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) sum += i;
        }
        if (sum == num) return "Perfect";
        else if (sum > num) return "Abundant";
        else return "Deficient";
    }

    public static void main(String[] args) {
        int num = 28;
        System.out.println(num + " is " + classifyNumber(num));
    }
}

