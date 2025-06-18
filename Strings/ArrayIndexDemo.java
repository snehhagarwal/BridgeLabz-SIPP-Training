public class ArrayIndexDemo {
    public static void generateException() {
        String[] names = {"Alice", "Bob", "Charlie"};
        System.out.println(names[5]); // Throws exception
    }

    public static void handleException() {
        try {
            String[] names = {"Alice", "Bob", "Charlie"};
            System.out.println(names[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        //generateException();
        handleException();
    }
}

