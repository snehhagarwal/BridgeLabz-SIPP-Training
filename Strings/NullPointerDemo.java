public class NullPointerDemo {
    public static void generateNullPointerException() {
        String text = null;
        System.out.println(text.length()); // This will throw NullPointerException
    }

    public static void handleNullPointerException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        handleNullPointerException();
    }
}

