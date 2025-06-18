public class NumberFormatDemo {
    public static void generateNumberFormatException() {
        String text = "abc";
        int number = Integer.parseInt(text); // Throws NumberFormatException
        System.out.println(number);
    }

    public static void handleNumberFormatException() {
        try {
            String text = "abc";
            int number = Integer.parseInt(text);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Handled NumberFormatException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        handleNumberFormatException();
    }
}

