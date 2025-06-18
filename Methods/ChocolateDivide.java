public class ChocolateDivide {
    public static int[] findRemainderAndQuotient(int choco, int kids) {
        return new int[]{choco / kids, choco % kids};
    }

    public static void main(String[] args) {
        int[] res = findRemainderAndQuotient(23, 5);
        System.out.println("Each: " + res[0] + ", Left: " + res[1]);
    }
}

