import java.util.Scanner;

public class CustomerInterface {
    
    private Scanner scanner;

    public CustomerInterface() {
        this.scanner = new Scanner(System.in);
    }

    public void displayWelcomeMessage() {
        System.out.println("Welcome to Capital Banking!");
    }

    public void displayMainMenu() {
        System.out.println("Please select an option:");
        System.out.println("1. Create New Account");
        System.out.println("2. Deposit Funds");
        System.out.println("3. Withdraw Funds");
        System.out.println("4. Transfer Funds");
        System.out.println("5. View Account Information");
        System.out.println("6. Exit");
    }

    public int getCustomerChoice() {
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    public void processCustomerChoice(int choice) {
        switch (choice) {
            case 1:
                createNewAccount();
                break;
            case 2:
                depositFunds();
                break;
            case 3:
                withdrawFunds();
                break;
            case 4:
                transferFunds();
                break;
            case 5:
                viewAccountInformation();
                break;
            case 6:
                System.out.println("Thank you for using Capital Banking. Goodbye!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private void createNewAccount() {
        // Implement logic to create a new account
        System.out.println("Creating a new account...");
    }

    private void depositFunds() {
        // Implement logic to deposit funds into an account
        System.out.println("Depositing funds...");
    }

    private void withdrawFunds() {
        // Implement logic to withdraw funds from an account
        System.out.println("Withdrawing funds...");
    }

    private void transferFunds() {
        // Implement logic to transfer funds between accounts
        System.out.println("Transferring funds...");
    }

    private void viewAccountInformation() {
        // Implement logic to view account information
        System.out.println("Viewing account information...");
    }

    public static void main(String[] args) {
        CustomerInterface customerInterface = new CustomerInterface();
        customerInterface.displayWelcomeMessage();

        while (true) {
            customerInterface.displayMainMenu();
            int choice = customerInterface.getCustomerChoice();
            customerInterface.processCustomerChoice(choice);
        }
    }
}

