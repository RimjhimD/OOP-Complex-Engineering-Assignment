public class Validator {
    // Method to validate if a given string is a valid account number
    public static boolean isValidAccountNumber(String accountNumber) {
        // Implement validation logic for account number format
        // For example, check if the account number consists of digits only and has a specific length
        return accountNumber.matches("\\d{10}"); // Example: Account number must be 10 digits long
    }

    // Method to validate if a given double value is a valid transaction amount
    public static boolean isValidTransactionAmount(double amount) {
        // Implement validation logic for transaction amount
        // For example, check if the amount is greater than zero
        return amount > 0;
    }

    // Method to validate if a given string is a valid email address
    public static boolean isValidEmailAddress(String email) {
        // Implement validation logic for email address format
        // For example, check if the email matches a valid email pattern
        return email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
    }

    // Method to validate if a given string is a valid phone number
    public static boolean isValidPhoneNumber(String phoneNumber) {
        // Implement validation logic for phone number format
        // For example, check if the phone number matches a valid phone number pattern
        return phoneNumber.matches("\\d{10}"); // Example: Phone number must be 10 digits long
    }

    // Add more validation methods as needed for different types of inputs
}
