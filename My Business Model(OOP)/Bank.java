
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bank {
    private Account[] accounts;
    private List<Transaction>[] transactionHistory;
    private int numAccounts;

    @SuppressWarnings("unchecked")
public Bank(int capacity) {
    if (capacity <= 0) {
        throw new IllegalArgumentException("Capacity must be greater than 0");
    }
    this.accounts = new Account[capacity];
    this.transactionHistory = new ArrayList[capacity]; 
    this.numAccounts = 0;
}

    public void addAccount(Account account) {
        if (numAccounts < accounts.length) {
            accounts[numAccounts] = account;
            transactionHistory[numAccounts] = new ArrayList<>(); 
            numAccounts++;
        } else {
            System.out.println("Maximum account limit reached. Unable to add new accounts.");
        }
    }

    public Account getAccount(int accountNumber) {
        for (int i = 0; i < numAccounts; i++) {
            if (accounts[i].getAccountNumber() == accountNumber) {
                return accounts[i];
            }
        }
        return null; // Account not found
    }

    public Account[] getAllAccounts() {
        return Arrays.copyOf(accounts, numAccounts);
    }

    public void deposit(int accountNumber, double amount) {
        Account account = getAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
            transactionHistory[getAccountIndex(accountNumber)].add(new Transaction(transactionHistory.length + 1, accountNumber, amount, TransactionType.DEPOSIT));
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdraw(int accountNumber, double amount) {
        Account account = getAccount(accountNumber);
        if (account != null) {
            account.withdraw(amount);
            transactionHistory[getAccountIndex(accountNumber)].add(new Transaction(transactionHistory.length + 1, accountNumber, amount, TransactionType.WITHDRAWAL));
        } else {
            System.out.println("Account not found.");
        }
    }

    public List<Transaction> getTransactionHistory(int accountNumber) {
        int index = getAccountIndex(accountNumber);
        if (index != -1) {
            return transactionHistory[index];
        }
        return null;
    }

    private int getAccountIndex(int accountNumber) {
        for (int i = 0; i < numAccounts; i++) {
            if (accounts[i].getAccountNumber() == accountNumber) {
                return i;
            }
        }
        return -1; // Account not found
    }
}
