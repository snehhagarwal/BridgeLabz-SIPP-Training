package ObjectRelationship;

import java.util.Scanner;

public class BankAppMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankEntity bank = new BankEntity("Horizon Bank");

        System.out.print("How many customers? ");
        int customerCount = scanner.nextInt();
        scanner.nextLine(); // clear buffer

        CustomerEntity[] customers = new CustomerEntity[customerCount];

        for (int i = 0; i < customerCount; i++) {
            System.out.print("Enter name of customer " + (i + 1) + ": ");
            String name = scanner.nextLine();
            customers[i] = new CustomerEntity(name);

            System.out.print("How many accounts to open for " + name + "? ");
            int accountCount = scanner.nextInt();

            for (int j = 0; j < accountCount; j++) {
                System.out.print("Initial deposit for account " + (j + 1) + ": ₹");
                double deposit = scanner.nextDouble();
                bank.openAccount(customers[i], deposit);
            }
            scanner.nextLine(); // clear buffer
        }

        bank.listCustomers();

        for (CustomerEntity customer : customers) {
            customer.viewBalance();
        }

        scanner.close();
    }
}

