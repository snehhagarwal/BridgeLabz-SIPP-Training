package ConstructorsVariablesAndAccessModifiers.AccessModifiers;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for basic BankAccount
        System.out.println("Enter Bank Account Details:");
        System.out.print("Account Number: ");
        String accNo = scanner.nextLine();

        System.out.print("Account Holder Name: ");
        String holder = scanner.nextLine();

        System.out.print("Initial Balance: ");
        double balance = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        BankAccount acc = new BankAccount(accNo, holder, balance);

        System.out.println("\n--- Bank Account Details ---");
        acc.displayAccountDetails();

        // Modify balance using setter
        System.out.print("\nEnter new balance to update: ");
        double newBalance = scanner.nextDouble();
        acc.setBalance(newBalance);

        System.out.println("\n--- Updated Account Details ---");
        acc.displayAccountDetails();

        // Input for SavingsAccount
        scanner.nextLine(); // consume leftover newline
        System.out.println("\nEnter Savings Account Details:");
        System.out.print("Account Number: ");
        String savAccNo = scanner.nextLine();

        System.out.print("Account Holder Name: ");
        String savHolder = scanner.nextLine();

        System.out.print("Initial Balance: ");
        double savBalance = scanner.nextDouble();

        System.out.print("Interest Rate (%): ");
        double rate = scanner.nextDouble();

        SavingsAccount savings = new SavingsAccount(savAccNo, savHolder, savBalance, rate);

        System.out.println("\n--- Savings Account Details ---");
        savings.displayAccountDetails();     // inherited from BankAccount
        savings.displaySavingsDetails();     // from subclass

        scanner.close();
    }
}
