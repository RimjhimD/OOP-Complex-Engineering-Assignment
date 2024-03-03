import java.util.Date;
import java.util.List;

public class TransactionProcessor {
    private BankAccountCatalog accountsCatalog;

    public TransactionProcessor(BankAccountCatalog accountsCatalog) {
        this.accountsCatalog = accountsCatalog;
    }

    public void depositFunds(int accountId, double amount) {
        try {
            BankAccount account = accountsCatalog.getAccountById(accountId);
            if (amount <= 0) {
                throw new IllegalArgumentException("Amount must be positive for deposit.");
            }
            double newBalance = account.getBalance() + amount;
            account.setBalance(newBalance);
            // No database update in this version
            // Logger.getLogger("TransactionLogger").info("Deposit of $" + amount + " for Account ID " + accountId + " successful.");
            System.out.println("Deposit of $" + amount + " successful. New balance: $" + newBalance);
        } catch (IllegalArgumentException e) {
            System.out.println("Deposit failed: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred during deposit: " + e.getMessage());
        }
    }

    public void withdrawFunds(int accountId, double amount) {
        try {
            BankAccount account = accountsCatalog.getAccountById(accountId);
            if (amount <= 0) {
                throw new IllegalArgumentException("Amount must be positive for withdrawal.");
            }
            if (amount > account.getBalance()) {
                throw new IllegalArgumentException("Insufficient funds for withdrawal.");
            }
            double newBalance = account.getBalance() - amount;
            account.setBalance(newBalance);
            // No database update in this version
            // Logger.getLogger("TransactionLogger").info("Withdrawal of $" + amount + " for Account ID " + accountId + " successful.");
            System.out.println("Withdrawal of $" + amount + " successful. New balance: $" + newBalance);
        } catch (IllegalArgumentException e) {
            System.out.println("Withdrawal failed: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred during withdrawal: " + e.getMessage());
        }
    }

    public void transferFunds(int fromAccountId, int toAccountId, double amount) {
        try {
            BankAccount fromAccount = accountsCatalog.getAccountById(fromAccountId);
            BankAccount toAccount = accountsCatalog.getAccountById(toAccountId);
            if (amount <= 0) {
                throw new IllegalArgumentException("Amount must be positive for transfer.");
            }
            if (amount > fromAccount.getBalance()) {
                throw new IllegalArgumentException("Insufficient funds for transfer.");
            }
            double newFromBalance = fromAccount.getBalance() - amount;
            double newToBalance = toAccount.getBalance() + amount;
            fromAccount.setBalance(newFromBalance);
            toAccount.setBalance(newToBalance);
            // No database update in this version
            // Logger.getLogger("TransactionLogger").info("Transfer of $" + amount + " from Account " + fromAccountId + " to Account " + toAccountId + " successful.");
            System.out.println("Transfer of $" + amount + " from Account " + fromAccountId + " to Account " + toAccountId + " successful.");
            System.out.println("New balance of Account " + fromAccountId + ": $" + newFromBalance);
            System.out.println("New balance of Account " + toAccountId + ": $" + newToBalance);
        } catch (IllegalArgumentException e) {
            System.out.println("Transfer failed: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred during transfer: " + e.getMessage());
        }
    }

    public void generateAccountStatement(int accountId, Date startDate, Date endDate) {
        try {
            // No database retrieval in this version
            // BankAccount account = accountsCatalog.getAccountById(accountId);
            // List<Transaction> transactions = account.getTransactionsInRange(startDate, endDate);
            System.out.println("Account Statement for Account " + accountId + " (Date Range: " + startDate + " to " + endDate + ")");
            // for (Transaction transaction : transactions) {
            //     System.out.println(transaction);
            // }
        } catch (Exception e) {
            System.out.println("Error generating account statement: " + e.getMessage());
        }
    }
}
