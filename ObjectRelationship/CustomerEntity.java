package ObjectRelationship;

import java.util.ArrayList;

public class CustomerEntity {
    private String name;
    private ArrayList<BankAccount> accounts;

    public CustomerEntity(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("\nAccounts for " + name + ":");
        for (BankAccount account : accounts) {
            System.out.println(account);
        }
    }
}
