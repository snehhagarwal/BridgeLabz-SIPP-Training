
public class StringIndexDemo {
    public static void generateException() {
        String text = "Hello";
        System.out.println(text.charAt(10)); // Throws exception
    }

    public static void handleException() {
        try {
            String text = "Hello";
            System.out.println(text.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        handleException();
    }
}

