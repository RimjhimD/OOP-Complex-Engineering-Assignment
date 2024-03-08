Introduction:

The Bank Management System is a Java application developed as part of the Object-Oriented Programming (OOP) assignment for the CSE 1115 course at Premier University. 
The assignment aimed to apply OOP concepts to design and implement a software system for managing bank accounts, transactions, and transaction history.


Idea Selection:

The idea for the Bank Management System was chosen based on its relevance and complexity, making it suitable for demonstrating various OOP concepts. 
The banking domain offers a wide range of functionalities, including account management, transaction processing, and interest calculations, providing ample opportunities to apply inheritance, polymorphism, and encapsulation principles.


Functionality:

The Bank Management System allows users to perform the following tasks:

Account Creation: Users can create different types of bank accounts, such as checking and savings accounts, by providing relevant details like account number, transaction fee (for checking accounts), and interest rate (for savings accounts).

Transaction Processing: Users can deposit and withdraw funds from their accounts. For checking accounts, a transaction fee is applied to each transaction. Additionally, interest can be applied to savings accounts.

Transaction History: Users can view the transaction history for each account, including details like transaction type, amount, and timestamp.

Menu Interface: The system provides a user-friendly menu interface that guides users through the various functionalities available.


Implementation:

The Bank Management System is implemented in Java, utilizing object-oriented principles such as inheritance, polymorphism, and encapsulation. The system consists of several classes, including Account, CheckingAccount, SavingsAccount, Transaction, TransactionType, Bank, and AccountDriver.

Account: Represents a generic bank account with attributes like account number and balance. It serves as the base class for specific account types like checking and savings accounts.

CheckingAccount and SavingsAccount: Subclasses of the Account class, representing specific types of bank accounts with additional attributes and methods tailored to their respective functionalities.

Transaction: Represents a bank transaction with attributes like transaction ID, account number, amount, type, and timestamp.

TransactionType: An enumeration representing different types of transactions (e.g., deposit, withdrawal, interest).

Bank: Manages a collection of accounts and transaction histories. It provides methods for adding accounts, performing transactions, retrieving accounts, and accessing transaction histories.

AccountDriver: The main class responsible for driving the application, providing a menu interface for users to interact with the system.


Conclusion:

The Bank Management System demonstrates the application of object-oriented principles in designing and implementing a software solution for managing bank accounts. By leveraging inheritance, polymorphism, and encapsulation, the system provides a robust and scalable solution to meet the requirements of modern banking operations.



