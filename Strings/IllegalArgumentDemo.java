import java.util.Scanner;

public class IllegalArgumentDemo {
    public static void generateException() {
        String text = "HelloWorld";
        System.out.println(text.substring(7, 2)); // Throws exception
    }

    public static void handleException() {
        try {
            String text = "HelloWorld";
            System.out.println(text.substring(7, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Handled IllegalArgumentException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        //generateException();
        handleException();
    }
}

