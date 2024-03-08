import java.util.Scanner;
import java.util.List;

public class AccountDriver {
    
    // Entry point of program
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        
        // Create Bank object to manage accounts
        Bank bank = new Bank(100);

        int choice;

        do {
            choice = menu(keyboard);
            System.out.println();
            
            switch(choice) {
                case 1:
                    bank.addAccount(createAccount(keyboard));
                    break;
                case 2:
                    doDeposit(bank, keyboard);
                    break;
                case 3:
                    doWithdraw(bank, keyboard);
                    break;
                case 4:
                    applyInterest(bank, keyboard);
                    break;
                case 5:
                    printTransactionHistory(bank, keyboard);
                    break;                                                                                               
                case 6:
                    System.out.println("Thank You for using CITY BANK !!!");     
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            System.out.println();
        } while(choice != 6);
        
        keyboard.close(); // Close the scanner
    }

    
    public static int accountMenu(Scanner keyboard) {
        System.out.println("Select Account Type");
        System.out.println("1. Checking Account");
        System.out.println("2. Savings Account");

        int choice;
        do {
            System.out.print("Enter choice: ");
            choice = keyboard.nextInt();
        } while(choice < 1 || choice > 2);
        
        return choice;
    } 

    /**
     * Function to perform Deposit on a selected account
     */
    public static void doDeposit(Bank bank, Scanner keyboard) {
        // Get the account number
        System.out.print("\nPlease enter account number: ");
        int accountNumber = keyboard.nextInt();
    
        Account account = bank.getAccount(accountNumber);
        if (account != null) {
            // Amount
            System.out.print("Please enter Deposit Amount: ");
            double amount = keyboard.nextDouble();
            account.deposit(amount);
            System.out.printf("Deposit of $%.2f successfully made to account %d%n", amount, accountNumber);
        } else {
            System.out.println("No account exist with AccountNumber: " + accountNumber);
        }
    }
    
    public static void doWithdraw(Bank bank, Scanner keyboard) {
        // Get the account number
        System.out.print("\nPlease enter account number: ");
        int accountNumber = keyboard.nextInt();
    
        Account account = bank.getAccount(accountNumber);
        if (account != null) {
            // Amount
            System.out.print("Please enter Withdraw Amount: ");
            double amount = keyboard.nextDouble();
            account.withdraw(amount);
            System.out.printf("Withdrawal of $%.2f successfully made from account %d%n", amount, accountNumber);
        } else {
            System.out.println("No account exist with AccountNumber: " + accountNumber);
        }
    }
    
    public static void applyInterest(Bank bank, Scanner keyboard) {
        // Get the account number
        System.out.print("\nPlease enter account number: ");
        int accountNumber = keyboard.nextInt();
    
        Account account = bank.getAccount(accountNumber);
        if (account != null && account instanceof SavingsAccount) {
            ((SavingsAccount) account).applyInterest();
            System.out.printf("Interest applied to account %d%n", accountNumber);
        } else {
            System.out.println("No or invalid savings account exist with AccountNumber: " + accountNumber);
        }
    }
    
    public static Account createAccount(Scanner keyboard) {
        Account account = null;
        int choice = accountMenu(keyboard);
    
        int accountNumber;
        System.out.print("Enter Account Number: ");
        accountNumber = keyboard.nextInt();
    
        if (choice == 1) { // checking account
            System.out.print("Enter Transaction Fee: ");
            double fee = keyboard.nextDouble();
            account = new CheckingAccount(accountNumber, fee);
            System.out.printf("Checking Account created with Account Number: %d and Transaction Fee: $%.2f%n", accountNumber, fee);
        } else { // savings account
            System.out.print("Please enter Interest Rate: ");
            double ir = keyboard.nextDouble();
            account = new SavingsAccount(accountNumber, ir);
            System.out.printf("Savings Account created with Account Number: %d and Interest Rate: %.2f%%%n", accountNumber, ir);
        }
        return account;
    }
    
    public static void printTransactionHistory(Bank bank, Scanner keyboard) {
        // Get the account number
        System.out.print("\nPlease enter account number: ");
        int accountNumber = keyboard.nextInt();
    
        Account account = bank.getAccount(accountNumber);
        if (account != null) {
            List<Transaction> transactions = account.getTransactions();
            System.out.println("Transaction History for Account " + accountNumber + ":");
            for (Transaction transaction : transactions) {
                System.out.println(transaction); 
            }
        } else {
            System.out.println("No account exist with AccountNumber: " + accountNumber);
        }
    }

    /**
     * Menu to display options and get the user's selection
     */
    public static int menu(Scanner keyboard) {
        System.out.println("Bank Account Menu");
        System.out.println("1. Create New Account");
        System.out.println("2. Deposit Funds");
        System.out.println("3. Withdraw Funds");
        System.out.println("4. Apply Interest");
        System.out.println("5. Show Transaction History");
        System.out.println("6. Quit");

        int choice;

        do {
            System.out.print("Enter choice: ");
            choice = keyboard.nextInt();
        } while(choice < 1 || choice > 6);

        return choice;
    }    
}
