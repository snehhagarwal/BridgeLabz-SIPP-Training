package Polymorphism.BankingSystem;

public class CurrentAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.02; // 2% annual

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Business loan of ₹" + amount + " applied.");
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 25000; // Eligible if balance ≥ ₹25,000
    }
}

