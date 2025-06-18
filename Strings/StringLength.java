import java.util.Scanner;

public class StringLength {
    public static int getLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count++);
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        System.out.println("Length using custom method: " + getLength(text));
        System.out.println("Length using built-in: " + text.length());
    }
}

