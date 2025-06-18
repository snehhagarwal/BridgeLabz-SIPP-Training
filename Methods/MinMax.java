public class MinMax {
    public static int[] findSmallestAndLargest(int a, int b, int c) {
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        int[] res = findSmallestAndLargest(5, 2, 9);
        System.out.println(res[0] + " " + res[1]);
    }
}

