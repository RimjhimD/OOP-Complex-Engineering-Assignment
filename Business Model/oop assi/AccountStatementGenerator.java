import java.util.Date;

public class AccountStatementGenerator {
    private BankAccountCatalog accountsCatalog;

    public AccountStatementGenerator(BankAccountCatalog accountsCatalog) {
        this.accountsCatalog = accountsCatalog;
    }

    public void generateAccountStatement(int accountId, Date startDate, Date endDate) {
        try {
            BankAccount account = accountsCatalog.getAccountById(accountId);
            if (account == null) {
                System.out.println("Error: Account not found.");
                return;
            }

            System.out.println("Account Statement for Account ID: " + account.getAccountId());
            System.out.println("Customer Name: " + account.getCustomerName());
            System.out.println("Account Type: " + account.getAccountType()); // Fixed: Use getAccountType() instead of getAccountId()
            System.out.println("Branch Location: " + account.getBranchLocation());
            System.out.println("Start Date: " + startDate);
            System.out.println("End Date: " + endDate);

            // Logic to fetch and display transaction details within the specified date range
            // This logic should be implemented separately based on the actual data source (not included in this example)
            System.out.println("Transaction Details:");
            // Implement logic to fetch and display transaction details from startDate to endDate for the account
        } catch (Exception e) {
            System.out.println("Error generating account statement: " + e.getMessage());
        }
    }
}
