import java.util.*; // import Scanner

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // input
        int n = sc.nextInt(); // read n
        printFib(n); // call
    }
    static void printFib(int n) {
        int a = 0, b = 1; // init
        for (int i = 0; i < n; i++) { // loop
            System.out.print(a + " "); // print
            int temp = a + b; // sum
            a = b; // update
            b = temp; // update
        }
    }
}
