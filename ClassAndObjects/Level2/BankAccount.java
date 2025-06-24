public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, String accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("₹%.2f deposited successfully.\n", amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount <= balance) {
            balance -= amount;
            System.out.printf("₹%.2f withdrawn successfully.\n", amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Method to display current balance
    public void displayBalance() {
        System.out.printf("Current Balance: ₹%.2f\n", balance);
    }

    // Method to display account info
    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        displayBalance();
    }
}
