package ConstructorsVariablesAndAccessModifiers.AccessModifiers;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Display SavingsAccount-specific and inherited details
    public void displaySavingsDetails() {
        System.out.println("Savings Account Info:");
        System.out.println("Account Number : " + accountNumber);     // public: accessible
        System.out.println("Account Holder : " + accountHolder);     // protected: accessible in subclass
        System.out.printf("Interest Rate  : %.2f%%\n", interestRate);
    }
}