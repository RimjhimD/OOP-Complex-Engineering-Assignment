import java.util.Scanner;

public class BranchLocator {
    private Scanner scanner;

    public BranchLocator() {
        this.scanner = new Scanner(System.in);
    }

    public void displayBranches() {
        System.out.println("\t===================================");
        System.out.println("\t\tCapital Banking Branch Locator");
        System.out.println("\t===================================");
        System.out.println("\t'-->Navigate by inserting index<--'");
        System.out.println("\t1. Dhaka");
        System.out.println("\t2. Chittagong");
        System.out.println("\t3. Rajshahi");
        // Add more branches as needed
        System.out.println("\t===================================");
    }

    public void findNearestBranch() {
        System.out.println("\tInsert number of your current location:");
        int userChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (userChoice) {
            case 1:
                System.out.println("\t===================================");
                System.out.println("\t\tDhaka Branch");
                System.out.println("\t===================================");
                System.out.println("\tAddress: Dhaka, Bangladesh");
                System.out.println("\tCall: +8801XXXXXXXXX");
                System.out.println("\t===================================");
                break;
            case 2:
                System.out.println("\t===================================");
                System.out.println("\t\tChittagong Branch");
                System.out.println("\t===================================");
                System.out.println("\tAddress: Chittagong, Bangladesh");
                System.out.println("\tCall: +8801XXXXXXXXX");
                System.out.println("\t===================================");
                break;
            case 3:
                System.out.println("\t===================================");
                System.out.println("\t\tRajshahi Branch");
                System.out.println("\t===================================");
                System.out.println("\tAddress: Rajshahi, Bangladesh");
                System.out.println("\tCall: +8801XXXXXXXXX");
                System.out.println("\t===================================");
                break;
            // Add more cases for additional branches
            default:
                System.out.println("\tInvalid choice!");
                break;
        }
    }

    public static void main(String[] args) {
        BranchLocator branchLocator = new BranchLocator();
        branchLocator.displayBranches();
        branchLocator.findNearestBranch();
    }
}
