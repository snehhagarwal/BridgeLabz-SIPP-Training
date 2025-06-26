package this_static_final_Keywords;

public class BankAccount {
    // Static members
    public static String bankName = "State Bank of India";
    private static int totalAccounts = 0;

    // Instance members
    private final int accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccounts++;  // Increase count for each new account
    }

    // Static method
    public static void getTotalAccounts() {
        System.out.println("Total accounts created: " + totalAccounts);
    }

    // Display details
    public void displayAccountDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: ₹" + balance);
    }
}

