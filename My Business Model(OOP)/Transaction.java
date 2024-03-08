import java.time.LocalDateTime;
import java.time.ZoneId;

public class Transaction {
    private int transactionId;
    private int accountNumber;
    private double amount;
    private TransactionType type;
    private LocalDateTime timestamp;

    public Transaction(int transactionId, int accountNumber, double amount, TransactionType type) {
        this.transactionId = transactionId;
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.type = type;
        this.timestamp = LocalDateTime.now(ZoneId.of("Asia/Dhaka")); // Set to Bangladesh time zone
    }

    // Getters for transaction details
    public int getTransactionId() {
        return transactionId;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public TransactionType getType() {
        return type;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Transaction ID: " + transactionId +
                ", Type: " + type +
                ", Amount: $" + amount +
                ", Timestamp: " + timestamp;
    }
}
