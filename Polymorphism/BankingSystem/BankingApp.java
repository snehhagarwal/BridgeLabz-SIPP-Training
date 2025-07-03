package Polymorphism.BankingSystem;

public class BankingApp {
    public static void processAccount(BankAccount account) {
        account.displayAccountDetails();
        double interest = account.calculateInterest();
        System.out.println("Calculated Interest: ₹" + interest);

        if (account instanceof Loanable) {
            Loanable loanAccount = (Loanable) account;
            loanAccount.applyForLoan(50000);
            boolean eligible = loanAccount.calculateLoanEligibility();
            System.out.println("Loan Eligibility: " + (eligible ? "Eligible" : "Not Eligible"));
        }

        System.out.println("------------------------------------");
    }

    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("SA123", "Sneha Agarwal", 12000);
        BankAccount acc2 = new CurrentAccount("CA456", "Ravi Kumar", 30000);

        processAccount(acc1);
        processAccount(acc2);
    }
}

