import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    protected int accountNumber;
    protected double balance;
    private List<Transaction> transactions;

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
        this.transactions = new ArrayList<>();
    }

     public Account() {
        this(000);
     }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void recordTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public List<Transaction> getTransactions() {
        return new ArrayList<>(transactions);
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);
}
