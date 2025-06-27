package ObjectRelationship;

import java.util.ArrayList;

public class BankEntity {
    private String bankName;
    private ArrayList<CustomerEntity> customers;

    public BankEntity(String bankName) {
        this.bankName = bankName;
        customers = new ArrayList<>();
    }

    public void openAccount(CustomerEntity customer, double initialDeposit) {
        BankAccount newAccount = new BankAccount(initialDeposit);
        customer.addAccount(newAccount);

        if (!customers.contains(customer)) {
            customers.add(customer);
        }

        System.out.println("Account opened for " + customer.getName() +
                           " with ₹" + initialDeposit + " in " + bankName + " Bank.");
    }

    public void listCustomers() {
        System.out.println("\nCustomers of " + bankName + " Bank:");
        for (CustomerEntity c : customers) {
            System.out.println("- " + c.getName());
        }
    }
}

