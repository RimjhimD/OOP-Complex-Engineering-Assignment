public class SavingsAccount extends Account {

    // interest rate
    private double interestRate;
    private int transactionId;

    // default constructor
    public SavingsAccount() {
        super();
    }

    /**
     * Parameter constructor to initialize Savings account with a customer account
     * number and interest rate
     */
    public SavingsAccount(int accountNumber, double interestRate) {
        super(accountNumber);
        this.interestRate = interestRate;
    }

    // getter function
    public double getInterestRate() {
        return this.interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double calcInterest() {
        return balance * interestRate;
    }

    public void applyInterest() {
        double interest = calcInterest();
        System.out.printf("Interest amount %.2f added to balance%n", interest);
        deposit(interest);

        // Record interest transaction
        recordTransaction(new Transaction(transactionId++, getAccountNumber(), interest, TransactionType.INTEREST));
    }

    /**
     * Function to deposit funds into the account as long as the amount 
     * parameter is > 0
     * Apply Transaction fee for the CheckingAccount
     */
    
    @Override
    public void deposit(double amount) {
        // First Check amount
        if (amount > 0) {
            balance += amount;
            System.out.printf("Amount %.2f deposited%n", amount);
            System.out.printf("Current Balance is: %.2f%n", balance);

            // Record deposit transaction
            recordTransaction(new Transaction(transactionId++, getAccountNumber(), amount, TransactionType.DEPOSIT));
        } else {
            System.out.println("A negative amount cannot be deposited");
        }
    }

    /**
     * Function to withdraw funds from the Account as long as 
     * 1. Amount to withdraw
     * must be > 0
     * 2. Amount to withdraw must be <= balance
     */
    @Override
    public void withdraw(double amount) {
        // Same check
        if (amount > 0) {
            // Check sufficient balance
            if (amount <= balance) {
                System.out.printf("Amount of %.2f withdrawn from Account%n", amount);
                balance -= amount;
                System.out.printf("Current Balance is: %.2f%n", balance);

                // Record withdrawal transaction
                recordTransaction(new Transaction(transactionId++, getAccountNumber(), amount, TransactionType.WITHDRAWAL));
            }
        } else {
            System.out.println("Negative amount cannot be withdrawn!");
        }
    }
}
