import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class CSVWriter {
    private static final String CSV_FILE_PATH = "BankingData.csv";

    public static void writeToCSV(List<BankAccount> accounts) {
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(CSV_FILE_PATH)))) {
            // Write CSV header
            writer.println("Account ID,Customer Name,Balance,Account Type,Branch Location");

            // Write account data
            for (BankAccount account : accounts) {
                writer.println(account.getAccountId() + "," + account.getCustomerName() + ","
                                 + account.getBalance() + "," + account.getAccountType() + ","
                                 + account.getBranchLocation());
            }

            System.out.println("Data has been written to the CSV file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to the CSV file: " + e.getMessage());
        }
    }

    public static void addAccountToCSV(BankAccount account) {
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(CSV_FILE_PATH, true)))) {
            writer.println(account.getAccountId() + "," + account.getCustomerName() + ","
                             + account.getBalance() + "," + account.getAccountType() + ","
                             + account.getBranchLocation());

            System.out.println("New account has been added to the CSV file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to the CSV file: " + e.getMessage());
        }
    }
}
