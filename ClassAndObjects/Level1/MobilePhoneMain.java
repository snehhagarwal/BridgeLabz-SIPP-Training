import java.util.Scanner;

public class MobilePhoneMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input mobile phone details
        System.out.print("Enter Mobile Brand: ");
        String brand = scanner.nextLine();

        System.out.print("Enter Mobile Model: ");
        String model = scanner.nextLine();

        System.out.print("Enter Mobile Price: ");
        double price = scanner.nextDouble();

        // Create MobilePhone object
        MobilePhone phone = new MobilePhone(brand, model, price);

        // Display phone details
        System.out.println();
        phone.displayDetails();

        scanner.close();
    }
}
