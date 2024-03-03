public class BankAccount {
    private final int accountId;
    private final String customerName;
    private double balance;
    private final String accountType;
    private final String branchLocation;

    public BankAccount(int accountId, String customerName, double balance, String accountType, String branchLocation) {
        if (accountId <= 0) {
            throw new IllegalArgumentException("Account ID must be a positive integer.");
        }
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative.");
        }
        if (accountType == null || accountType.isEmpty()) {
            throw new IllegalArgumentException("Account type cannot be null or empty.");
        }
        if (branchLocation == null || branchLocation.isEmpty()) {
            throw new IllegalArgumentException("Branch location cannot be null or empty.");
        }

        this.accountId = accountId;
        this.customerName = customerName;
        this.balance = balance;
        this.accountType = accountType;
        this.branchLocation = branchLocation;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getBranchLocation() {
        return branchLocation;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountId=" + accountId +
                ", customerName='" + customerName + '\'' +
                ", balance=" + balance +
                ", accountType='" + accountType + '\'' +
                ", branchLocation='" + branchLocation + '\'' +
                '}';
    }

    public void setBalance(double newFromBalance) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setBalance'");
    }
}
