public class Division {
    public static int[] findRemainderAndQuotient(int num, int div) {
        return new int[]{num / div, num % div};
    }

    public static void main(String[] args) {
        int[] res = findRemainderAndQuotient(25, 4);
        System.out.println("Quotient: " + res[0] + ", Remainder: " + res[1]);
    }
}

