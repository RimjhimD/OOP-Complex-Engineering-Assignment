import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.security.auth.login.AccountNotFoundException;

public class BankAccountCatalog {
    private List<BankAccount> accounts;

    public BankAccountCatalog() {
        accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void removeAccountById(int accountId) {
        accounts.removeIf(account -> account.getAccountId() == accountId);
    }

    public BankAccount getAccountById(int accountId) throws AccountNotFoundException {
        for (BankAccount account : accounts) {
            if (account.getAccountId() == accountId) {
                return account;
            }
        }
        throw new AccountNotFoundException("Account not found");
    }

    public List<BankAccount> getAccountsByCustomerName(String customerName) {
        return accounts.stream()
                .filter(account -> account.getCustomerName().equalsIgnoreCase(customerName))
                .collect(Collectors.toList());
    }

    public double getTotalBalance() {
        return accounts.stream()
                .mapToDouble(BankAccount::getBalance)
                .sum();
    }

    public void displayAllAccounts() {
        System.out.println("All Accounts in the Catalog:");
        accounts.forEach(System.out::println);
    }

    public void displayAccountBalanceSummary() {
        System.out.println("Account Balance Summary:");
        accounts.forEach(account -> System.out.println(account.getCustomerName() + ": $" + account.getBalance()));
    }
}
