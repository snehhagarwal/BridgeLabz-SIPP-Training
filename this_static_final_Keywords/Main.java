package this_static_final_Keywords;

// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input details
        System.out.print("Enter Account Number: ");
        int accNumber = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Account Holder Name: ");
        String holderName = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        // Create BankAccount object
        BankAccount account = new BankAccount(accNumber, holderName, balance);

        // Check using instanceof
        if (account instanceof BankAccount) {
            System.out.println("\n--- Account Details ---");
            account.displayAccountDetails();
        } else {
            System.out.println("Invalid account object.");
        }

        // Display total accounts
        BankAccount.getTotalAccounts();

        sc.close();
    }
}
