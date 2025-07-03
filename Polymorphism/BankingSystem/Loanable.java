package Polymorphism.BankingSystem;

public interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}
