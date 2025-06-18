import java.util.Scanner;

public class EvenDigitProduct {
    public static int productEvenDigits(int num) {
        int product = 1;
        boolean hasEven = false;
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                product *= digit;
                hasEven = true;
            }
            num /= 10;
        }
        return hasEven ? product : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        System.out.println("Product of even digits: " + productEvenDigits(num));
    }
}

