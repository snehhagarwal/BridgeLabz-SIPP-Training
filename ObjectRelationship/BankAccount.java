package ObjectRelationship;

public class BankAccount {
    private static int idCounter = 1000;
    private int accountNumber;
    private double balance;

    public BankAccount(double initialDeposit) {
        this.accountNumber = idCounter++;
        this.balance = initialDeposit;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        return "Account #" + accountNumber + " | Balance: ₹" + balance;
    }
}

